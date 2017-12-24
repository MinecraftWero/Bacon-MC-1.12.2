package com.minecraftwero.items;

import com.minecraftwero.armor.BaconArmor;
import com.minecraftwero.food.BeefSoup;
import com.minecraftwero.food.ModFood;
import com.minecraftwero.main.Bacon;
import com.minecraftwero.tools.BaconAxe;
import com.minecraftwero.tools.BaconHoe;
import com.minecraftwero.tools.BaconPickaxe;
import com.minecraftwero.tools.BaconSpade;
import com.minecraftwero.tools.BaconSword;

import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	//Food
	public static ModFood rawBacon = new ModFood("rawbacon", 1, 0.3F, true, new PotionEffect(MobEffects.POISON, 40, 1));
	public static ModFood cookedBacon = new ModFood("cookedbacon", 2, 0.6F, true);
	public static ModFood gayBacon =  new ModFood("gaybacon", 2, 0.2F, false, new PotionEffect(MobEffects.SPEED, 100, 1)).setAlwaysEdible();	
	public static BeefSoup beefSoup = new BeefSoup("beefsoup",6, 1.6F, false);
	public static ModFood rawBeef = new ModFood("rawbeef", 2, 0.6F, false);	
	public static ModFood roastBeef = new ModFood("roastbeef", 4, 1.6F, true);	
	public static ModFood eggFried = new ModFood("eggfried", 3, 1.2F, false);
	public static ModFood baconSandwich = new ModFood("baconsandwich",7, 1.7F, false);
	public static ModFood baconEC = new ModFood("baconec", 9, 2.0F, true);

	//Launcher
	public static BaconLauncher baconLauncher = new BaconLauncher("baconlauncher");
	
	//Tools
	public static BaconSword baconSword = new BaconSword(Bacon.baconToolMaterial, "baconsword");
	public static BaconPickaxe baconPick = new BaconPickaxe(Bacon.baconToolMaterial, "baconpick");
	public static BaconSpade baconSpade = new BaconSpade(Bacon.baconToolMaterial, "baconspade");
	public static BaconHoe baconHoe = new BaconHoe(Bacon.baconToolMaterial, "baconhoe");
	public static BaconAxe baconAxe = new BaconAxe(Bacon.baconToolMaterial, "baconaxe");

	//Armor
	public static BaconArmor baconHelmet = new BaconArmor(Bacon.baconArmorMaterial, EntityEquipmentSlot.HEAD, "baconhelmet");
	public static BaconArmor baconChest = new BaconArmor(Bacon.baconArmorMaterial, EntityEquipmentSlot.CHEST, "baconchest");
	public static BaconArmor baconLegs = new BaconArmor(Bacon.baconArmorMaterial, EntityEquipmentSlot.LEGS, "baconlegs");
	public static BaconArmor baconBoots = new BaconArmor(Bacon.baconArmorMaterial, EntityEquipmentSlot.FEET, "baconboots");

	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(rawBacon, cookedBacon, gayBacon, beefSoup, rawBeef, 
							roastBeef, eggFried, baconSandwich, baconEC,baconLauncher, baconSword, baconPick, baconSpade,
							baconHoe, baconAxe, baconHelmet, baconChest, baconLegs, baconBoots);
	}

	public static void registerModels() {
		rawBacon.registerItemModel();
		cookedBacon.registerItemModel();
		gayBacon.registerItemModel();
		beefSoup.registerItemModel();
		rawBeef.registerItemModel();
		roastBeef.registerItemModel();
		eggFried.registerItemModel();
		baconSandwich.registerItemModel();
		baconEC.registerItemModel();
		baconLauncher.registerItemModel();
		baconSword.registerItemModel();
		baconPick.registerItemModel();
		baconSpade.registerItemModel();
		baconHoe.registerItemModel();
		baconAxe.registerItemModel();
		baconHelmet.registerItemModel();
		baconChest.registerItemModel();
		baconLegs.registerItemModel();
		baconBoots.registerItemModel();
	}
	
}     
