package oresAboveDiamonds.OresMod.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ChanceRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import oresAboveDiamonds.OresMod.config.OresAboveDiamondsConfig;
import oresAboveDiamonds.OresMod.lists.BlockList;

public class OreGeneration 
{	
	public static void setupOreGeneration() 
	{
		
		double d = OresAboveDiamondsConfig.amethyst_chance.get();
		float amethyst_chance = (float)d;
		
		double d2 = OresAboveDiamondsConfig.black_opal_chance.get();
		float black_opal_chance = (float)d2;
		
		
		
		for(Biome biome : ForgeRegistries.BIOMES) 
		{
			ChanceRangeConfig amethyst_ore_placement = new ChanceRangeConfig(amethyst_chance, 0, 0, 16);
			ChanceRangeConfig black_opal_ore_placement = new ChanceRangeConfig(black_opal_chance, 0, 0, 16);
			
				biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.amethyst_ore.getDefaultState(), OresAboveDiamondsConfig.amethyst_max_vein_size.get())).func_227228_a_( Placement.CHANCE_RANGE.func_227446_a_(amethyst_ore_placement)));

			

				biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.black_opal_ore.getDefaultState(), OresAboveDiamondsConfig.black_opal_max_vein_size.get())).func_227228_a_( Placement.CHANCE_RANGE.func_227446_a_(black_opal_ore_placement)));
				
		}
	}
}
