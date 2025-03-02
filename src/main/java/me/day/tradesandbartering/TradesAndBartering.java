package me.day.tradesandbartering;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(TradesAndBartering.MOD_ID)
public class TradesAndBartering {

    public static final String MOD_ID = "tradesandbartering";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TradesAndBartering() {
        LOGGER.info("Loaded " + "More Trades & Bartering");
    }
}
