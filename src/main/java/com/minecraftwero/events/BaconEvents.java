package com.minecraftwero.events;

import net.minecraftforge.common.MinecraftForge;

public class BaconEvents {
	
	public static void registerEvents() {
		
		MinecraftForge.EVENT_BUS.register(new PigDrops());
		
		MinecraftForge.EVENT_BUS.register(new CowDrops());
	}

}
