package com.meep;

import com.meep.core.client.guis.CreativeTab;
import com.meep.core.libs.ModInfo;
import com.meep.core.utils.registries.Registry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by James on 21/12/2014.
 */
@Mod(name = ModInfo.NAME, modid = ModInfo.MODID, version = ModInfo.VERSION)
public class MEEP {
    @Instance
    public MEEP instance;

    public Configuration config;

    public static CreativeTabs itemTab = new CreativeTab("items");
    public static CreativeTabs blocksTab = new CreativeTab("blocks");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Registry.initMod();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
