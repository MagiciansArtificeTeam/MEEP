package com.meep.core.utils.registries;

import com.meep.biomes.BiomeOasis;
import com.meep.core.libs.configs.BiomeConfigHandler;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.*;

/**
 * Created by poppypoppop on 22/12/2014.
 */
public class BiomeRegistry {
    public static BiomeGenBase oasisBiome = (new BiomeOasis(BiomeConfigHandler.oasisID));

    public static void registerBiomes() {
        /**
         * Oasis Biome
         * Second param here is the spawn weight, higher number equals higher spawn rate
         */
        BiomeManager.desertBiomes.add(new BiomeManager.BiomeEntry(oasisBiome, 100));
        BiomeManager.addSpawnBiome(oasisBiome);
        WorldChunkManager.allowedBiomes.add(oasisBiome);
        /* Biome Dictionary Registering */
        BiomeDictionary.registerBiomeType(oasisBiome, BiomeDictionary.Type.DESERT);
    }
}
