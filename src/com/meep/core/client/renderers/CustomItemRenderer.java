package com.meep.core.client.renderers;

import com.meep.core.client.models.blocks.ModelLampPost;
import com.meep.core.libs.ModInfo;
import com.meep.core.utils.registries.BlockRegistry;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class CustomItemRenderer implements IItemRenderer {
    public ModelLampPost lampPost = new ModelLampPost();
    public ResourceLocation lampPostTexture = new ResourceLocation(ModInfo.MODID, "models/blocks/lampPost.png");

    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY: {
                if (item.getItem().equals(Item.getItemFromBlock(BlockRegistry.lampPost))) renderLampPost(0.5F, 15F, -0.5F, 0.09F);
                break;
            }
            case EQUIPPED: {
                if (item.getItem().equals(Item.getItemFromBlock(BlockRegistry.lampPost))) renderLampPost(2F, 15F, 5F, 0.10F);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                if (item.getItem().equals(Item.getItemFromBlock(BlockRegistry.lampPost))) renderLampPost(1F, 19F, 7F, 0.08F);
                break;
            }
            case INVENTORY: {
                if (item.getItem().equals(Item.getItemFromBlock(BlockRegistry.lampPost))) renderLampPost(-0.01F, 10F, 0.0F, 0.1F);
                break;
            }
            default:
                return;
        }
    }

    private void renderLampPost(float x, float y, float z, float size) {
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(lampPostTexture);
        GL11.glPushMatrix(); // start
        GL11.glScalef(size,size,size);
        GL11.glTranslatef(x, y, z); // size
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(-90, 0, 1, 0);
        lampPost.renderAll();
        GL11.glPopMatrix(); // end
    }
}
