package com.meep.core.client.renderers.blocks;

import com.meep.core.client.models.blocks.ModelLampPost;
import com.meep.core.libs.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by poppypoppop on 21/12/2014.
 */
public class RenderLampPost extends TileEntitySpecialRenderer {
    public ModelLampPost model = new ModelLampPost();
    public ResourceLocation texture = new ResourceLocation(ModInfo.MODID, "models/blocks/lampPost.png");

    public RenderLampPost() {

    }

    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float size) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 90.0F, 0.0F, 90.0F);
        this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
