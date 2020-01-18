package jinkhya.pinkmod.proxy;

import jinkhya.pinkmod.ModBlocks;
import jinkhya.pinkmod.pinkblocks.*;
import jinkhya.pinkmod.init.OreDictionnaryCompat;
import jinkhya.pinkmod.pinkitems.materials.RosamondDust;
import jinkhya.pinkmod.pinkitems.materials.RosamondIngot;
import jinkhya.pinkmod.pinkitems.materials.RoseQuartz;
import jinkhya.pinkmod.pinkitems.tools.rosamond.*;
import jinkhya.pinkmod.pinkitems.tools.rosequartz.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class CommonProxy {


    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        //blocks
        event.getRegistry().register(new BlockPinkGrass());
        event.getRegistry().register(new BlockPinkDirt());
        event.getRegistry().register(new BlockPinkFarmland());
        event.getRegistry().register(new BlockPinkGrassPath());
        event.getRegistry().register(new BlockPinkPodzol());
        event.getRegistry().register(new BlockPinkCoarseDirt());
        event.getRegistry().register(new BlockPinkCobblestone());
        event.getRegistry().register(new BlockPinkMossyCobblestone());
        event.getRegistry().register(new BlockPinkStone());
        event.getRegistry().register(new RoseQuartzOre());


        //tiles
//        event.getRegistry().register(new PinkGrinder());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {


        //Blocks to Items
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkGrass).setRegistryName(ModBlocks.blockPinkGrass.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkDirt).setRegistryName(ModBlocks.blockPinkDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkFarmland).setRegistryName(ModBlocks.blockPinkFarmland.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkGrassPath).setRegistryName(ModBlocks.blockPinkGrassPath.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkPodzol).setRegistryName(ModBlocks.blockPinkPodzol.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkCoarseDirt).setRegistryName(ModBlocks.blockPinkCoarseDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkCobblestone).setRegistryName(ModBlocks.blockPinkCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkStone).setRegistryName(ModBlocks.blockPinkStone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkMossyCobblestone).setRegistryName(ModBlocks.blockPinkMossyCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.roseQuartzOre).setRegistryName(ModBlocks.roseQuartzOre.getRegistryName()));

        //Tiles to Items


        //Items
        event.getRegistry().register(new RoseQuartz());
        event.getRegistry().register(new RoseQuartzAxe());
        event.getRegistry().register(new RoseQuartzHoe());
        event.getRegistry().register(new RoseQuartzPickaxe());
        event.getRegistry().register(new RoseQuartzShovel());
        event.getRegistry().register(new RoseQuartzSword());

        event.getRegistry().register(new RosamondDust());
        event.getRegistry().register(new RosamondIngot());
        event.getRegistry().register(new RosamondAxe());
        event.getRegistry().register(new RosamondHoe());
        event.getRegistry().register(new RosamondPickaxe());
        event.getRegistry().register(new RosamondShovel());
        event.getRegistry().register(new RosamondSword());
        //Oredict
        OreDictionnaryCompat.registerOre("cobblestone", ModBlocks.blockPinkCobblestone);
        OreDictionnaryCompat.registerOre("stone", ModBlocks.blockPinkStone);
        OreDictionnaryCompat.registerOre("dirt", ModBlocks.blockPinkDirt);

    }

}
