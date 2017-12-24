package com.minecraftwero.recipes;

import com.minecraftwero.blocks.ModBlocks;
import com.minecraftwero.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmeltingRecipes {
	
	public static void init() {
		
		GameRegistry.addSmelting(ModItems.rawBacon, new ItemStack(ModItems.cookedBacon), 0.35F);
		GameRegistry.addSmelting(ModItems.rawBeef, new ItemStack(ModItems.roastBeef), 0.50F);
		GameRegistry.addSmelting(ModBlocks.blockRaw, new ItemStack(ModBlocks.blockCooked), 0.70F);
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ModItems.eggFried), 0.40F);
	}
}