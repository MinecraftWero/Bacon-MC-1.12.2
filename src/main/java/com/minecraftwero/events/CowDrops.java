package com.minecraftwero.events;

import java.util.Random;

import com.minecraftwero.items.ModItems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CowDrops {
	
	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		
		if (event.getEntityLiving() instanceof EntityCow) {
			
			Random rand = new Random();
			
			boolean extraDrop = rand.nextBoolean();
			
			ItemStack drop = new ItemStack(ModItems.rawBeef, extraDrop ? 3 : 2);
			
			event.getDrops().add(new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, drop));
			
			}
		}
	
}
