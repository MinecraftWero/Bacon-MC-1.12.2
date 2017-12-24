package com.minecraftwero.blocks;

import com.minecraftwero.main.Bacon;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CookedBaconBlock extends BlockBase{

	public CookedBaconBlock(String name) {
		super(Material.CLOTH, name);
		setHardness(1.0F);
		setResistance(10F);
		setSoundType(SoundType.SNOW);
		setCreativeTab(Bacon.creativeTab);
		this.blockParticleGravity = 1.0F;
	}
}

