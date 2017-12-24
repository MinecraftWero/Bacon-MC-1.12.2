package com.minecraftwero.proxies;

import com.minecraftwero.entities.EntityBacon;
import com.minecraftwero.main.Bacon;
import com.minecraftwero.renders.RenderBacon;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Bacon.MODID + ":" + id, "inventory"));
	}

	@Override
	public void registerRenders(){
		RenderingRegistry.registerEntityRenderingHandler(EntityBacon.class, RenderBacon::new);

	}


}
