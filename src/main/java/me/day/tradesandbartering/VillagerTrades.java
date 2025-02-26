package me.day.tradesandbartering;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

import java.util.Optional;

public class VillagerTrades {
    private static void ArmorerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 4), new ItemStack(Items.GOLDEN_HELMET), 12, 1,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.GOLDEN_CHESTPLATE), 12, 1,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 6), new ItemStack(Items.GOLDEN_LEGGINGS), 12, 1,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 4), new ItemStack(Items.GOLDEN_BOOTS), 12, 1,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.REDSTONE, 20), new ItemStack(Items.EMERALD), 16, 2,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.COPPER_INGOT, 6), new ItemStack(Items.EMERALD), 16, 2,0.05F));
        });
    }

    private static void ButcherTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.CHICKEN, 5), 12, 5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.MUTTON, 5), 12, 5,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.BEEF, 5), 12, 5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.PORKCHOP, 5), 12, 5,0.05F));
        });
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

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.GUNPOWDER, 16), new ItemStack(Items.EMERALD), 16, 2,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.DISC_FRAGMENT_5), new ItemStack(Items.EMERALD), 4, 20,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.ECHO_SHARD), new ItemStack(Items.EMERALD), 4, 20,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.SLIME_BALL), 8, 15,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.PHANTOM_MEMBRANE), 8, 30,0.05F));
        });
    }

    private static void FarmerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.CACTUS, 32), new ItemStack(Items.EMERALD), 16, 2,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.GLOW_BERRIES, 16), new ItemStack(Items.EMERALD), 16, 5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.SUGAR_CANE, 32), new ItemStack(Items.EMERALD), 16, 2,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.MOSS_BLOCK, 8), new ItemStack(Items.EMERALD), 16, 5,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.BROWN_MUSHROOM, 32), new ItemStack(Items.EMERALD), 16, 6,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.RED_MUSHROOM, 32), new ItemStack(Items.EMERALD), 16, 6,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 10), new ItemStack(Items.GOLDEN_APPLE), 12, 30,0.05F));
        });
    }

    private static void FishermanTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.WATER_BUCKET), 6, 3,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.SEAGRASS, 16), new ItemStack(Items.EMERALD), 16, 10,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.SEA_PICKLE, 12), new ItemStack(Items.EMERALD), 16, 10,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 22), new ItemStack(Items.AXOLOTL_BUCKET), 3, 30,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 48), new ItemStack(Items.HEART_OF_THE_SEA), 1, 30,0.05F));
        });
    }

    private static void FletcherTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.SPECTRAL_ARROW, 8), 12, 4,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 12), new ItemStack(Items.DISPENSER), 12, 15,0.05F));
        });
    }

    private static void LeatherWorkerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 30), new ItemStack(Items.DIAMOND_HORSE_ARMOR), 3, 30,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 22), new ItemStack(Items.GOLDEN_HORSE_ARMOR), 3, 20,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.IRON_HORSE_ARMOR), 3, 10,0.05F));
        });
    }

    private static void LibrarianTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 40), new ItemStack(Items.BAMBOO), 16, 1,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.GLOW_INK_SAC, 4), new ItemStack(Items.EMERALD), 12, 10,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.GHAST_TEAR), 12, 10,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 20), new ItemStack(Items.DRAGON_BREATH), 12, 30,0.05F));
        });
    }

    private static void MasonTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.SAND, 16), new ItemStack(Items.EMERALD), 12, 2,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.AMETHYST_BLOCK, 10), new ItemStack(Items.EMERALD), 10, 3,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.CALCITE, 10), new ItemStack(Items.EMERALD), 10, 3,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.TUFF, 10), new ItemStack(Items.EMERALD), 10, 3,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.DEEPSLATE, 10), new ItemStack(Items.EMERALD), 10, 5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.DRIPSTONE_BLOCK, 10), new ItemStack(Items.EMERALD), 10, 5,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.PRISMARINE), 16, 5,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.PRISMARINE, 8), Optional.of(new TradedItem(Items.EMERALD)), new ItemStack(Items.DARK_PRISMARINE, 8), 16, 10,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.QUARTZ_BRICKS), 16, 10,0.05F));
        });
    }

    private static void ShepherdTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.WHITE_WOOL, 8), Optional.of(new TradedItem(Items.EMERALD)), new ItemStack(Items.BLUE_WOOL, 8), 16, 10,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.WHITE_WOOL, 8), Optional.of(new TradedItem(Items.EMERALD)), new ItemStack(Items.GREEN_WOOL, 8), 16, 10,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.WHITE_WOOL, 8), Optional.of(new TradedItem(Items.EMERALD)), new ItemStack(Items.BROWN_WOOL, 8), 16, 10,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.WHITE_WOOL, 8), Optional.of(new TradedItem(Items.EMERALD)), new ItemStack(Items.BLACK_WOOL, 8), 16, 10,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.COPPER_INGOT, 6), new ItemStack(Items.EMERALD), 12, 3,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD), new ItemStack(Items.GOLDEN_HORSE_ARMOR), 8, 3,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_SHOVEL), 12, 3,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 4), new ItemStack(Items.GOLDEN_AXE), 12, 3,0.05F));
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 5), new ItemStack(Items.GOLDEN_PICKAXE), 12, 3,0.05F));

        });
    }

    private static void ToolSmithTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.IRON_HOE), 12, 10,0.05F));
        });
    }

    private static void WeaponSmithTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.COPPER_INGOT, 6), new ItemStack(Items.EMERALD), 12, 6,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.FLINT_AND_STEEL), 12, 6,0.05F));
        });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.ANCIENT_DEBRIS), new ItemStack(Items.IRON_HOE), 16, 15,0.05F));
        });
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
