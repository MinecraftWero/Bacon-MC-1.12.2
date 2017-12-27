package com.minecraftwero.main;

import com.minecraftwero.blocks.ModBlocks;
import com.minecraftwero.creativetab.BaconTab;
import com.minecraftwero.entities.EntityBacon;
import com.minecraftwero.entities.EntityHandler;
import com.minecraftwero.entities.TestEntity;
import com.minecraftwero.events.BaconEvents;
import com.minecraftwero.items.ModItems;
import com.minecraftwero.proxies.CommonProxy;
import com.minecraftwero.recipes.ModSmeltingRecipes;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Bacon.MODID, name = Bacon.NAME, version = Bacon.VERSION)

public class Bacon {

	public static final String MODID = "bmod";
	public static final String NAME = "Bacon";
	public static final String VERSION = "1.0";

	public static final BaconTab creativeTab = new BaconTab();
	
	public static final Item.ToolMaterial baconToolMaterial = EnumHelper.addToolMaterial("BACONIUM", 0, 59, 2.0F, 0.0F, 15);
	public static final ItemArmor.ArmorMaterial baconArmorMaterial = EnumHelper.addArmorMaterial("BACONIUM", MODID + ":bacon", 15, new int[]{1, 2, 3, 1}, 15, SoundEvents.ENTITY_PIG_HURT, 0.0F);

	@SidedProxy(serverSide = "com.minecraftwero.proxies.CommonProxy", clientSide = "com.minecraftwero.proxies.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance(MODID)
	public static Bacon instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(NAME + " is getting cooked!");
		proxy.registerRenders();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		//Recipes
		ModSmeltingRecipes.init();
		
		//Events
		BaconEvents.registerEvents();
		
		//Rendering
		ResourceLocation renderBacon = new ResourceLocation(Bacon.MODID);
		ResourceLocation renderTest = new ResourceLocation(Bacon.MODID);
		EntityHandler.registerModEntity(renderBacon, EntityBacon.class, "renderbacon", Bacon.instance, 16, 20, true);
		EntityHandler.registerModEntity(renderTest, TestEntity.class, "rendertest", Bacon.instance, 16, 20, true);

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());

		}
	
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
	
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
	}
}