package com.meep.core.client.guis.creativetabs;

import com.meep.core.utils.registries.BlockRegistry;
import com.meep.core.utils.registries.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by James on 21/12/2014.
 */
public class BlockCreativeTab extends CreativeTabs {
    public BlockCreativeTab(String label) {
        super("meepMod." + label);
    }

    public Item getTabIconItem() {
        return Item.getItemFromBlock(BlockRegistry.lampPost);
    }
}
