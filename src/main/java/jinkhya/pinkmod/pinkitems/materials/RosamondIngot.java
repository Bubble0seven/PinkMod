package jinkhya.pinkmod.pinkitems.materials;

import jinkhya.pinkmod.PinkMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RosamondIngot extends Item {

        public RosamondIngot(){
            setRegistryName("rosamond_ingot");
            setTranslationKey(PinkMod.MOD_ID + ".rosamond_ingot");
            setCreativeTab(PinkMod.creativeTabs);
        }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(),"inventory"));
    }
}