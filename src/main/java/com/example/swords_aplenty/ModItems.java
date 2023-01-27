package com.example.swords_aplenty;

import com.example.swords_aplenty.items.PorkSword;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    
    @GameRegistry.ObjectHolder("swords_aplenty:pork_sword")
    public static PorkSword porkSword;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        porkSword.initModel();
    }

    private static void registerModBlockItem(RegistryEvent.Register<Item> event, Block block) {
        event.getRegistry().register(
            new ItemBlock(ModBlocks.porkBlock)
                .setRegistryName(ModBlocks.porkBlock.getRegistryName())
        );
    }

    public static void registerItems(RegistryEvent.Register<Item> event) {
        // Regular Items
        event.getRegistry().register(new PorkSword());

        // Block Items
        registerModBlockItem(event, ModBlocks.porkBlock);
    }
}
