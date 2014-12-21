package com.meep.items.itemblocks;

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
                name = "oreCopper";
                break;
            }
            case 1: {
                name = "oreTin";
                break;
            }
            case 2: {
                name = "oreAluminium";
                break;
            }
            case 3: {
                name = "oreLead";
                break;
            }
            case 4: {
                name = "oreSilver";
                break;
            }
            case 5: {
                name = "oreNickel";
                break;
            }
            case 6: {
                name = "oreSulfer";
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
