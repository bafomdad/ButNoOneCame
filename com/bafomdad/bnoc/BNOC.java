package com.bafomdad.bnoc;

import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
@Mod(modid = BNOC.MOD_ID, name = BNOC.NAME, version = BNOC.VERSION)
public class BNOC {

	public static final String MOD_ID = "bnoc";
	public static final String NAME = "But No One Came";
	public static final String VERSION = "1.0";
	
	@Mod.Instance
	public static BNOC instance;
	
	@SubscribeEvent
	public static void onEntitySpawn(LivingSpawnEvent.CheckSpawn event) {
		
		if (!event.getWorld().isRemote && !event.isSpawner())
			event.setResult(Event.Result.DENY);
	}
}
