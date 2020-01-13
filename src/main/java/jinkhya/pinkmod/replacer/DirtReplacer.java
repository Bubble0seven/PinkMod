package jinkhya.pinkmod.replacer;

import jinkhya.pinkmod.ModBlocks;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.chunk.ChunkPrimer;

import java.util.Random;

public class DirtReplacer extends Biome {

    private final BiomeHills.Type type;

    public DirtReplacer(BiomeHills.Type p_i46710_1_, Biome.BiomeProperties properties)
    {
        super(properties);

        if (p_i46710_1_ == BiomeHills.Type.EXTRA_TREES)
        {
            this.decorator.treesPerChunk = 3;
        }

        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityLlama.class, 5, 4, 6));
        this.type = p_i46710_1_;
    }

    @Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        this.topBlock = ModBlocks.blockPinkGrass.getDefaultState();
        this.fillerBlock = ModBlocks.blockPinkDirt.getDefaultState();

        if ((noiseVal < -1.0D || noiseVal > 2.0D) && this.type == BiomeHills.Type.MUTATED) {
            this.topBlock = Blocks.GRAVEL.getDefaultState();
            this.fillerBlock = Blocks.GRAVEL.getDefaultState();
        } else if (noiseVal > 1.0D && this.type != BiomeHills.Type.EXTRA_TREES) {
            this.topBlock = Blocks.STONE.getDefaultState();
            this.fillerBlock = Blocks.STONE.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }
}

