package com.minecraftwero.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;

public class TestEntity extends EntityCreature {

    public TestEntity(World worldIn) {
        super(worldIn);
    }

    @Override
    protected boolean canBeRidden(Entity entityIn)
    {
        return true;
    }
}
