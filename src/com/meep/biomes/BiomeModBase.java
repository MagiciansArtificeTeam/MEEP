package com.meep.biomes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by poppypoppop on 22/12/2014.
 */
public class BiomeModBase extends BiomeGenBase {
    private static int foliageColour;
    private static int grassColour;

    public BiomeModBase(int ID, Block surfBlock, Block fillBlock, int treesPC, int flowersPC, int grassPC, int mushroomsPC,
            int bigMusroomsPC, boolean genLakes, int leavesColour, int grassColor) {
        super(ID);
        topBlock = surfBlock;
        fillerBlock = fillBlock;
        theBiomeDecorator.treesPerChunk = treesPC;
        theBiomeDecorator.flowersPerChunk = flowersPC;
        theBiomeDecorator.grassPerChunk = grassPC;
        theBiomeDecorator.mushroomsPerChunk = mushroomsPC;
        theBiomeDecorator.bigMushroomsPerChunk = bigMusroomsPC;
        theBiomeDecorator.generateLakes = genLakes;

        foliageColour = leavesColour;
        grassColour = grassColor;
    }

    @SideOnly(Side.CLIENT)
    public int getBiomeFoliageColor(int x, int y, int z) {
        return foliageColour;
    }

    @SideOnly(Side.CLIENT)
    public int getBiomeGrassColor(int p_150558_1_, int p_150558_2_, int p_150558_3_) {
        return grassColour;
    }
}
