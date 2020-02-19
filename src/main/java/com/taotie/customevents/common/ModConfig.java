package com.taotie.customevents.common;

import com.taotie.customevents.CustomEvents;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = CustomEvents.MODID)
@Config.LangKey("config.customevents")
public class ModConfig {
	@Config.Comment("Safe Config Lv1")
	@Config.LangKey("config.customevents.SafeConfig")
	@Config.Name("Safe Config Lv1")
	public static boolean SafeConfig = true;

	@Config.Comment("Safe Config Lv2")
	@Config.LangKey("config.customevents.SafeConfig1")
	@Config.Name("Safe Config Lv2")
	public static boolean SafeConfig1 = true;

	@Config.Comment("Anvil Update Event")
	@Config.LangKey("config.customevents.AnvilUpdateEvent")
	@Config.Name("Anvil Update Event")
	public static boolean AnvilUpdateEvent = true;

	@Config.Comment("Biome Event")
	@Config.LangKey("config.customevents.BiomeEvent")
	@Config.Name("Biome Event")

	public static boolean BiomeEvent = true;
	@Config.Comment("Biome Event:Biome Color")
	@Config.LangKey("config.customevents.BiomeEvent.BiomeColor")
	@Config.Name("Biome Event:Biome Color")
	public static boolean BiomeEvent_BiomeColor = true;

	@Config.Comment("Biome Event:Get Foliage Color")
	@Config.LangKey("config.customevents.BiomeEvent.GetFoliageColor")
	@Config.Name("Biome Event:Get Foliage Color")
	public static boolean BiomeEvent_GetFoliageColor = true;

	@Config.Comment("Biome Event:Get Water Color")
	@Config.LangKey("config.customevents.BiomeEvent.GetWaterColor")
	@Config.Name("Biome Event:Get Water Color")
	public static boolean BiomeEvent_GetWaterColor = true;

	@Config.Comment("Biome Event:Create Decorator")
	@Config.LangKey("config.customevents.BiomeEvent.CreateDecorator")
	@Config.Name("Biome Event:Create Decorator")
	public static boolean BiomeEvent_CreateDecorator = true;

	@Config.Comment("Biome Event:Get Village Block ID")
	@Config.LangKey("config.customevents.BiomeEvent.GetVillageBlockID")
	@Config.Name("Biome Event:Get Village Block ID")
	public static boolean BiomeEvent_GetVillageBlockID = true;

	@Config.Comment("Block Event")
	@Config.LangKey("config.customevents.BlockEvent")
	@Config.Name("Block Event")
	public static boolean BlockEvent = true;

	@Config.Comment("Break Event")
	@Config.LangKey("config.customevents.BreakEvent")
	@Config.Name("Break Event")
	public static boolean BreakEvent = true;

	@Config.Comment("Harvest Drops Event")
	@Config.LangKey("config.customevents.HarvestDropsEvent")
	@Config.Name("Harvest Drops Event")
	public static boolean HarvestDropsEvent = true;

	@Config.Comment("Neighbor Notify Event")
	@Config.LangKey("config.customevents.NeighborNotifyEvent")
	@Config.Name("Neighbor Notify Event")
	public static boolean NeighborNotifyEvent = true;

	@Config.Comment("Note Block Event")
	@Config.LangKey("config.customevents.NoteBlockEvent")
	@Config.Name("Note Block Event")
	public static boolean NoteBlockEvent = true;

	@Config.Comment("Note Block Event:Change")
	@Config.LangKey("config.customevents.NoteBlockEventChange")
	@Config.Name("Note Block Event:Change")
	public static boolean NoteBlockEvent_Change = true;

	@Config.Comment("Note Block Event:Play")
	@Config.LangKey("config.customevents.NoteBlockEventPlay")
	@Config.Name("Note Block Event:Play")
	public static boolean NoteBlockEvent_Play = true;

	@Config.Comment("Block Event:Place Event")
	@Config.LangKey("config.customevents.BlockEventPlaceEvent")
	@Config.Name("Block Event:Place Event")
	public static boolean BlockEvent_PlaceEvent = true;

	@Config.Comment("Block Event:Multi Place Event")
	@Config.LangKey("config.customevents.BlockEventMultiPlaceEvent")
	@Config.Name("Block Event:Multi Place Event")
	public static boolean BlockEvent_MultiPlaceEvent = true;

	@Config.Comment("Chunk Generator Event")
	@Config.LangKey("config.customevents.ChunkGeneratorEvent")
	@Config.Name("Chunk Generator Event")
	public static boolean ChunkGeneratorEvent = true;

	@Config.Comment("Chunk Generator Event:Init Noise Field")
	@Config.LangKey("config.customevents.ChunkGeneratorEventInitNoiseField")
	@Config.Name("Chunk Generator Event:Init Noise Field")
	public static boolean ChunkGeneratorEvent_InitNoiseField = true;
	
	@Config.Comment("Chunk Generator Event:Replace Biome Blocks")
	@Config.LangKey("config.customevents.ChunkGeneratorEventReplaceBiomeBlocks")
	@Config.Name("Chunk Generator Event:Replace Biome Blocks")
	public static boolean ChunkGeneratorEvent_ReplaceBiomeBlocks = true;

	@Config.Comment("Populate Chunk Event")
	@Config.LangKey("config.customevents.PopulateChunkEvent")
	@Config.Name("Populate Chunk Event")
	public static boolean PopulateChunkEvent = true;

	@Config.Comment("Populate Chunk Event:Populate")
	@Config.LangKey("config.customevents.PopulateChunkEventPopulate")
	@Config.Name("Populate Chunk Event:Populate")
	public static boolean PopulateChunkEvent_Populate = true;

	@Config.Comment("Populate Chunk Event:Post")
	@Config.LangKey("config.customevents.PopulateChunkEventPost")
	@Config.Name("Populate Chunk Event:Post")
	public static boolean PopulateChunkEvent_Post = true;

	@Config.Comment("Populate Chunk Event:Pre")
	@Config.LangKey("config.customevents.PopulateChunkEventPre")
	@Config.Name("Populate Chunk Event:Pre")
	public static boolean PopulateChunkEvent_Pre = true;

	@Mod.EventBusSubscriber(modid = CustomEvents.MODID)
	public static class ConfigSyncHandler {
		@SubscribeEvent
		public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(CustomEvents.MODID)) {
				ConfigManager.sync(CustomEvents.MODID, Config.Type.INSTANCE);
			}
		}
	}
}