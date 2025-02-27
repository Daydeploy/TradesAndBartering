package me.day.tradesandbartering;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

import java.util.Optional;

public class VillagerTrades {
    private static void ArmorerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 3), new ItemStack(Items.GOLDEN_HELMET), 12, 1,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 7), new ItemStack(Items.GOLDEN_CHESTPLATE), 12, 1,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 5), new ItemStack(Items.GOLDEN_LEGGINGS), 12, 1,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_BOOTS), 12, 1,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.REDSTONE, 15), new ItemStack(Items.EMERALD), 16, 2,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.COPPER_INGOT, 4), new ItemStack(Items.EMERALD), 12, 10,0.05F)));
    }

    private static void ButcherTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 3, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.COOKED_RABBIT, 5), 16, 5,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.MUTTON, 5), 16, 5,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.BEEF, 5), 12, 5,0.05F)));
    }

    private static void CartographerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.CREEPER_BANNER_PATTERN), 12, 30,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.FLOWER_BANNER_PATTERN), 12, 30,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.MOJANG_BANNER_PATTERN), 12, 30,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.PIGLIN_BANNER_PATTERN), 12, 30,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.SKULL_BANNER_PATTERN), 12, 30,0.05F));
        });
    }

    private static void ClericTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1, factories -> {
            factories.add(((entity, random) -> new TradeOffer(new TradedItem(Items.BONE, 32), new ItemStack(Items.EMERALD), 16, 2, 0.05F)));
            factories.add(((entity, random) -> new TradeOffer(new TradedItem(Items.STRING, 32), new ItemStack(Items.EMERALD), 16, 2, 0.05F)));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 2, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.GUNPOWDER, 16), new ItemStack(Items.EMERALD), 12, 5,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.DISC_FRAGMENT_5), new ItemStack(Items.EMERALD), 3, 20,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.ECHO_SHARD), new ItemStack(Items.EMERALD), 3, 20,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.SLIME_BALL), 12, 15,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.GHAST_TEAR), 12, 15,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 5, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.PHANTOM_MEMBRANE), 12, 30,0.2F)));
    }

    private static void FarmerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.CACTUS, 32), new ItemStack(Items.EMERALD), 16, 10,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.COCOA_BEANS, 32), new ItemStack(Items.EMERALD), 16, 10,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.SUGAR_CANE, 32), new ItemStack(Items.EMERALD), 16, 10,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.MOSS_BLOCK, 16), new ItemStack(Items.EMERALD), 12, 15,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.BROWN_MUSHROOM, 32), new ItemStack(Items.EMERALD), 12, 20,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.RED_MUSHROOM, 32), new ItemStack(Items.EMERALD), 12, 20,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 10), new ItemStack(Items.GOLDEN_APPLE), 12, 30,0.05F)));
    }

    private static void FishermanTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.WATER_BUCKET), 16, 1,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.SEAGRASS, 16), new ItemStack(Items.EMERALD), 16, 10,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.SEA_PICKLE, 12), new ItemStack(Items.EMERALD), 16, 10,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 24), new ItemStack(Items.AXOLOTL_BUCKET), 3, 30,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 48), new ItemStack(Items.HEART_OF_THE_SEA), 1, 30,0.2F));
        });
    }

    private static void FletcherTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.SPECTRAL_ARROW, 8), 12, 10,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 5, factories -> factories.add(new TradeOffers.SellPotionHoldingItemFactory(Items.SPECTRAL_ARROW, 5,Items.TIPPED_ARROW, 5, 1, 12, 30)));
    }

    private static void LeatherWorkerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 3, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.BUNDLE), 3, 10,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 32), new ItemStack(Items.DIAMOND_HORSE_ARMOR), 3, 30,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 24), new ItemStack(Items.GOLDEN_HORSE_ARMOR), 3, 30,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.IRON_HORSE_ARMOR), 3, 30,0.2F));
        });
    }

    private static void LibrarianTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.BAMBOO, 48), new ItemStack(Items.EMERALD), 16, 2,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 3, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.GLOW_INK_SAC, 4), new ItemStack(Items.EMERALD), 12, 20,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 20), new ItemStack(Items.DRAGON_BREATH), 12, 30,0.05F)));
    }

    private static void MasonTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.SAND, 16), new ItemStack(Items.EMERALD), 12, 2,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.RED_SAND, 16), new ItemStack(Items.EMERALD), 12, 2,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.AMETHYST_BLOCK, 16), new ItemStack(Items.EMERALD), 12, 10,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.CALCITE, 16), new ItemStack(Items.EMERALD), 12, 10,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.TUFF, 16), new ItemStack(Items.EMERALD), 12, 10,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.DEEPSLATE, 20), new ItemStack(Items.EMERALD), 12, 20,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.DRIPSTONE_BLOCK, 16), new ItemStack(Items.EMERALD), 12, 20,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.PRISMARINE), 12, 20,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.PRISMARINE, 8), Optional.of(new TradedItem(Items.EMERALD)), new ItemStack(Items.DARK_PRISMARINE, 8), 16, 10,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.QUARTZ_BRICKS), 12, 30,0.05F)));
    }

    private static void ShepherdTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.WOLF_ARMOR), 3, 30,0.05F)));
    }

    private static void ToolSmithTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.COPPER_INGOT, 4), new ItemStack(Items.EMERALD), 12, 2,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_HOE), 12, 1,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_SHOVEL), 12, 1,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_AXE), 12, 1,0.2F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_PICKAXE), 12, 1,0.2F));

        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.IRON_HOE), 3, 10,0.2F)));
    }

    private static void WeaponSmithTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.SHIELD), 12, 1,0.2F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.COPPER_INGOT, 4), new ItemStack(Items.EMERALD), 12, 10,0.05F)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3, factories -> factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.FLINT_AND_STEEL), 12, 10,0.05F)));
    }


    public static void registerVillagerTrades() {
        ArmorerTrades();
        ButcherTrades();
        CartographerTrades();
        ClericTrades();
        FarmerTrades();
        FishermanTrades();
        FletcherTrades();
        LeatherWorkerTrades();
        LibrarianTrades();
        MasonTrades();
        ShepherdTrades();
        ToolSmithTrades();
        WeaponSmithTrades();
    }
}
