package jinkhya.pinkmod.pinkblocks;

import jinkhya.pinkmod.ModBlocks;
import jinkhya.pinkmod.ModItems;
import jinkhya.pinkmod.PinkMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;


public class RoseQuartzOre extends Block {
    private ThreadLocal<IBlockState> silk_check_state = new ThreadLocal();

    public RoseQuartzOre() {
        super(Material.ROCK);
        setSoundType(SoundType.STONE);
        setTranslationKey(PinkMod.MOD_ID + ".rose_quartz_ore");
        setRegistryName(new ResourceLocation(PinkMod.MOD_ID, "rose_quartz_ore"));
        setHardness(5.0F);
        setResistance(15);
        setHarvestLevel("pickaxe", 3);
        setCreativeTab(PinkMod.creativeTabs);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.roseQuartz;
    }

    public int quantityDropped(Random random)
    {
        return 1;
    }

    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0)
        {
            int j = random.nextInt(fortune + 2) - 1;
            if (j < 0)
            {
                j = 0;
            }
            return quantityDropped(random) * (j + 1);
        }
        else
        {
            return quantityDropped(random);
        }
    }
    @Deprecated //Forge: State sensitive version
    protected boolean canSilkHarvest()
    {
        return this.getDefaultState().isFullCube() && !this.hasTileEntity(silk_check_state.get());
    }
    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        Item item = Item.getItemFromBlock(this);
        int i = 0;

        if (item.getHasSubtypes())
        {
            i = this.getMetaFromState(state);
        }

        return new ItemStack(item, 1, i);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
