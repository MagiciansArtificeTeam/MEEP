package com.meep.core.utils.registries;

import com.meep.items.ItemTabIcon;
import com.meep.items.materials.ItemSulfer;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.ArrayList;

/**
 * Created by James on 21/12/2014.
 */
public class ItemRegistry {
    public static Item itemTabIcon;
    public static Item sulfer;

    public static ArrayList<Item> items = new ArrayList<Item>();
    public static void initItems() {
        itemTabIcon = new ItemTabIcon("item");
        sulfer = new ItemSulfer();

        for (Item item : items) {
            GameRegistry.registerItem(item, item.getUnlocalizedName());
        }
    }
}
