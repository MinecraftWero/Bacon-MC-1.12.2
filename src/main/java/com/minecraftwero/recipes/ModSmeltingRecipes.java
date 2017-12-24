package com.minecraftwero.recipes;

import com.minecraftwero.blocks.ModBlocks;
import com.minecraftwero.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ModSmeltingRecipes {
	
	public static void init() {

		FurnaceRecipes.instance().addSmeltingRecipeForBlock(ModBlocks.blockRaw, new ItemStack(ModBlocks.blockCooked), 0.70F);
		FurnaceRecipes.instance().addSmelting(ModItems.rawBeef, new ItemStack(ModItems.roastBeef), 0.50F);
		FurnaceRecipes.instance().addSmelting(ModItems.rawBacon, new ItemStack(ModItems.cookedBacon), 0.35F);
		FurnaceRecipes.instance().addSmelting(Items.EGG, new ItemStack(ModItems.eggFried), 0.40F);
		FurnaceRecipes.instance().addSmelting(Items.MILK_BUCKET, new ItemStack(ModItems.cheeseSlice, 6), 0.50F);
	}


}

