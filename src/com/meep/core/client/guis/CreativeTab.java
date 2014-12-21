package com.meep.core.client.guis;

import com.meep.core.utils.registries.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by James on 21/12/2014.
 */
public class CreativeTab extends CreativeTabs {
    public CreativeTab() {
        super("meepMod");
    }

    public Item getTabIconItem() {
        return ItemRegistry.tabIcon;
    }
}
