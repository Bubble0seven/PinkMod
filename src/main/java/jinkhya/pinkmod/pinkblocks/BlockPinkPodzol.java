package jinkhya.pinkmod.pinkblocks;

import jinkhya.pinkmod.ModBlocks;
import jinkhya.pinkmod.PinkMod;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@SuppressWarnings("deprecation")
public class BlockPinkPodzol extends Block implements IGrowable {

    public BlockPinkPodzol() {
        super(Material.GROUND);
        setRegistryName(new ResourceLocation(PinkMod.MOD_ID, "pink_podzol"));
        this.setTickRandomly(true);
        setHardness((float) 0.5);
        setResistance(2.5f);
        setSoundType(SoundType.GROUND);
        setTranslationKey(PinkMod.MOD_ID + ".pink_podzol");
        setCreativeTab(PinkMod.creativeTabs);
    }

    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return false;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        BlockPos blockpos = pos.up();

        for (int i = 0; i < 128; ++i) {
            BlockPos blockpos1 = blockpos;
            int j = 0;

            while (true) {
                if (j >= i / 16) {
                    if (worldIn.isAirBlock(blockpos1)) {
                        if (rand.nextInt(8) == 0) {
                            worldIn.getBiome(blockpos1).plantFlower(worldIn, rand, blockpos1);
                        } else {
                            IBlockState iblockstate1 = Blocks.TALLGRASS.getDefaultState().withProperty(BlockTallGrass.TYPE, BlockTallGrass.EnumType.GRASS);

                            if (Blocks.TALLGRASS.canBlockStay(worldIn, blockpos1, iblockstate1)) {
                                worldIn.setBlockState(blockpos1, iblockstate1, 3);
                            }
                        }
                    }

                    break;
                }

                blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);

                if (worldIn.getBlockState(blockpos1.down()).getBlock() != ModBlocks.blockPinkPodzol || worldIn.getBlockState(blockpos1).isNormalCube()) {
                    break;
                }


                ++j;
            }
        }
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return false;
    }

    @Override
    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable) {
        IBlockState plant = plantable.getPlant(world, pos.offset(direction));
        net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));


        if (plant.getBlock() instanceof IGrowable) {
            return true;
        }
        if (plant.getBlock() instanceof IPlantable) {
            return true;
        }
        return false;
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModBlocks.blockPinkDirt.getItemDropped(ModBlocks.blockPinkDirt.getDefaultState(), rand, fortune);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}