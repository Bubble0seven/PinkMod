package jinkhya.pinkmod.init;

import jinkhya.pinkmod.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionnaryCompat {

    public static void registerOre(String name, Block ore) {
        OreDictionary.registerOre("cobblestone", ModBlocks.blockPinkCobblestone);
        OreDictionary.registerOre("stone", ModBlocks.blockPinkStone);
        OreDictionary.registerOre("dirt", ModBlocks.blockPinkDirt);
    }
}
