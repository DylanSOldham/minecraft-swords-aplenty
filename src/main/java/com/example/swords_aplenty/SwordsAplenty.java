package com.example.swords_aplenty;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SwordsAplenty.MODID, name = SwordsAplenty.NAME, version = SwordsAplenty.VERSION)
public class SwordsAplenty
{
    public static final String MODID = "swords_aplenty";
    public static final String NAME = "Swords Aplenty";
    public static final String VERSION = "0.0.1";

    private static Logger logger;

    @SidedProxy(clientSide = "com.example.swords_aplenty.ClientProxy", serverSide = "com.example.swords_aplenty.ClientProxy")
    private static CommonProxy proxy;

    @Mod.Instance
    private static SwordsAplenty instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
        proxy.postInit(event);
    }
}
