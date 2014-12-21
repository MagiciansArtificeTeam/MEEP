package com.meep.core.client.guis.creativetabs;

import com.meep.core.utils.registries.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by poppypoppop on 22/12/2014.
 */
public class ItemCreativeTab extends CreativeTabs {
    public ItemCreativeTab(String label) {
        super("meepMod." + label);
    }

    public Item getTabIconItem() {
        return ItemRegistry.tabIcon;
    }
}
