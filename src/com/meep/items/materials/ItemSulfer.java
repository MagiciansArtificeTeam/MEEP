package com.meep.items.materials;

import com.meep.MEEP;
import com.meep.core.utils.registries.ItemRegistry;
import com.meep.items.ItemModBase;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class ItemSulfer extends ItemModBase {
    public ItemSulfer() {
        super();
        this.setTextureName("assets.meep:materials/sulfer");
        this.setUnlocalizedName("sulfer");
        this.setCreativeTab(MEEP.itemTab);

        ItemRegistry.items.add(this);
    }
}
