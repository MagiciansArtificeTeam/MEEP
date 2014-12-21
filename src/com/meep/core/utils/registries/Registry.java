package com.meep.core.utils.registries;

/**
 * Created by James on 21/12/2014.
 */
public class Registry {
    public static void initMod() {
        ConfigGenerator.configs();
        BlockRegistry.initBlocks();
        ItemRegistry.initItems();
        RecipeRegistry.initRecipes();
        MEEPEntityRegistry.initEntities();
        WorldGenRegistry.initWorldGens();
        FluidRegistry.initFluids();
        TileEntityRegistry.registerTES();
    }
}
