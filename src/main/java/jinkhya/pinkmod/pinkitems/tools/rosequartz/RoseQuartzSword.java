package jinkhya.pinkmod.pinkitems.tools.rosequartz;

import jinkhya.pinkmod.ModItems;
import jinkhya.pinkmod.PinkMod;
import jinkhya.pinkmod.proxy.CommonProxy;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static jinkhya.pinkmod.ModItems.ROSE_QUARTZ_SWORD;


public class RoseQuartzSword extends ItemSword {

    public RoseQuartzSword() {
        super(ROSE_QUARTZ_SWORD);
        setRegistryName("rose_quartz_sword");
        setTranslationKey(PinkMod.MOD_ID + ".rose_quartz_sword");
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
        return input.getItem() == ModItems.roseQuartzSword && repair.getItem() == ModItems.roseQuartz;
    }
}
