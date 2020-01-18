package jinkhya.pinkmod;

import jinkhya.pinkmod.pinkblocks.*;
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

    @GameRegistry.ObjectHolder("pinkmod:pink_grass_path")
    public static BlockPinkGrassPath blockPinkGrassPath;

    @GameRegistry.ObjectHolder("pinkmod:pink_podzol")
    public static BlockPinkPodzol blockPinkPodzol;

    @GameRegistry.ObjectHolder("pinkmod:pink_coarse_dirt")
    public static BlockPinkCoarseDirt blockPinkCoarseDirt;

    @GameRegistry.ObjectHolder("pinkmod:pink_stone")
    public static BlockPinkStone blockPinkStone;

    @GameRegistry.ObjectHolder("pinkmod:pink_cobblestone")
    public static BlockPinkCobblestone blockPinkCobblestone;

    @GameRegistry.ObjectHolder("pinkmod:pink_mossy_cobblestone")
    public static BlockPinkMossyCobblestone blockPinkMossyCobblestone;

    @GameRegistry.ObjectHolder("pinkmod:rose_quartz_ore")
    public static RoseQuartzOre roseQuartzOre;




    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockPinkDirt.initModel();
        blockPinkGrass.initModel();
        blockPinkFarmland.initModel();
        blockPinkGrassPath.initModel();
        blockPinkPodzol.initModel();
        blockPinkCoarseDirt.initModel();
        blockPinkMossyCobblestone.initModel();
        blockPinkCobblestone.initModel();
        blockPinkStone.initModel();
        roseQuartzOre.initModel();
    }
    
}

