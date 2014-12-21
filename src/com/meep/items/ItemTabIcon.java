package com.meep.items;

import com.meep.core.utils.registries.ItemRegistry;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class ItemTabIcon extends ItemModBase {
    public ItemTabIcon(String tab) {
        super();
        this.setUnlocalizedName(tab + ".tab.icon");
        this.setTextureName("assets.meep:" + tab + "_tab_icon");

        ItemRegistry.items.add(this);
    }
}
