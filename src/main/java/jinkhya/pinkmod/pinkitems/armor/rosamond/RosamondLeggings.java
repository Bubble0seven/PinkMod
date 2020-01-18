package jinkhya.pinkmod.pinkitems.armor.rosamond;

import com.google.common.collect.Sets;
import jinkhya.pinkmod.ModItems;
import jinkhya.pinkmod.PinkMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Set;

import static jinkhya.pinkmod.ModItems.ROSAMOND_LEGGINGS;


public class RosamondLeggings extends ItemArmor {


    public RosamondLeggings() {
        super(ROSAMOND_LEGGINGS, 2, EntityEquipmentSlot.LEGS);
        setRegistryName("rosamond_leggings");
        setTranslationKey(PinkMod.MOD_ID + ".rosamond_leggings");
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
        return input.getItem() == ModItems.rosamondLeggings && repair.getItem() == ModItems.rosamondIngot;
    }

}
