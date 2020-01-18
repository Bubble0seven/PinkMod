package jinkhya.pinkmod.init;

import jinkhya.pinkmod.ModBlocks;
import jinkhya.pinkmod.ModItems;
import jinkhya.pinkmod.PinkMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PinkmodRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.blockPinkCobblestone, new ItemStack(ModBlocks.blockPinkStone, 1), 1.5f);
        GameRegistry.addSmelting(ModItems.rosamondDust, new ItemStack(ModItems.rosamondIngot, 1), 1.5f);
        GameRegistry.addSmelting(ModBlocks.roseQuartzOre, new ItemStack(ModItems.roseQuartz, 1), 1.5f);
    }
}
