package com.minecraftwero.items;

import com.minecraftwero.main.Bacon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Bacon.creativeTab);
	}
	
	public void registerItemModel() {
		Bacon.proxy.registerItemRenderer(this, 0, name);
	}

}