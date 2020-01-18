package jinkhya.pinkmod.pinkitems.armor.rosamond;

import jinkhya.pinkmod.ModItems;
import jinkhya.pinkmod.PinkMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static jinkhya.pinkmod.ModItems.ROSAMOND_CHESTPLATE;


public class RosamondChestplate extends ItemArmor {


    public RosamondChestplate() {
        super(ROSAMOND_CHESTPLATE, 1, EntityEquipmentSlot.CHEST);
        setRegistryName("rosamond_chestplate");
        setTranslationKey(PinkMod.MOD_ID + ".rosamond_chestplate");
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
        return input.getItem() == ModItems.rosamondChestplate && repair.getItem() == ModItems.rosamondIngot;
    }

}
