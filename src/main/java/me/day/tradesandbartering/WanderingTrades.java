package me.day.tradesandbartering;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

public class WanderingTrades {
    public static void registerWanderingTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 5), new ItemStack(Items.TURTLE_EGG), 10,5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 5), new ItemStack(Items.PITCHER_POD, 1), 10,5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 5), new ItemStack(Items.TORCHFLOWER_SEEDS, 1), 10,5,0.05F));

            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 3), new ItemStack(Items.GOLDEN_APPLE, 1), 10,5,0.05F));

            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.EXPERIENCE_BOTTLE, 4), 10,5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.HONEYCOMB, 3), 10,5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.HONEY_BOTTLE, 1), 10,5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.FEATHER, 5), 10,5,0.05F));
        });

        TradeOfferHelper.registerWanderingTraderOffers(2, factories -> {
            // factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 64), new ItemStack(Items.TOTEM_OF_UNDYING), 10,5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 32), new ItemStack(Items.SNIFFER_EGG, 1), 10,5,0.05F));

            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 10), new ItemStack(Items.CREEPER_HEAD, 1), 3,5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 10), new ItemStack(Items.ZOMBIE_HEAD, 1), 3,5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 10), new ItemStack(Items.SKELETON_SKULL, 1), 3,5,0.05F));
            // factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 10), new ItemStack(Items.WITHER_SKELETON_SKULL), 3,5,0.05F));
        });
    }
}
