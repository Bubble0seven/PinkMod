package jinkhya.pinkmod.pinkitems.materials;

import jinkhya.pinkmod.PinkMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RoseQuartz extends Item {

        public RoseQuartz(){
            setRegistryName("rose_quartz");
            setTranslationKey(PinkMod.MOD_ID + ".rose_quartz");
            setCreativeTab(PinkMod.creativeTabs);
            this.canRepair = true;

        }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(),"inventory"));
    }

}