package com.meep.blocks.cosmetic;

import com.meep.MEEP;
import com.meep.blocks.BlockModBase;
import com.meep.core.libs.ModInfo;
import com.meep.core.utils.registries.BlockRegistry;
import com.meep.items.itemblocks.ItemBlockFlat;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

/**
 * Created by poppypoppop on 22/12/2014.
 */
public class BlockFlat extends BlockModBase {
    public IIcon[] icon = new IIcon[16];
    public BlockFlat() {
        super(Material.rock);
        this.setBlockName("flat");
        this.setCreativeTab(MEEP.blocksTab);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
        this.useNeighborBrightness = true;

        GameRegistry.registerBlock(this, ItemBlockFlat.class, this.getUnlocalizedName());
    }

    public boolean isOpaqueCube() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        blockIcon = ir.registerIcon("minecraft:stone");

        icon[0] = ir.registerIcon(ModInfo.MODID + ":cosmetic/tarmac");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return icon[meta];
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item id, CreativeTabs tab, List list) {
        for (int i = 0; i < 1; i++) {
            list.add(new ItemStack(id, 1, i));
        }
    }

    public int damageDropped(int meta)
    {
        return meta;
    }
}
