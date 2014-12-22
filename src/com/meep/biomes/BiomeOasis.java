package com.meep.biomes;

import net.minecraft.init.Blocks;

public class BiomeOasis extends BiomeModBase {
    public BiomeOasis(int ID) {
        super(ID, Blocks.sand, Blocks.sandstone, 1, 0, 0, 0, 0, true, 0x007F0E, 0x007F0E);
        spawnableCreatureList.clear();
        this.setDisableRain();
        this.setBiomeName("Desert Oasis");
    }
}
