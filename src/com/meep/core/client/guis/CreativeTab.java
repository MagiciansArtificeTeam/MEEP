package com.meep.core.client.guis;

import com.meep.core.utils.registries.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by James on 21/12/2014.
 */
public class CreativeTab extends CreativeTabs {
    public CreativeTab(String label) {
        super("meepMod." + label);
    }

    public Item getTabIconItem() {
        return ItemRegistry.itemTabIcon;
    }
}
