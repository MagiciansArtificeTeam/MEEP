package com.meep.blocks.worldgen;

import com.meep.MEEP;
import com.meep.blocks.BlockModBase;
import com.meep.core.libs.ModInfo;
import com.meep.items.itemblocks.ItemBlockOres;
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
 * Created by poppypoppop on 21/12/2014.
 */
public class BlockOres extends BlockModBase {
    public static String blockName;

    public IIcon[] icon = new IIcon[16];
    public static int meta;

    public BlockOres() {
        super(Material.rock);
        blockName = "ore";
        this.setBlockName(blockName);
        this.setCreativeTab(MEEP.blocksTab);
        this.setHardness(1.5F);
        this.setHarvestLevel("pickaxe", 2);

        GameRegistry.registerBlock(this, ItemBlockOres.class, this.getUnlocalizedName());
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        blockIcon = ir.registerIcon("minecraft:stone");

        icon[0] = ir.registerIcon(ModInfo.MODID + ":worldgen/copper_" + blockName);
        icon[1] = ir.registerIcon(ModInfo.MODID + ":worldgen/tin_" + blockName);
        icon[2] = ir.registerIcon(ModInfo.MODID + ":worldgen/aluminium_" + blockName);
        icon[3] = ir.registerIcon(ModInfo.MODID + ":worldgen/lead_" + blockName);
        icon[4] = ir.registerIcon(ModInfo.MODID + ":worldgen/silver_" + blockName);
        icon[5] = ir.registerIcon(ModInfo.MODID + ":worldgen/nickle_" + blockName);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return icon[meta];
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item id, CreativeTabs tab, List list) {
        for (int i = 0; i < 6; i++) {
            list.add(new ItemStack(id, 1, i));
        }
    }

    public int damageDropped(int meta)
    {
        return meta;
    }
}
