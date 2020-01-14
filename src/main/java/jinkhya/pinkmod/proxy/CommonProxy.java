package jinkhya.pinkmod.proxy;

import jinkhya.pinkmod.ModBlocks;
import jinkhya.pinkmod.pinkblocks.*;
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
        event.getRegistry().register(new BlockPinkGrass());
        event.getRegistry().register(new BlockPinkDirt());
        event.getRegistry().register(new BlockPinkFarmland());
        event.getRegistry().register(new BlockPinkGrassPath());
        event.getRegistry().register(new BlockPinkPodzol());
        event.getRegistry().register(new BlockPinkCoarseDirt());
        event.getRegistry().register(new BlockPinkCobblestone());
        event.getRegistry().register(new BlockPinkMossyCobblestone());
        event.getRegistry().register(new BlockPinkStone());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkGrass).setRegistryName(ModBlocks.blockPinkGrass.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkDirt).setRegistryName(ModBlocks.blockPinkDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkFarmland).setRegistryName(ModBlocks.blockPinkFarmland.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkGrassPath).setRegistryName(ModBlocks.blockPinkGrassPath.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkPodzol).setRegistryName(ModBlocks.blockPinkPodzol.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkCoarseDirt).setRegistryName(ModBlocks.blockPinkCoarseDirt.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkCobblestone).setRegistryName(ModBlocks.blockPinkCobblestone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkStone).setRegistryName(ModBlocks.blockPinkStone.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.blockPinkMossyCobblestone).setRegistryName(ModBlocks.blockPinkMossyCobblestone.getRegistryName()));
    }

}