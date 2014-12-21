package com.meep.core.utils.registries;

import com.meep.blocks.tileentities.*;
import com.meep.core.libs.ModInfo;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class TileEntityRegistry {
    public static void registerTES() {
        GameRegistry.registerTileEntity(TileEntityLampPost.class, ModInfo.MODID + ":lampPost");
    }
}
