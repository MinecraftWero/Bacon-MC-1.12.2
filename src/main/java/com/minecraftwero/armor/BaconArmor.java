package com.minecraftwero.armor;

import com.minecraftwero.main.Bacon;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class BaconArmor extends ItemArmor {
	
	private String name;

	public BaconArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		setCreativeTab(Bacon.creativeTab);
	}
	
	public void registerItemModel() {
		Bacon.proxy.registerItemRenderer(this, 0, name);
	}

}
