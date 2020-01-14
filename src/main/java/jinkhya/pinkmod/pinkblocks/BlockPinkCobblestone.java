package jinkhya.pinkmod.pinkblocks;

import jinkhya.pinkmod.PinkMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockPinkCobblestone extends Block {

    public BlockPinkCobblestone() {
        super(Material.ROCK);
        setRegistryName(new ResourceLocation(PinkMod.MOD_ID, "pink_cobblestone"));
        setHardness(2.5f);
        setResistance(5);
        setSoundType(SoundType.STONE);
        setTranslationKey(PinkMod.MOD_ID + ".pink_cobblestone");
        setCreativeTab(PinkMod.creativeTabs);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
