package com.minecraftwero.blocks;

import com.minecraftwero.main.Bacon;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static RawBaconBlock blockRaw = new RawBaconBlock("blockraw");
	public static CookedBaconBlock blockCooked = new CookedBaconBlock("blockcooked");
	
	public static void register(IForgeRegistry<Block> register) {
		register.registerAll(blockRaw, blockCooked);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(blockRaw.createItemBlock(), blockCooked.createItemBlock());

	}
	
	public static void registerModels() {
		blockRaw.registerItemModel(Item.getItemFromBlock(blockRaw));
		blockCooked.registerItemModel(Item.getItemFromBlock(blockCooked));
	}

}
