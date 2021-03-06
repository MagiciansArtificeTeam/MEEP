package com.meep.blocks.worldgen;

import com.meep.MEEP;
import com.meep.blocks.BlockModBase;
import com.meep.core.libs.ModInfo;
import com.meep.core.utils.BlockHelper;
import com.meep.core.utils.registries.ItemRegistry;
import com.meep.items.itemblocks.ItemBlockDustOres;
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
import java.util.Random;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class BlockDustOres extends BlockModBase {
    public static String blockName;

    public IIcon[] icon = new IIcon[16];

    public BlockDustOres() {
        super(Material.rock);
        blockName = "dustOre";
        this.setBlockName(blockName);
        this.setCreativeTab(MEEP.blocksTab);
        this.setHardness(1.5F);
        this.setHarvestLevel("pickaxe", 2);

        GameRegistry.registerBlock(this, ItemBlockDustOres.class, this.getUnlocalizedName());
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir) {
        blockIcon = ir.registerIcon("minecraft:stone");

        icon[0] = ir.registerIcon(ModInfo.MODID + ":ores/sulfur_" + blockName);
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

    public Item getItemDropped(int amount, Random random, int meta) {
        switch(meta) {
            case 0: return new ItemStack(ItemRegistry.dust, 1, 0).getItem();
        }
        return Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random rand) {
        return BlockHelper.random(4);
    }
}
