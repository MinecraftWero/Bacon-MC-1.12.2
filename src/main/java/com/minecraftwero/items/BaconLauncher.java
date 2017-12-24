package com.minecraftwero.items;

import com.minecraftwero.entities.EntityBacon;
import com.minecraftwero.main.Bacon;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class BaconLauncher extends Item {
	
	protected String name;

	public BaconLauncher(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
        setCreativeTab(Bacon.creativeTab);

	}
	/**
	 * Called when the equipped item is right clicked.
	 */

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemStack = playerIn.getHeldItem(handIn);

		for (int i = 0; i < playerIn.inventory.getSizeInventory(); ++i){

			ItemStack itemstack = playerIn.inventory.getStackInSlot(i);

			if(itemstack.getItem()==ModItems.gayBacon){

				if(!playerIn.capabilities.isCreativeMode)

					itemstack.shrink(1);

				if (!worldIn.isRemote)
				{
					EntityBacon entitybacon = new EntityBacon(worldIn, playerIn);
					entitybacon.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
		            worldIn.spawnEntity(entitybacon);
		            worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_PIG_HURT, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
				}
				break;
			}
		}

		playerIn.addStat(StatList.getObjectUseStats(this));
		return new ActionResult(EnumActionResult.SUCCESS, itemStack);
	}
	
	
	public void registerItemModel() {
		Bacon.proxy.registerItemRenderer(this, 0, name);
	}
	
	
}
