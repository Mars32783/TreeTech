package com.Vikk32783.TreeTech;

import com.Vikk32783.TreeTech.proxy.IProxy;
import com.Vikk32783.TreeTech.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TreeTech
{
    @Mod.Instance(Reference.MOD_ID)
    public static TreeTech instance;

    @SidedProxy(clientSide = "com.Vikk32783.TreeTech.proxy.ClientProxy", serverSide = "Com.Vikk32783.TreeTech.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }
}
