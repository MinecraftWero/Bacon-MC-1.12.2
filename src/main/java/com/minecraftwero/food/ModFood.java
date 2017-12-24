package com.minecraftwero.food;

import com.minecraftwero.main.Bacon;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModFood extends ItemFood {

	protected String name;
	protected PotionEffect[] effects;
	
	public ModFood(String name, int amount, float saturation, boolean isWolfFood, PotionEffect... potionEffects ) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.name = name;
		setCreativeTab(Bacon.creativeTab);
		this.effects = potionEffects;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		for (PotionEffect effect : effects) {
			player.addPotionEffect(new PotionEffect(effect));
		}
	}
	
	@Override
	public ModFood setAlwaysEdible() {
	    super.setAlwaysEdible();
	    return this;
	}
	
	
	public void registerItemModel() {
		Bacon.proxy.registerItemRenderer(this, 0, name);
	}

}
