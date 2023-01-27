package com.example.swords_aplenty.items;

import com.example.swords_aplenty.SwordsAplenty;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PorkSword extends Item {
    
    public PorkSword() {
        super();
        setRegistryName("pork_sword");
        setUnlocalizedName(SwordsAplenty.MODID + ".pork_sword");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(
            this, 
            0, 
            new ModelResourceLocation(getRegistryName(), "inventory")
        );
    }
}
