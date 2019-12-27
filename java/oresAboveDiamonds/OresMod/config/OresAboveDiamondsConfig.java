package oresAboveDiamonds.OresMod.config;



import net.minecraftforge.common.ForgeConfigSpec;

public class OresAboveDiamondsConfig 
{
	public static ForgeConfigSpec.DoubleValue amethyst_chance;
	public static ForgeConfigSpec.DoubleValue black_opal_chance;
	
	public static ForgeConfigSpec.IntValue amethyst_max_vein_size;
	public static ForgeConfigSpec.IntValue black_opal_max_vein_size;
	
	public static ForgeConfigSpec.IntValue amethyst_armor_toughness;
	public static ForgeConfigSpec.IntValue black_opal_armor_toughness;
	
	public static ForgeConfigSpec.IntValue amethyst_armor_durability;
	public static ForgeConfigSpec.IntValue black_opal_armor_durability;
	
	public static ForgeConfigSpec.IntValue amethyst_helmet_armor;
	public static ForgeConfigSpec.IntValue amethyst_chestplate_armor;
	public static ForgeConfigSpec.IntValue amethyst_leggings_armor;
	public static ForgeConfigSpec.IntValue amethyst_boots_armor;
	
	public static ForgeConfigSpec.IntValue black_opal_helmet_armor;
	public static ForgeConfigSpec.IntValue black_opal_chestplate_armor;
	public static ForgeConfigSpec.IntValue black_opal_leggings_armor;
	public static ForgeConfigSpec.IntValue black_opal_boots_armor;
	
	public static ForgeConfigSpec.IntValue amethyst_attack_damage;
	public static ForgeConfigSpec.IntValue amethyst_efficiency;
	public static ForgeConfigSpec.IntValue amethyst_durability;
	
	public static ForgeConfigSpec.IntValue black_opal_attack_damage;
	public static ForgeConfigSpec.IntValue black_opal_efficiency;
	public static ForgeConfigSpec.IntValue black_opal_durability;
	
	public static ForgeConfigSpec.IntValue amethyst_enchantability;
	public static ForgeConfigSpec.IntValue black_opal_enchantability;
	
	public static ForgeConfigSpec.Builder server_output;
	
	
	public static void init(ForgeConfigSpec.Builder server)
	{
		server_output = server.comment("Ore Generation Configuration");
		
		amethyst_chance = server
				.comment("Chance for an Amethyst Ore vein to spawn in a chunk. 1.00 = As common as diamonds, 0.50 = Around half as common as diamonds etc. Default = 0.2875")
				.defineInRange("oregen.amethyst_chance", 0.2875d, 0.00, 1.00);
		
		black_opal_chance = server
				.comment("Chance for a Black Opal Ore vein to spawn in a chunk. Default = 0.0725")
				.defineInRange("oregen.black_opal_chance", 0.0725d, 0.00, 1.00);
		
		amethyst_max_vein_size = server
				.comment("Maximum vein size for an Amethyst Ore vein. For reference, diamonds have a max vein size of 8. Default = 7")
				.defineInRange("oregen.amethyst_max_vein_size", 7, 0, 64);
		
		black_opal_max_vein_size = server
				.comment("Maximum vein size for an Black Opal Ore vein. Default = 6")
				.defineInRange("oregen.black_opal_max_vein_size", 6, 0, 64);
		
		server.comment("Enchantability Configuration");
		
		amethyst_enchantability = server
				.comment("Amethyst Enchantability. A higher value makes it easier to obtain higher level enchantments for less experience. For reference, diamonds have an enchantability of 10 and gold has an enchantability of 25. Default = 35")
				.defineInRange("enchant.amethyst", 35, 0, 256);
		
		black_opal_enchantability = server
				.comment("Black Opal Enchantability. Default = 15")
				.defineInRange("enchant.black_opal", 15, 0, 256);
		
		server_output = server.comment("Tool Configuration");
		
		amethyst_attack_damage = server
				.comment("Base Attack Damage of the Amethyst Tool Set. For reference, the Diamond Tool Set has 3 base attack damage. Default = 4")
				.defineInRange("toolvalues.amethyst_ad", 4, 0, 16);
		
		amethyst_efficiency = server
				.comment("Efficiency of the Amethyst Tool Set. For reference, the Diamond Tool Set has 8 efficiency. Default = 12")
				.defineInRange("toolvalues.amethyst_efficiency", 12, 0, 64);
		
		amethyst_durability = server
				.comment("Durability of the Amethyst Tool Set. For reference, the Diamond Tool Set has 1561 durability. Set to -1 for infinite durability. Default = 5500")
				.defineInRange("toolvalues.amethyst_durability", 5500, 0, 999999);
		
		black_opal_attack_damage = server
				.comment("Base Attack Damage of the Black Opal Tool Set. Default = 5")
				.defineInRange("toolvalues.black_opal_ad", 5, 0, 16);
		
		black_opal_efficiency = server
				.comment("Efficiency of the Black Opal Tool Set. Default = 16")
				.defineInRange("toolvalues.black_opal_efficiency", 16, 0, 64);
		
		black_opal_durability = server
				.comment("Durability of the Black Opal Tool Set. Set to -1 for infinite durability. Default = -1")
				.defineInRange("toolvalues.black_opal_durability", -1, -1, 999999);
		
		
		server_output = server.comment("Armor Configuration");
		
		amethyst_armor_toughness = server
				.comment("Toughness for the Amethyst Armor Set. Toughness reduces the armor penetration of high damaging attacks. Default = 4")
				.defineInRange("armorvalues.amethyst_armor_toughness", 4 , 0, 16);
		
		black_opal_armor_toughness = server
				.comment("Toughness for the Black Opal Armor Set. Default = 6")
				.defineInRange("armorvalues.black_opal_armor_toughness", 6 , 0, 16);
		
		amethyst_armor_durability = server
				.comment("Base Durability for the Amethyst Armor Set. For reference, Diamond Armor has 33 base durability. Set -1 for infinite durability. Default = 132")
				.defineInRange("armorvalues.amethyst_armor_durability", 132, 0, 99999999);
		
		black_opal_armor_durability = server
				.comment("Average Durability for the Amethyst Armor Set. Set -1 for infinite durability. Default = -1")
				.defineInRange("armorvalues.black_opal_armor_durability", 0, 0, 99999999);
		
		server_output = server.comment("Warning: Due to the way armor damage reduction is calculated, a small change in the following values may substantially affect the power of the armor piece and may cause it to become unbalanced.");
		
		amethyst_helmet_armor = server
				.comment("Amethyst Helmet Armor Value. Indicates how many half-armor points the indicated armor will give. Default = 3")
				.defineInRange("armorvalues.amethyst_helmet_armor", 3, 0, 8);
		
		amethyst_chestplate_armor = server
				.comment("Amethyst Chestplate Armor Value. Default = 8")
				.defineInRange("armorvalues.amethyst_chestplate_armor", 8, 0, 16);
		
		amethyst_leggings_armor = server
				.comment("Amethyst Leggings Armor Value. Default = 7")
				.defineInRange("armorvalues.amethyst_leggings_armor", 7, 0, 16);
		
		amethyst_boots_armor = server
				.comment("Amethyst Boots Armor Value. Default = 3")
				.defineInRange("armorvalues.amethyst_boots_armor", 3, 0, 8);
		
		black_opal_helmet_armor = server
				.comment("Black Opal Helmet Armor Value. Default = 3")
				.defineInRange("armorvalues.black_opal_helmet_armor", 3, 0, 8);
		
		black_opal_chestplate_armor = server
				.comment("Black Opal Chestplate Armor Value. Default = 9")
				.defineInRange("armorvalues.black_opal_chestplate_armor", 9, 0, 16);
		
		black_opal_leggings_armor = server
				.comment("Black Opal Leggings Armor Value. Default = 7")
				.defineInRange("armorvalues.black_opal_leggings_armor", 7, 0, 16);
		
		black_opal_boots_armor = server
				.comment("Black Opal Boots Armor Value. Default = 3")
				.defineInRange("armorvalues.black_opal_boots_armor", 3, 0, 8);
		
		
		
	}
}
