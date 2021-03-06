package com.meep;

import com.meep.core.client.guis.creativetabs.BlockCreativeTab;
import com.meep.core.client.guis.creativetabs.ItemCreativeTab;
import com.meep.core.libs.ModInfo;
import com.meep.core.proxies.CommonProxy;
import com.meep.core.utils.registries.Registry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

import java.io.File;

/**
 * Created by James on 21/12/2014.
 */
@Mod(name = ModInfo.NAME, modid = ModInfo.MODID, version = ModInfo.VERSION)
public class MEEP {
    @Instance
    public MEEP instance;

    @SidedProxy(serverSide = ModInfo.SERVER, clientSide = ModInfo.CLIENT)
    public static CommonProxy proxy;

    public static CreativeTabs itemTab = new ItemCreativeTab("items");
    public static CreativeTabs blocksTab = new BlockCreativeTab("blocks");
    public static File configFolder;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        configFolder = new File(event.getModConfigurationDirectory(), "/MEEP");
        Registry.initMod();
        proxy.load();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
