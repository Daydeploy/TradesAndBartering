package me.day.tradesandbartering.utils;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.function.Consumer;

public class MerchantOfferInternals {
    private MerchantOfferInternals() {
    }

    /**
     * Make the rebalanced profession map modifiable, then copy all vanilla
     * professions' trades to prevent modifications from propagating to the rebalanced one.
     */
    private static void initVillagerTrades() {
        if (!(VillagerTrades.EXPERIMENTAL_TRADES instanceof HashMap)) {

            for (Map.Entry<ResourceKey<VillagerProfession>, Int2ObjectMap<VillagerTrades.ItemListing[]>> trade : VillagerTrades.TRADES.entrySet()) {
                if (!VillagerTrades.EXPERIMENTAL_TRADES.containsKey(trade.getKey()))
                    VillagerTrades.EXPERIMENTAL_TRADES.put(trade.getKey(), trade.getValue());
            }
        }
    }

    // synchronized guards against concurrent modifications - Vanilla does not mutate the underlying arrays (as of 1.16),
    // so reads will be fine without locking.
    public static synchronized void registerVillagerOffers(ResourceKey<VillagerProfession> profession, int level, MerchantOfferHelper.VillagerOffersAdder factory) {
        Objects.requireNonNull(profession, "VillagerProfession may not be null.");
        initVillagerTrades();
        registerOffers(VillagerTrades.TRADES.computeIfAbsent(profession, key -> new Int2ObjectOpenHashMap<>()), level, trades -> factory.onRegister(trades, false));
        registerOffers(VillagerTrades.EXPERIMENTAL_TRADES.computeIfAbsent(profession, key -> new Int2ObjectOpenHashMap<>()), level, trades -> factory.onRegister(trades, true));
    }

    private static void registerOffers(Int2ObjectMap<VillagerTrades.ItemListing[]> leveledTradeMap, int level, Consumer<List<VillagerTrades.ItemListing>> factory) {
        final List<VillagerTrades.ItemListing> list = new ArrayList<>();
        factory.accept(list);

        final VillagerTrades.ItemListing[] originalEntries = leveledTradeMap.computeIfAbsent(level, key -> new VillagerTrades.ItemListing[0]);
        final VillagerTrades.ItemListing[] addedEntries = list.toArray(new VillagerTrades.ItemListing[0]);

        final VillagerTrades.ItemListing[] allEntries = ArrayUtils.addAll(originalEntries, addedEntries);
        leveledTradeMap.put(level, allEntries);
    }

    public static class WanderingTraderOffersBuilderImpl implements MerchantOfferHelper.WanderingTraderOffersBuilder {
        private static final Object2IntMap<ResourceLocation> ID_TO_INDEX = Util.make(new Object2IntOpenHashMap<>(), idToIndex -> {
            idToIndex.put(BUY_ITEMS_POOL, 0);
            idToIndex.put(SELL_SPECIAL_ITEMS_POOL, 1);
            idToIndex.put(SELL_COMMON_ITEMS_POOL, 2);
        });

        private static final Map<ResourceLocation, VillagerTrades.ItemListing[]> DELAYED_MODIFICATIONS = new HashMap<>();

        @Override
        public void addOffersToPool(ResourceLocation pool, VillagerTrades.ItemListing... factories) {
            if (!ID_TO_INDEX.containsKey(pool)) {
                DELAYED_MODIFICATIONS.compute(pool, (id, current) -> {
                    if (current == null) return factories;

                    return ArrayUtils.addAll(current, factories);
                });
                return;
            }

            int poolIndex = ID_TO_INDEX.getInt(pool);
            Pair<VillagerTrades.ItemListing[], Integer> poolPair = VillagerTrades.WANDERING_TRADER_TRADES.get(poolIndex);
            VillagerTrades.ItemListing[] modified = ArrayUtils.addAll(poolPair.getLeft(), factories);
            VillagerTrades.WANDERING_TRADER_TRADES.set(poolIndex, Pair.of(modified, poolPair.getRight()));
        }
    }
}