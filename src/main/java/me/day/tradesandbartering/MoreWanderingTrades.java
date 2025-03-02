package me.day.tradesandbartering;

import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.WandererTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = TradesAndBartering.MOD_ID)
public class MoreWanderingTrades {
    @SubscribeEvent
    public static void registerWanderingTrades(WandererTradesEvent wandererTradesEvent) {
        List<VillagerTrades.ItemListing> genericTrades = wandererTradesEvent.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = wandererTradesEvent.getRareTrades();

        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.TURTLE_EGG), 10, 1, 0.0F));
        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.TADPOLE_BUCKET), 4, 1, 0.0F));
        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.AXOLOTL_BUCKET), 4, 1, 0.0F));
        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.GOLDEN_APPLE), 8, 1, 0.0F));

        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 3), new ItemStack(Items.PITCHER_POD), 3, 1, 0.0F));
        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 3), new ItemStack(Items.TORCHFLOWER_SEEDS), 3, 1, 0.0F));

        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.ARMADILLO_SCUTE), 12, 1, 0.0F));
        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.EXPERIENCE_BOTTLE), 6, 1, 0.0F));
        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.HONEYCOMB, 3), 12, 1, 0.0F));
        genericTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.HONEY_BOTTLE), 6, 1, 0.0F));

        rareTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 32), new ItemStack(Items.HEART_OF_THE_SEA), 1, 1, 0.0F));

        rareTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 12), new ItemStack(Items.CREEPER_HEAD), 1, 1, 0.0F));
        rareTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 12), new ItemStack(Items.SKELETON_SKULL), 1, 1, 0.0F));
        rareTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 12), new ItemStack(Items.ZOMBIE_HEAD), 1, 1, 0.0F));

        rareTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.PEARLESCENT_FROGLIGHT), 3, 1, 0.0F));
        rareTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.OCHRE_FROGLIGHT), 3, 1, 0.0F));
        rareTrades.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.VERDANT_FROGLIGHT), 3, 1, 0.0F));
    }
}
