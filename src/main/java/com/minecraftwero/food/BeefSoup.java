package com.minecraftwero.food;

import com.minecraftwero.main.Bacon;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BeefSoup extends ItemFood {

	protected String name;

	public BeefSoup(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.name = name;
		setMaxStackSize(1);
		setCreativeTab(Bacon.creativeTab);
	}

	 public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	    {
	        super.onItemUseFinish(stack, worldIn, entityLiving);
	        return new ItemStack(Items.BOWL);
	    }	 
	 
	 public void registerItemModel() {
			Bacon.proxy.registerItemRenderer(this, 0, name);
		}

}



