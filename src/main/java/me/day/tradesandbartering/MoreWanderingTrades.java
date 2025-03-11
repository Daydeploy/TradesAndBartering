package me.day.tradesandbartering;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class MoreWanderingTrades {
    public static void registerWanderingTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.TURTLE_EGG), 10, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.TADPOLE_BUCKET), 4, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.AXOLOTL_BUCKET), 4, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.GOLDEN_APPLE), 8, 1, 0.0F));

            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.PITCHER_POD), 3, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 3), new ItemStack(Items.TORCHFLOWER_SEEDS), 3, 1, 0.0F));

            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD), new ItemStack(Items.SCUTE), 12, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD), new ItemStack(Items.EXPERIENCE_BOTTLE), 6, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD), new ItemStack(Items.HONEYCOMB, 3), 12, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD), new ItemStack(Items.HONEY_BOTTLE), 6, 1, 0.0F));
        });

        TradeOfferHelper.registerWanderingTraderOffers(2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 32), new ItemStack(Items.HEART_OF_THE_SEA), 1, 1, 0.0F));

            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 12), new ItemStack(Items.CREEPER_HEAD), 1, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 12), new ItemStack(Items.SKELETON_SKULL), 1, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 12), new ItemStack(Items.ZOMBIE_HEAD), 1, 1, 0.0F));

            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.PEARLESCENT_FROGLIGHT), 3, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.OCHRE_FROGLIGHT), 3, 1, 0.0F));
            factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.VERDANT_FROGLIGHT), 3, 1, 0.0F));
        });
    }
}
