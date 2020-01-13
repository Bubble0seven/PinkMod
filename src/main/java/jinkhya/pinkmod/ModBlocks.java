package jinkhya.pinkmod;

import jinkhya.pinkmod.pinkblocks.BlockPinkDirt;
import jinkhya.pinkmod.pinkblocks.BlockPinkFarmland;
import jinkhya.pinkmod.pinkblocks.BlockPinkGrass;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("pinkmod:pink_grass")
    public static BlockPinkGrass blockPinkGrass;

    @GameRegistry.ObjectHolder("pinkmod:pink_dirt")
    public static BlockPinkDirt blockPinkDirt;

    @GameRegistry.ObjectHolder("pinkmod:pink_farmland")
    public static BlockPinkFarmland blockPinkFarmland;
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockPinkDirt.initModel();
        blockPinkGrass.initModel();
        blockPinkFarmland.initModel();
    }

}

