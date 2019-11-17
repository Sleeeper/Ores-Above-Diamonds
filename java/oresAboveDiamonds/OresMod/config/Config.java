package oresAboveDiamonds.OresMod.config;

import java.io.File;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import oresAboveDiamonds.OresMod.OresAboveDiamonds;

@Mod.EventBusSubscriber
public class Config {
	private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec config;
	
	static
	{
		OresAboveDiamondsConfig.init(builder);
		
		config = builder.build();
	}
	
	public static void loadConfig(ForgeConfigSpec config, String path)
	{
		OresAboveDiamonds.logger.info("Loading config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
		OresAboveDiamonds.logger.info("Built config:" + path);
		
		file.load();
		
		OresAboveDiamonds.logger.info("Loaded config: " + path);
		config.setConfig(file);
		
	}
}
