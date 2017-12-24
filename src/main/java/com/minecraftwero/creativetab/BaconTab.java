package com.minecraftwero.creativetab;

import com.minecraftwero.blocks.ModBlocks;
import com.minecraftwero.items.ModItems;
import com.minecraftwero.main.Bacon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BaconTab extends CreativeTabs {

	public BaconTab() {
		super(Bacon.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.baconLauncher);
	}

}