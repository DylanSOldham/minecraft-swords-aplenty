package com.example.swords_aplenty;

import com.example.swords_aplenty.blocks.PorkBlock;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    @GameRegistry.ObjectHolder("swords_aplenty:pork_block")
    public static PorkBlock porkBlock;

    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new PorkBlock());
    }
}
