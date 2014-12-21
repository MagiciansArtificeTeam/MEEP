package com.meep.core.proxies;

import com.meep.blocks.tileentities.TileEntityLampPost;
import com.meep.core.client.renderers.CustomItemRenderer;
import com.meep.core.client.renderers.blocks.RenderLampPost;
import com.meep.core.utils.registries.BlockRegistry;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class ClientProxy extends CommonProxy {
    public void load() {
        blocks();
        items();
        entities();
    }

    private void blocks() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampPost.class, new RenderLampPost());
    }

    private void items() {
        //Blocks
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockRegistry.lampPost), new CustomItemRenderer());

        //Items

    }

    private void entities() {

    }
}
