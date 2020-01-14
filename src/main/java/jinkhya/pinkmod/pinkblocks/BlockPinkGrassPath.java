package jinkhya.pinkmod.pinkblocks;

import jinkhya.pinkmod.ModBlocks;
import jinkhya.pinkmod.PinkMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

import static jinkhya.pinkmod.pinkblocks.BlockPinkFarmland.turnToDirt;


@SuppressWarnings("deprecation")
public class BlockPinkGrassPath extends Block {

    protected static final AxisAlignedBB FARMLAND_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.9375D, 1.0D);

    public BlockPinkGrassPath() {
        super(Material.GROUND);
        setRegistryName(new ResourceLocation(PinkMod.MOD_ID, "pink_grass_path"));
        setHardness((float) 0.5);
        setResistance(2.5f);
        setSoundType(SoundType.GROUND);
        setTranslationKey(PinkMod.MOD_ID + ".pink_grass_path");
        this.setLightOpacity(255);
        setCreativeTab(PinkMod.creativeTabs);
    }

    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        super.neighborChanged(state, worldIn, pos, blockIn, fromPos);

        if (worldIn.getBlockState(pos.up()).getMaterial().isSolid()) {
            turnToDirt(worldIn, pos);
        }
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return FARMLAND_AABB;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
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

