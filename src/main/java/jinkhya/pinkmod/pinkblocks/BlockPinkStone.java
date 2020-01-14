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
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockPinkStone extends Block {

    public BlockPinkStone() {
        super(Material.ROCK);
        setRegistryName(new ResourceLocation(PinkMod.MOD_ID, "pink_stone"));
        setHardness(2.5f);
        setResistance(5);
        setSoundType(SoundType.STONE);
        setTranslationKey(PinkMod.MOD_ID + ".pink_stone");
        setCreativeTab(PinkMod.creativeTabs);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModBlocks.blockPinkCobblestone.getItemDropped(ModBlocks.blockPinkCobblestone.getDefaultState(), rand, fortune);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
