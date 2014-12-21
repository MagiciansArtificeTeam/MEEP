package com.meep.blocks.cosmetic;

import com.meep.MEEP;
import com.meep.blocks.BlockModContainerBase;
import com.meep.blocks.tileentities.TileEntityLampPost;
import magiciansartifice.main.core.utils.registries.BlockRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class BlockLampPost extends BlockModContainerBase {
    public BlockLampPost() {
        super(Material.iron);
        this.setBlockName("lamp.post");
        this.setCreativeTab(MEEP.blocksTab);
        this.setHardness(5.0F);

        BlockRegistry.blocks.add(this);
    }

    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityLampPost();
    }
}
