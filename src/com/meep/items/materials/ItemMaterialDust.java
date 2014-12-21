package com.meep.items.materials;

import com.meep.MEEP;
import com.meep.core.libs.ModInfo;
import com.meep.core.utils.registries.ItemRegistry;
import com.meep.items.ItemModBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class ItemMaterialDust extends ItemModBase {
    public static IIcon[] icon = new IIcon[16];

    public ItemMaterialDust() {
        super();
        this.setCreativeTab(MEEP.itemTab);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setUnlocalizedName("dust");

        ItemRegistry.items.add(this);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        String name = "";
        switch (itemstack.getItemDamage()) {
            case 0: {
                name = "sulfer";
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
        icon[0] = ri.registerIcon(ModInfo.MODID + ":materials/sulfer");
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs par2CreativeTabs, List list) {
        for (int i = 0; i < 1; i++) {
            list.add(new ItemStack(this, 1, i));
        }
    }
}
