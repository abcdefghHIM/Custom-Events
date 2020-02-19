package com.taotie.customevents;

import com.taotie.customevents.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CustomEvents.MODID, name = CustomEvents.NAME, version = CustomEvents.VERSION, acceptedMinecraftVersions = "1.12.2", guiFactory = "com.taotie.customevents.common.ConfigGuiFactory")
public class CustomEvents {
	public static final String MODID = "customevents";
	public static final String NAME = "Custom Events";
	public static final String VERSION = "1.0.0";

	@Instance(CustomEvents.MODID)
	public static CustomEvents instance;

	@SidedProxy(clientSide = "com.taotie.customevents.client.ClientProxy", serverSide = "com.taotie.customevents.common.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
