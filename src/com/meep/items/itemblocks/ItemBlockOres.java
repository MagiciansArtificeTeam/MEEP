package com.meep.items.itemblocks;

import com.meep.blocks.worldgen.BlockOres;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class ItemBlockOres extends ItemBlock {
    public ItemBlockOres(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        String name = "";
        switch (itemstack.getItemDamage()) {
            case 0: {
                name = BlockOres.blockName + "Copper";
                break;
            }
            case 1: {
                name = BlockOres.blockName + "Tin";
                break;
            }
            case 2: {
                name = BlockOres.blockName + "Aluminium";
                break;
            }
            case 3: {
                name = BlockOres.blockName + "Lead";
                break;
            }
            case 4: {
                name = BlockOres.blockName + "Silver";
                break;
            }
            case 5: {
                name = BlockOres.blockName + "Nickel";
                break;
            }
            default:
                name = "nothing";
        }
        return getUnlocalizedName() + "." + name;
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}
