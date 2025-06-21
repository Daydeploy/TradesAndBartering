package me.day.tradesandbartering.utils;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import org.jetbrains.annotations.ApiStatus;

import java.util.List;
import java.util.function.Consumer;

public class MerchantOfferHelper {
    private MerchantOfferHelper() {
    }

    /**
     * Registers trade offer factories for use by villagers.
     * This adds the same trade offers to current and rebalanced trades.
     *
     * <p>Below is an example, of registering a trade offer factory to be added a blacksmith with a profession level of 3:
     * <blockquote><pre>
     * TradeOfferHelper.registerVillagerOffers(VillagerProfession.BLACKSMITH, 3, factories -> {
     * 	factories.add(new CustomTradeFactory(...);
     * });
     * </pre></blockquote>
     *
     * @param profession the villager profession to assign the trades to
     * @param level      the profession level the villager must be to offer the trades
     * @param factories  a consumer to provide the factories
     */
    public static void registerVillagerOffers(ResourceKey<VillagerProfession> profession, int level, Consumer<List<VillagerTrades.ItemListing>> factories) {
        MerchantOfferInternals.registerVillagerOffers(profession, level, (trades, rebalanced) -> factories.accept(trades));
    }

    /**
     * Registers trade offer factories for use by wandering trades.
     *
     * @param factory a consumer to add trade offers
     */
    public static synchronized void registerWanderingTraderOffers(Consumer<WanderingTraderOffersBuilder> factory) {
        factory.accept(new MerchantOfferInternals.WanderingTraderOffersBuilderImpl());
    }

    @FunctionalInterface
    public interface VillagerOffersAdder {
        void onRegister(List<VillagerTrades.ItemListing> factories, boolean rebalanced);
    }

    /**
     * A builder for wandering trader offers.
     *
     * @see #registerWanderingTraderOffers(Consumer)
     */
    @ApiStatus.NonExtendable
    public interface WanderingTraderOffersBuilder {
        /**
         * The pool ID for the "buy items" pool.
         * Two trade offers are picked from this pool.
         *
         * <p>In vanilla, this pool contains offers to buy water buckets, baked potatoes, etc.
         * for emeralds.
         */
        ResourceLocation BUY_ITEMS_POOL = ResourceLocation.withDefaultNamespace("buy_items");
        /**
         * The pool ID for the "sell special items" pool.
         * Two trade offers are picked from this pool.
         *
         * <p>In vanilla, this pool contains offers to sell logs, enchanted iron pickaxes, etc.
         */
        ResourceLocation SELL_SPECIAL_ITEMS_POOL = ResourceLocation.withDefaultNamespace("sell_special_items");
        /**
         * The pool ID for the "sell common items" pool.
         * Five trade offers are picked from this pool.
         *
         * <p>In vanilla, this pool contains offers to sell flowers, saplings, etc.
         */
        ResourceLocation SELL_COMMON_ITEMS_POOL = ResourceLocation.withDefaultNamespace("sell_common_items");

        /**
         * Adds trade offers to an existing pool identified by an ID.
         *
         * <p>See the constants for vanilla trade offer pool IDs that are always available.
         *
         * @param pool      the pool ID
         * @param factories the trade offer factories
         * @throws IndexOutOfBoundsException if {@code pool} is out of bounds
         */
        void addOffersToPool(ResourceLocation pool, VillagerTrades.ItemListing... factories);
    }
}