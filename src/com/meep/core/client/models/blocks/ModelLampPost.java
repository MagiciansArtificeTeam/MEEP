package com.meep.core.client.models.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLampPost extends ModelBase
{
    //fields
    ModelRenderer LampPole;
    ModelRenderer LampPoleCross;
    ModelRenderer LeftHang;
    ModelRenderer RightHang;
    ModelRenderer PoleBase;
    ModelRenderer Light1Top;
    ModelRenderer Light2Top;
    ModelRenderer Light1Front;
    ModelRenderer Light2Front;
    ModelRenderer Light2Back;
    ModelRenderer Light1Back;
    ModelRenderer Lamp1Right;
    ModelRenderer Lamp1Left;
    ModelRenderer Lamp2Right;
    ModelRenderer Lamp2Left;
    ModelRenderer Lamp1Light;
    ModelRenderer Lamp2Light;
  
    public ModelLampPost() {
        textureWidth = 128;
        textureHeight = 64;
    
        LampPole = new ModelRenderer(this, 42, 0);
        LampPole.addBox(0F, 0F, 0F, 2, 44, 2);
        LampPole.setRotationPoint(-1F, -22F, -1F);
        LampPole.setTextureSize(128, 64);
        LampPole.mirror = true;
        setRotation(LampPole, 0F, 0F, 0F);
        LampPoleCross = new ModelRenderer(this, 0, 31);
        LampPoleCross.addBox(0F, 0F, -1F, 16, 2, 2);
        LampPoleCross.setRotationPoint(-8F, -24F, 0F);
        LampPoleCross.setTextureSize(128, 64);
        LampPoleCross.mirror = true;
        setRotation(LampPoleCross, 0F, 0F, 0F);
        LeftHang = new ModelRenderer(this, 8, 0);
        LeftHang.addBox(0F, 0F, 0F, 2, 4, 2);
        LeftHang.setRotationPoint(-10F, -24F, -1F);
        LeftHang.setTextureSize(128, 64);
        LeftHang.mirror = true;
        setRotation(LeftHang, 0F, 0F, 0F);
        RightHang = new ModelRenderer(this, 8, 0);
        RightHang.addBox(0F, 0F, 0F, 2, 4, 2);
        RightHang.setRotationPoint(8F, -24F, -1F);
        RightHang.setTextureSize(128, 64);
        RightHang.mirror = true;
        setRotation(RightHang, 0F, 0F, 0F);
        PoleBase = new ModelRenderer(this, 0, 36);
        PoleBase.addBox(0F, 0F, 0F, 4, 2, 4);
        PoleBase.setRotationPoint(-2F, 22F, -2F);
        PoleBase.setTextureSize(128, 64);
        PoleBase.mirror = true;
        setRotation(PoleBase, 0F, 0F, 0F);
        Light1Top = new ModelRenderer(this, 17, 0);
        Light1Top.addBox(0F, 0F, 0F, 6, 1, 6);
        Light1Top.setRotationPoint(-12F, -20F, -3F);
        Light1Top.setTextureSize(128, 64);
        Light1Top.mirror = true;
        setRotation(Light1Top, 0F, 0F, 0F);
        Light2Top = new ModelRenderer(this, 17, 0);
        Light2Top.addBox(0F, 0F, 0F, 6, 1, 6);
        Light2Top.setRotationPoint(6F, -20F, -3F);
        Light2Top.setTextureSize(128, 64);
        Light2Top.mirror = true;
        setRotation(Light2Top, 0F, 0F, 0F);
        Light1Front = new ModelRenderer(this, 10, 8);
        Light1Front.addBox(0F, 0F, 0F, 6, 4, 1);
        Light1Front.setRotationPoint(-12F, -19F, 2F);
        Light1Front.setTextureSize(128, 64);
        Light1Front.mirror = true;
        setRotation(Light1Front, 0F, 0F, 0F);
        Light2Front = new ModelRenderer(this, 10, 8);
        Light2Front.addBox(0F, 0F, 0F, 6, 4, 1);
        Light2Front.setRotationPoint(6F, -19F, 2F);
        Light2Front.setTextureSize(128, 64);
        Light2Front.mirror = true;
        setRotation(Light2Front, 0F, 0F, 0F);
        Light2Back = new ModelRenderer(this, 10, 8);
        Light2Back.addBox(0F, 0F, 0F, 6, 4, 1);
        Light2Back.setRotationPoint(6F, -19F, -3F);
        Light2Back.setTextureSize(128, 64);
        Light2Back.mirror = true;
        setRotation(Light2Back, 0F, 0F, 0F);
        Light1Back = new ModelRenderer(this, 10, 8);
        Light1Back.addBox(0F, 0F, 0F, 6, 4, 1);
        Light1Back.setRotationPoint(-12F, -19F, -3F);
        Light1Back.setTextureSize(128, 64);
        Light1Back.mirror = true;
        setRotation(Light1Back, 0F, 0F, 0F);
        Lamp1Right = new ModelRenderer(this, 10, 16);
        Lamp1Right.addBox(0F, 0F, 0F, 1, 4, 4);
        Lamp1Right.setRotationPoint(-12F, -19F, -2F);
        Lamp1Right.setTextureSize(128, 64);
        Lamp1Right.mirror = true;
        setRotation(Lamp1Right, 0F, 0F, 0F);
        Lamp1Left = new ModelRenderer(this, 10, 16);
        Lamp1Left.addBox(0F, 0F, 0F, 1, 4, 4);
        Lamp1Left.setRotationPoint(-7F, -19F, -2F);
        Lamp1Left.setTextureSize(128, 64);
        Lamp1Left.mirror = true;
        setRotation(Lamp1Left, 0F, 0F, 0F);
        Lamp2Right = new ModelRenderer(this, 10, 16);
        Lamp2Right.addBox(0F, 0F, 0F, 1, 4, 4);
        Lamp2Right.setRotationPoint(11F, -19F, -2F);
        Lamp2Right.setTextureSize(128, 64);
        Lamp2Right.mirror = true;
        setRotation(Lamp2Right, 0F, 0F, 0F);
        Lamp2Left = new ModelRenderer(this, 10, 16);
        Lamp2Left.addBox(0F, 0F, 0F, 1, 4, 4);
        Lamp2Left.setRotationPoint(6F, -19F, -2F);
        Lamp2Left.setTextureSize(128, 64);
        Lamp2Left.mirror = true;
        setRotation(Lamp2Left, 0F, 0F, 0F);
        Lamp1Light = new ModelRenderer(this, 21, 16);
        Lamp1Light.addBox(0F, 0F, 0F, 2, 2, 2);
        Lamp1Light.setRotationPoint(-10F, -19F, -1F);
        Lamp1Light.setTextureSize(128, 64);
        Lamp1Light.mirror = true;
        setRotation(Lamp1Light, 0F, 0F, 0F);
        Lamp2Light = new ModelRenderer(this, 21, 16);
        Lamp2Light.addBox(0F, 0F, 0F, 2, 2, 2);
        Lamp2Light.setRotationPoint(8F, -19F, -1F);
        Lamp2Light.setTextureSize(128, 64);
        Lamp2Light.mirror = true;
        setRotation(Lamp2Light, 0F, 0F, 0F);
    }
  
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        LampPole.render(f5);
        LampPoleCross.render(f5);
        LeftHang.render(f5);
        RightHang.render(f5);
        PoleBase.render(f5);
        Light1Top.render(f5);
        Light2Top.render(f5);
        Light1Front.render(f5);
        Light2Front.render(f5);
        Light2Back.render(f5);
        Light1Back.render(f5);
        Lamp1Right.render(f5);
        Lamp1Left.render(f5);
        Lamp2Right.render(f5);
        Lamp2Left.render(f5);
        Lamp1Light.render(f5);
        Lamp2Light.render(f5);
    }
  
    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
  
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    public void renderAll() {
        LampPole.render(0.625F);
        LampPoleCross.render(0.625F);
        LeftHang.render(0.625F);
        RightHang.render(0.625F);
        PoleBase.render(0.625F);
        Light1Top.render(0.625F);
        Light2Top.render(0.625F);
        Light1Front.render(0.625F);
        Light2Front.render(0.625F);
        Light2Back.render(0.625F);
        Light1Back.render(0.625F);
        Lamp1Right.render(0.625F);
        Lamp1Left.render(0.625F);
        Lamp2Right.render(0.625F);
        Lamp2Left.render(0.625F);
        Lamp1Light.render(0.625F);
        Lamp2Light.render(0.625F);
    }
}
