package me.day.tradesandbartering;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TradesAndBartering implements ModInitializer {

    public static final String MOD_ID = "More Trades & Bartering";
    public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        MoreVillagerTrades.registerVillagerTrades();
        MoreWanderingTrades.registerWanderingTrades();

        LOGGER.info("Loaded " + MOD_ID);
    }
}
