package com.meep.core.utils.registries;

import com.meep.MEEP;
import com.meep.core.libs.ConfigHandler;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class ConfigGenerator {
    public static Configuration mainConfig;
    public static Configuration oresConfig;

    public static void configs() {
        File newConfigFile = new File(MEEP.configFolder, "MEEPCore.cfg");
        mainConfig = new Configuration(newConfigFile);

        ConfigHandler.configOptions(mainConfig);

        newConfigFile = new File(MEEP.configFolder, "MEEPOres.cfg");
        oresConfig = new Configuration(newConfigFile);

        ConfigHandler.configOptions(oresConfig);
    }
}
