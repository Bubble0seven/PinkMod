package jinkhya.pinkmod.pinkblocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
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
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import java.util.Random;

public class BlockPinkDirt extends Block implements IGrowable {

    public static final ResourceLocation PINK_DIRT = new ResourceLocation(PinkMod.MOD_ID, "pink_dirt");

    public BlockPinkDirt() {
        super(Material.GRASS);
        setRegistryName(new ResourceLocation(PinkMod.MOD_ID, "pink_dirt"));
        setHardness((float) 0.5);
        setResistance(2.5f);
        setSoundType(SoundType.GROUND);
        setTranslationKey(PinkMod.MOD_ID + ".pink_dirt");
        setCreativeTab(PinkMod.creativeTabs);

    }

    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        return false;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return false;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        BlockPos blockpos = pos.up();

        for (int i = 0; i < 128; ++i)
        {
            BlockPos blockpos1 = blockpos;
            int j = 0;

            while (true)
            {
                if (j >= i / 16)
                {
                    if (worldIn.isAirBlock(blockpos1))
                    {
                        if (rand.nextInt(8) == 0)
                        {
                            worldIn.getBiome(blockpos1).plantFlower(worldIn, rand, blockpos1);
                        }
                        else
                        {
                            IBlockState iblockstate1 = Blocks.TALLGRASS.getDefaultState().withProperty(BlockTallGrass.TYPE, BlockTallGrass.EnumType.GRASS);

                            if (Blocks.TALLGRASS.canBlockStay(worldIn, blockpos1, iblockstate1))
                            {
                                worldIn.setBlockState(blockpos1, iblockstate1, 3);
                            }
                        }
                    }

                    break;
                }

                blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);

                if (worldIn.getBlockState(blockpos1.down()).getBlock() != ModBlocks.blockPinkGrass || worldIn.getBlockState(blockpos1).isNormalCube())
                {
                    break;
                }


                ++j;
            }
        }
    }
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack held = player.getHeldItem(hand);
        if(held.getItem() instanceof ItemHoe && world.isAirBlock(pos.up())) {
            held.damageItem(1, player);
            world.setBlockState(pos, ModBlocks.blockPinkFarmland.getDefaultState(), 1 | 2);
            return true;
        }
        return false;}

    @Override
    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable)
    {
        IBlockState plant = plantable.getPlant(world, pos.offset(direction));
        net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));


        if (plant.getBlock() instanceof IGrowable)
        {
            return true;
        }
        if (plant.getBlock() instanceof IPlantable)
        {
            return true;
        }
        return false;
    }


    public static Block fromBlock = Blocks.DIRT; // change this to suit your need
    public static Block toBlock = ModBlocks.blockPinkDirt; // change this to suit your need

    @SubscribeEvent(priority= EventPriority.HIGHEST, receiveCanceled=true)
        public static void onEvent(ChunkEvent.Load event)
        {

            Chunk theChunk = event.getChunk();

            // replace all blocks of a type with another block type

            for (int x = 0; x < 16; ++x)
            {
                for (int z = 0; z < 16; ++z)
                {
                    for (int y = theChunk.getHeightValue(x, z)-20; y < theChunk.getHeightValue(x, z)+1; ++y)
                    {
                        if (theChunk.getBlockState(x, y, z).getBlock() == fromBlock)
                        {
                            theChunk.setBlockState(new BlockPos(x, y, z), toBlock.getDefaultState());
                        }
                    }
                }
            }
            theChunk.markDirty();
        }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}