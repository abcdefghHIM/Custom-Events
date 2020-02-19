package com.taotie.customevents.common;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.terraingen.BiomeEvent;
import net.minecraftforge.event.terraingen.ChunkGeneratorEvent;
import net.minecraftforge.event.terraingen.ChunkGeneratorEvent.InitNoiseField;
import net.minecraftforge.event.terraingen.ChunkGeneratorEvent.ReplaceBiomeBlocks;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.event.world.BlockEvent.NeighborNotifyEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventLoader {
	public EventLoader() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void onAnvilUpdateEvent(AnvilUpdateEvent event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.AnvilUpdateEvent);
	}

	@SubscribeEvent
	public void onBiomeEvent(BiomeEvent event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.BiomeEvent);
	}

	@SubscribeEvent
	public void onBiomeEventBiomeColor(BiomeEvent.BiomeColor event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.BiomeEvent_BiomeColor);
	}

	@SubscribeEvent
	public void onBiomeEventGetFoliageColor(BiomeEvent.GetFoliageColor event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.BiomeEvent_GetFoliageColor);
	}

	@SubscribeEvent
	public void onBiomeEventGetWaterColor(BiomeEvent.GetWaterColor event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.BiomeEvent_GetWaterColor);
	}

	@SubscribeEvent
	public void onBiomeEventCreateDecorator(BiomeEvent.CreateDecorator event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.BiomeEvent_CreateDecorator);
	}

	@SubscribeEvent
	public void onBiomeEventGetVillageBlockID(BiomeEvent.GetVillageBlockID event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.BiomeEvent_GetVillageBlockID);
	}

	@SubscribeEvent
	public void onBlockEvent(BlockEvent event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.BlockEvent);
	}

	@SubscribeEvent
	public void onBreakEvent(BreakEvent event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.BreakEvent);
	}

	@SubscribeEvent
	public void onHarvestDropsEvent(HarvestDropsEvent event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.HarvestDropsEvent);
	}

	@SubscribeEvent
	public void onNeighborNotifyEvent(NeighborNotifyEvent event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.NeighborNotifyEvent);
	}

	@SubscribeEvent
	public void onNoteBlockEvent(NoteBlockEvent event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.NoteBlockEvent);
	}

	@SubscribeEvent
	public void onNoteBlockEventChange(NoteBlockEvent.Change event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.NoteBlockEvent_Change);
	}

	@SubscribeEvent
	public void onNoteBlockEventPlay(NoteBlockEvent.Play event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.NoteBlockEvent_Play);
	}

	@SubscribeEvent
	public void onBlockEventPlaceEvent(BlockEvent.PlaceEvent event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.BlockEvent_PlaceEvent);
	}

	@SubscribeEvent
	public void onBlockEventMultiPlaceEvent(BlockEvent.MultiPlaceEvent event) {
		if (!ModConfig.SafeConfig || event.isCancelable())
			event.setCanceled(!ModConfig.BlockEvent_MultiPlaceEvent);
	}

	@SubscribeEvent
	public void onChunkGeneratorEvent(ChunkGeneratorEvent event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.ChunkGeneratorEvent);
	}

	@SubscribeEvent
	public void onChunkGeneratorEventInitNoiseField(ChunkGeneratorEvent.InitNoiseField event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.ChunkGeneratorEvent_InitNoiseField);
	}
	
	@SubscribeEvent
	public void onChunkGeneratorEventReplaceBiomeBlocks(ChunkGeneratorEvent.ReplaceBiomeBlocks event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.ChunkGeneratorEvent_ReplaceBiomeBlocks);
	}

	@SubscribeEvent
	public void onPopulateChunkEvent(PopulateChunkEvent event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.PopulateChunkEvent);
	}

	@SubscribeEvent
	public void onPopulateChunkEventPopulate(PopulateChunkEvent.Populate event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.PopulateChunkEvent_Populate);
	}

	@SubscribeEvent
	public void onPopulateChunkEventPost(PopulateChunkEvent.Post event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.PopulateChunkEvent_Post);
	}

	@SubscribeEvent
	public void onPopulateChunkEventPre(PopulateChunkEvent.Pre event) {
		if (!ModConfig.SafeConfig && !ModConfig.SafeConfig1 || event.isCancelable())
			event.setCanceled(!ModConfig.PopulateChunkEvent_Pre);
	}

}
