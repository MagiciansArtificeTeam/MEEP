package com.meep.core.utils.registries;

import com.meep.blocks.cosmetic.BlockLampPost;
import com.meep.blocks.worldgen.BlockDustOres;
import com.meep.blocks.worldgen.BlockOres;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import java.util.ArrayList;

/**
 * Created by James on 21/12/2014.
 */
public class BlockRegistry {
    public static ArrayList<Block> blocks = new ArrayList<Block>();
    public static Block ores;
    public static Block dustOres;

    public static Block lampPost;

    public static void initBlocks() {
        ores = new BlockOres();
        dustOres = new BlockDustOres();

        lampPost = new BlockLampPost();

        for (Block block : blocks) {
            GameRegistry.registerBlock(block, block.getUnlocalizedName());
        }
    }
}
