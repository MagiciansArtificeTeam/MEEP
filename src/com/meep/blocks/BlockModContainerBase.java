package com.meep.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by James on 21/12/2014.
 */
public class BlockModContainerBase extends BlockModBase implements ITileEntityProvider {
    public BlockModContainerBase(Material material) {
        super(material);
    }

    public TileEntity createNewTileEntity(World world, int meta) {
        return null;
    }
}
