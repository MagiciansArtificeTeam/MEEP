package com.meep.core.utils.registries;

import com.meep.MEEP;
import com.meep.core.libs.configs.BiomeConfigHandler;
import com.meep.core.libs.configs.CoreConfigHandler;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class ConfigGenerator {
    public static Configuration mainConfig;
    public static Configuration oresConfig;
    public static Configuration biomesConfig;

    public static void configs() {
        File newConfigFile = new File(MEEP.configFolder, "MEEPCore.cfg");
        mainConfig = new Configuration(newConfigFile);
        CoreConfigHandler.configOptions(mainConfig);

        newConfigFile = new File(MEEP.configFolder, "MEEPOres.cfg");
        oresConfig = new Configuration(newConfigFile);
        CoreConfigHandler.configOptions(oresConfig);

        newConfigFile = new File(MEEP.configFolder, "MEEPBiomes.cfg");
        biomesConfig = new Configuration(newConfigFile);
        BiomeConfigHandler.configOptions(biomesConfig);
    }
}
