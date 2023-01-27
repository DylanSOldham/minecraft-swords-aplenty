package com.example.swords_aplenty.blocks;

import com.example.swords_aplenty.SwordsAplenty;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PorkBlock extends Block {
    public PorkBlock () {
        super(Material.CLAY);
        setUnlocalizedName(SwordsAplenty.MODID + ".pork_block");
        setRegistryName("pork_block");
    }
}
