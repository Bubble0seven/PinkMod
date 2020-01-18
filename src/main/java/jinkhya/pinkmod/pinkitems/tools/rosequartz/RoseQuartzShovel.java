package jinkhya.pinkmod.pinkitems.tools.rosequartz;

import jinkhya.pinkmod.ModItems;
import jinkhya.pinkmod.PinkMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static jinkhya.pinkmod.ModItems.ROSE_QUARTZ_SHOVEL;


public class RoseQuartzShovel extends ItemSpade {

    public RoseQuartzShovel() {
        super(ROSE_QUARTZ_SHOVEL);
        setRegistryName("rose_quartz_shovel");
        setTranslationKey(PinkMod.MOD_ID + ".rose_quartz_shovel");
        setCreativeTab(PinkMod.creativeTabs);

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        //input is the itemStack to be repaired, repair is the itemStack that should repair this item.
        //Change the bronze items to your own.
        return input.getItem() == ModItems.roseQuartzShovel && repair.getItem() == ModItems.roseQuartz;
    }
}
