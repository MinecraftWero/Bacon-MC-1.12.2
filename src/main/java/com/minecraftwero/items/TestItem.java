package com.minecraftwero.items;

import com.minecraftwero.entities.TestEntity;
import com.minecraftwero.main.Bacon;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TestItem extends Item {

    protected String name;

    public TestItem(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(1);
        setCreativeTab(Bacon.creativeTab);

    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(facing == EnumFacing.UP) {

            if(!worldIn.isRemote) {

                ItemStack itemstack = player.getHeldItem(hand);
                TestEntity testEntity = new TestEntity(worldIn, pos.getX(), pos.getY() + 1, pos.getZ());
                worldIn.spawnEntity(testEntity);

                if(!player.isCreative()) {
                    itemstack.shrink(1);
                }
            }
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }

    public void registerItemModel() {
        Bacon.proxy.registerItemRenderer(this, 0, name);
    }
}


