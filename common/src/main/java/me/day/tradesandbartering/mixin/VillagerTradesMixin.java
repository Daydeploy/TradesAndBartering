package me.day.tradesandbartering.mixin;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This mixin modifies the final fields of VillagerTrades to make them modifiable.
 */
@Mixin(VillagerTrades.class)
public class VillagerTradesMixin {

    @Shadow
    @Final
    @Mutable
    public static Map<ResourceKey<VillagerProfession>, Int2ObjectMap<VillagerTrades.ItemListing[]>> EXPERIMENTAL_TRADES;

    @Shadow
    @Final
    @Mutable
    public static Map<ResourceKey<VillagerProfession>, Int2ObjectMap<VillagerTrades.ItemListing[]>> TRADES;

    @Shadow
    @Final
    @Mutable
    public static List<Pair<VillagerTrades.ItemListing[], Integer>> WANDERING_TRADER_TRADES;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void makeExperimentalTradesModifiable(CallbackInfo ci) {
        EXPERIMENTAL_TRADES = new HashMap<>(EXPERIMENTAL_TRADES);
        TRADES = new HashMap<>(TRADES);
        WANDERING_TRADER_TRADES = new ArrayList<>(WANDERING_TRADER_TRADES);
    }
}