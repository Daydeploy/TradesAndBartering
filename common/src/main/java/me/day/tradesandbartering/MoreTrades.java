package me.day.tradesandbartering;

import me.day.tradesandbartering.utils.MerchantOfferHelper;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;

import java.util.Optional;

public class MoreTrades {
    public static void registerTrades() {
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
        WanderingTrades();
    }

    private static void ArmorerTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 3), new ItemStack(Items.GOLDEN_HELMET), 12, 1, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 7), new ItemStack(Items.GOLDEN_CHESTPLATE), 12, 1, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.GOLDEN_LEGGINGS), 12, 1, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_BOOTS), 12, 1, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.REDSTONE, 15), new ItemStack(Items.EMERALD), 16, 2, 0.05F));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.COPPER_INGOT, 4), new ItemStack(Items.EMERALD), 12, 10, 0.05F)));
    }

    private static void ButcherTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 3, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.COOKED_RABBIT, 5), 16, 10, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.MUTTON, 5), 16, 15, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.COOKED_BEEF, 5), 12, 30, 0.05F)));
    }

    private static void CartographerTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 5, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.CREEPER_BANNER_PATTERN), 12, 30, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.FLOWER_BANNER_PATTERN), 12, 30, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.MOJANG_BANNER_PATTERN), 12, 30, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.PIGLIN_BANNER_PATTERN), 12, 30, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.SKULL_BANNER_PATTERN), 12, 30, 0.05F));
        });
    }

    private static void ClericTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 1, factories -> {
            factories.add(((entity, random) -> new MerchantOffer(new ItemCost(Items.BONE, 32), new ItemStack(Items.EMERALD), 16, 2, 0.05F)));
            factories.add(((entity, random) -> new MerchantOffer(new ItemCost(Items.STRING, 32), new ItemStack(Items.EMERALD), 16, 2, 0.05F)));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 2, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.GUNPOWDER, 16), new ItemStack(Items.EMERALD), 12, 10, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 3, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.DISC_FRAGMENT_5), new ItemStack(Items.EMERALD), 3, 20, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.ECHO_SHARD), new ItemStack(Items.EMERALD), 3, 20, 0.05F));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.SLIME_BALL), 12, 15, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.GHAST_TEAR), 12, 15, 0.05F));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 5, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.PHANTOM_MEMBRANE), 12, 30, 0.2F)));
    }

    private static void FarmerTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.CACTUS, 32), new ItemStack(Items.EMERALD), 16, 10, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.COCOA_BEANS, 32), new ItemStack(Items.EMERALD), 16, 10, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.SUGAR_CANE, 32), new ItemStack(Items.EMERALD), 16, 10, 0.05F));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.MOSS_BLOCK, 16), new ItemStack(Items.EMERALD), 12, 15, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 4, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.BROWN_MUSHROOM, 32), new ItemStack(Items.EMERALD), 12, 30, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.RED_MUSHROOM, 32), new ItemStack(Items.EMERALD), 12, 30, 0.05F));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 10), new ItemStack(Items.GOLDEN_APPLE), 12, 30, 0.05F)));
    }

    private static void FishermanTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 1, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.WATER_BUCKET), 16, 1, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 2, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.SEAGRASS, 16), new ItemStack(Items.EMERALD), 16, 10, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.SEA_PICKLE, 12), new ItemStack(Items.EMERALD), 16, 10, 0.05F));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 5, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 24), new ItemStack(Items.AXOLOTL_BUCKET), 3, 30, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 48), new ItemStack(Items.HEART_OF_THE_SEA), 1, 30, 0.2F));
        });
    }

    private static void FletcherTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.SPECTRAL_ARROW, 8), 12, 10, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 5, factories -> factories.add(new VillagerTrades.TippedArrowForItemsAndEmeralds(Items.SPECTRAL_ARROW, 5, Items.TIPPED_ARROW, 5, 1, 12, 30)));
    }

    private static void LeatherWorkerTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 3, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.BUNDLE), 3, 10, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 5, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 32), new ItemStack(Items.DIAMOND_HORSE_ARMOR), 3, 30, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 24), new ItemStack(Items.GOLDEN_HORSE_ARMOR), 3, 30, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 16), new ItemStack(Items.IRON_HORSE_ARMOR), 3, 30, 0.2F));
        });
    }

    private static void LibrarianTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.BAMBOO, 48), new ItemStack(Items.EMERALD), 16, 2, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 3, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.GLOW_INK_SAC, 4), new ItemStack(Items.EMERALD), 12, 20, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 20), new ItemStack(Items.DRAGON_BREATH), 12, 30, 0.05F)));
    }

    private static void MasonTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.SAND, 16), new ItemStack(Items.EMERALD), 12, 2, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.RED_SAND, 16), new ItemStack(Items.EMERALD), 12, 2, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.DECORATED_POT, 2), 12, 1, 0.05F));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 2, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.AMETHYST_BLOCK, 16), new ItemStack(Items.EMERALD), 12, 10, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.CALCITE, 16), new ItemStack(Items.EMERALD), 12, 10, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.TUFF, 16), new ItemStack(Items.EMERALD), 12, 10, 0.05F));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.DEEPSLATE, 20), new ItemStack(Items.EMERALD), 12, 20, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.DRIPSTONE_BLOCK, 16), new ItemStack(Items.EMERALD), 12, 20, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.PRISMARINE), 12, 10, 0.05F));
        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.PRISMARINE, 8), Optional.of(new ItemCost(Items.EMERALD)), new ItemStack(Items.DARK_PRISMARINE, 8), 16, 30, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 5, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.QUARTZ_BRICKS), 12, 30, 0.05F)));
    }

    private static void ShepherdTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.WOLF_ARMOR), 3, 20, 0.05F)));
    }

    private static void ToolSmithTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2, factories -> {
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.COPPER_INGOT, 4), new ItemStack(Items.EMERALD), 12, 2, 0.05F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_HOE), 12, 1, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_SHOVEL), 12, 1, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_AXE), 12, 1, 0.2F));
            factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_PICKAXE), 12, 1, 0.2F));

        });

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.IRON_HOE), 3, 10, 0.2F)));
    }

    private static void WeaponSmithTrades() {
        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.SHIELD), 12, 1, 0.2F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.COPPER_INGOT, 4), new ItemStack(Items.EMERALD), 12, 10, 0.05F)));

        MerchantOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3, factories -> factories.add((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.FLINT_AND_STEEL), 12, 10, 0.05F)));
    }

    private static void WanderingTrades() {
        MerchantOfferHelper.registerWanderingTraderOffers(factories -> {
            factories.addOffersToPool(MerchantOfferHelper.WanderingTraderOffersBuilder.SELL_COMMON_ITEMS_POOL,
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.TURTLE_EGG), 10, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.TADPOLE_BUCKET), 4, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.AXOLOTL_BUCKET), 4, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.GOLDEN_APPLE), 8, 1, 0.0F),

                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 3), new ItemStack(Items.PITCHER_POD), 3, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 3), new ItemStack(Items.TORCHFLOWER_SEEDS), 3, 1, 0.0F),

                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.ARMADILLO_SCUTE), 12, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.EXPERIENCE_BOTTLE), 6, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.HONEYCOMB, 3), 12, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.HONEY_BOTTLE), 6, 1, 0.0F));

            factories.addOffersToPool(MerchantOfferHelper.WanderingTraderOffersBuilder.SELL_SPECIAL_ITEMS_POOL,
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 32), new ItemStack(Items.HEART_OF_THE_SEA), 1, 1, 0.0F),

                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 12), new ItemStack(Items.CREEPER_HEAD), 1, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 12), new ItemStack(Items.SKELETON_SKULL), 1, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 12), new ItemStack(Items.ZOMBIE_HEAD), 1, 1, 0.0F),

                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.PEARLESCENT_FROGLIGHT), 3, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.OCHRE_FROGLIGHT), 3, 1, 0.0F),
                    (entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.VERDANT_FROGLIGHT), 3, 1, 0.0F)
            );
        });
    }
}