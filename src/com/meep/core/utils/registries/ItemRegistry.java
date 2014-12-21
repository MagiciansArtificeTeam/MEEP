package com.meep.core.utils.registries;

import com.meep.items.ItemTabIcon;
import com.meep.items.materials.ItemMaterialDust;
import com.meep.items.materials.ItemMaterialIngots;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.ArrayList;

/**
 * Created by James on 21/12/2014.
 */
public class ItemRegistry {
    public static Item tabIcon;

    public static Item dust;
    public static Item ingots;

    public static ArrayList<Item> items = new ArrayList<Item>();

    public static void initItems() {
        tabIcon = new ItemTabIcon("item");

        dust = new ItemMaterialDust();
        ingots = new ItemMaterialIngots();

        for (Item item : items) {
            GameRegistry.registerItem(item, item.getUnlocalizedName());
        }
    }
}
