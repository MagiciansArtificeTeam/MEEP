package com.meep.items.materials;

import com.meep.MEEP;
import com.meep.core.utils.registries.ItemRegistry;
import com.meep.items.ItemModBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import magiciansartifice.main.core.libs.ModInfo;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class ItemMaterialIngots extends ItemModBase {
    public static IIcon[] icon = new IIcon[16];

    public ItemMaterialIngots() {
        super();
        this.setCreativeTab(MEEP.itemTab);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setUnlocalizedName("ingot");

        ItemRegistry.items.add(this);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        String name = "";
        switch (itemstack.getItemDamage()) {
            case 0: {
                name = "copper";
                break;
            }
            case 1: {
                name = "tin";
                break;
            }
            case 2: {
                name = "aluminium";
                break;
            }
            case 3: {
                name = "lead";
                break;
            }
            case 4: {
                name = "silver";
                break;
            }
            case 5: {
                name = "nickel";
                break;
            }

            default:
                name = "nothing";
                break;
        }
        return getUnlocalizedName() + "." + name;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta)
    {
        return icon[meta];
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister ri) {
        icon[0] = ri.registerIcon(ModInfo.MODID + ":materials/copper_ingot");
        icon[1] = ri.registerIcon(ModInfo.MODID + ":materials/tin_ingot");
        icon[2] = ri.registerIcon(ModInfo.MODID + ":materials/aluminium_ingot");
        icon[3] = ri.registerIcon(ModInfo.MODID + ":materials/lead_ingot");
        icon[4] = ri.registerIcon(ModInfo.MODID + ":materials/silver_ingot");
        icon[5] = ri.registerIcon(ModInfo.MODID + ":materials/nickel_ingot");
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs par2CreativeTabs, List list) {
        for (int i = 0; i < 5; i++) {
            list.add(new ItemStack(this, 1, i));
        }
    }
}
