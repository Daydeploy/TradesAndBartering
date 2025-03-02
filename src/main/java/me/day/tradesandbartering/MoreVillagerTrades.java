package me.day.tradesandbartering;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

import java.util.List;
import java.util.Optional;

@EventBusSubscriber(modid = TradesAndBartering.MOD_ID)
public class MoreVillagerTrades {

    @SubscribeEvent
    public static void registerWanderingTrades(VillagerTradesEvent villagerTradesEvent) {
        if (villagerTradesEvent.getType() == VillagerProfession.ARMORER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 3), new ItemStack(Items.GOLDEN_HELMET), 12, 1, 0.2F)));
            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 7), new ItemStack(Items.GOLDEN_CHESTPLATE), 12, 1, 0.2F)));
            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 5), new ItemStack(Items.GOLDEN_LEGGINGS), 12, 1, 0.2F)));
            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_BOOTS), 12, 1, 0.2F)));
            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.REDSTONE, 15), new ItemStack(Items.EMERALD), 16, 2, 0.05F)));

            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.COPPER_INGOT, 4), new ItemStack(Items.EMERALD), 12, 10, 0.05F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.BUTCHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.COOKED_RABBIT, 5), 16, 10, 0.05F)));

            trades.get(4).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.MUTTON, 5), 16, 15, 0.05F)));

            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.COOKED_BEEF, 5), 12, 30, 0.05F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.CARTOGRAPHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.CREEPER_BANNER_PATTERN), 12, 30, 0.05F)));
            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.FLOWER_BANNER_PATTERN), 12, 30, 0.05F)));
            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.MOJANG_BANNER_PATTERN), 12, 30, 0.05F)));
            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.PIGLIN_BANNER_PATTERN), 12, 30, 0.05F)));
            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.SKULL_BANNER_PATTERN), 12, 30, 0.05F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.CLERIC) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.BONE, 32), new ItemStack(Items.EMERALD), 16, 2, 0.05F)));
            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.STRING, 32), new ItemStack(Items.EMERALD), 16, 2, 0.05F)));

            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.GUNPOWDER, 16), new ItemStack(Items.EMERALD), 12, 10, 0.05F)));

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.DISC_FRAGMENT_5), new ItemStack(Items.EMERALD), 3, 20, 0.05F)));
            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.ECHO_SHARD), new ItemStack(Items.EMERALD), 3, 20, 0.05F)));

            trades.get(4).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.SLIME_BALL), 12, 15, 0.05F)));
            trades.get(4).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.GHAST_TEAR), 12, 15, 0.05F)));

            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.PHANTOM_MEMBRANE), 12, 30, 0.2F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.CACTUS, 32), new ItemStack(Items.EMERALD), 16, 10, 0.05F)));
            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.COCOA_BEANS, 32), new ItemStack(Items.EMERALD), 16, 10, 0.05F)));
            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.SUGAR_CANE, 32), new ItemStack(Items.EMERALD), 16, 10, 0.05F)));

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.MOSS_BLOCK, 16), new ItemStack(Items.EMERALD), 12, 15, 0.05F)));

            trades.get(4).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.BROWN_MUSHROOM, 32), new ItemStack(Items.EMERALD), 12, 30, 0.05F)));
            trades.get(4).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.RED_MUSHROOM, 32), new ItemStack(Items.EMERALD), 12, 30, 0.05F)));

            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 10), new ItemStack(Items.GOLDEN_APPLE), 12, 30, 0.05F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.FISHERMAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.WATER_BUCKET), 16, 1, 0.05F)));

            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.SEAGRASS, 16), new ItemStack(Items.EMERALD), 16, 10, 0.05F)));
            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.SEA_PICKLE, 12), new ItemStack(Items.EMERALD), 16, 10, 0.05F)));

            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 24), new ItemStack(Items.AXOLOTL_BUCKET), 3, 30, 0.2F)));
            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 48), new ItemStack(Items.HEART_OF_THE_SEA), 1, 30, 0.2F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.FLETCHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.SPECTRAL_ARROW, 8), 12, 10, 0.05F)));

            trades.get(5).add(new VillagerTrades.TippedArrowForItemsAndEmeralds(Items.SPECTRAL_ARROW, 5, Items.TIPPED_ARROW, 5, 1, 12, 30));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.LEATHERWORKER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.BUNDLE), 3, 10, 0.05F)));

            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 32), new ItemStack(Items.DIAMOND_HORSE_ARMOR), 3, 30, 0.2F)));
            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 24), new ItemStack(Items.GOLDEN_HORSE_ARMOR), 3, 30, 0.2F)));
            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 16), new ItemStack(Items.IRON_HORSE_ARMOR), 3, 30, 0.2F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.BAMBOO, 48), new ItemStack(Items.EMERALD), 16, 2, 0.05F)));

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.GLOW_INK_SAC, 4), new ItemStack(Items.EMERALD), 12, 20, 0.05F)));

            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 20), new ItemStack(Items.DRAGON_BREATH), 12, 30, 0.05F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.SAND, 16), new ItemStack(Items.EMERALD), 12, 2, 0.05F)));
            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.RED_SAND, 16), new ItemStack(Items.EMERALD), 12, 2, 0.05F)));
            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.DECORATED_POT, 2), 12, 1, 0.05F)));

            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.AMETHYST_BLOCK, 16), new ItemStack(Items.EMERALD), 12, 10, 0.05F)));
            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.CALCITE, 16), new ItemStack(Items.EMERALD), 12, 10, 0.05F)));
            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.TUFF, 16), new ItemStack(Items.EMERALD), 12, 10, 0.05F)));

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.DEEPSLATE, 20), new ItemStack(Items.EMERALD), 12, 20, 0.05F)));
            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.DRIPSTONE_BLOCK, 16), new ItemStack(Items.EMERALD), 12, 20, 0.05F)));
            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.PRISMARINE), 12, 10, 0.05F)));

            trades.get(4).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.PRISMARINE, 8), Optional.of(new ItemCost(Items.EMERALD)), new ItemStack(Items.DARK_PRISMARINE, 8), 16, 30, 0.05F)));

            trades.get(5).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.QUARTZ_BRICKS), 12, 30, 0.05F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.SHEPHERD) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 8), new ItemStack(Items.WOLF_ARMOR), 3, 20, 0.05F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.COPPER_INGOT, 4), new ItemStack(Items.EMERALD), 12, 2, 0.05F)));
            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_HOE), 12, 1, 0.2F)));
            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_SHOVEL), 12, 1, 0.2F)));
            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_AXE), 12, 1, 0.2F)));
            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.GOLDEN_PICKAXE), 12, 1, 0.2F)));

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.IRON_HOE), 3, 10, 0.2F)));
        }

        if (villagerTradesEvent.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = villagerTradesEvent.getTrades();

            trades.get(1).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD), new ItemStack(Items.SHIELD), 12, 1, 0.2F)));

            trades.get(2).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.COPPER_INGOT, 4), new ItemStack(Items.EMERALD), 12, 10, 0.05F)));

            trades.get(3).add(((entity, random) -> new MerchantOffer(new ItemCost(Items.EMERALD, 2), new ItemStack(Items.FLINT_AND_STEEL), 12, 10, 0.05F)));
        }
    }
}
