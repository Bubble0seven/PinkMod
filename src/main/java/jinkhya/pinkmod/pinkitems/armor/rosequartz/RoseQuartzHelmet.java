package jinkhya.pinkmod.pinkitems.armor.rosequartz;

import jinkhya.pinkmod.ModItems;
import jinkhya.pinkmod.PinkMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static jinkhya.pinkmod.ModItems.ROSE_QUARTZ_HELMET;


public class RoseQuartzHelmet extends ItemArmor {


    public RoseQuartzHelmet() {
        super(ROSE_QUARTZ_HELMET, 1, EntityEquipmentSlot.HEAD);
        setRegistryName("rose_quartz_helmet");
        setTranslationKey(PinkMod.MOD_ID + ".rose_quartz_helmet");
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
        return input.getItem() == ModItems.roseQuartzHelmet && repair.getItem() == ModItems.roseQuartz;
    }

}
