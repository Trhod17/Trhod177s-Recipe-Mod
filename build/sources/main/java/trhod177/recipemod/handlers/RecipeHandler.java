package trhod177.recipemod.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.ItemMonsterPlacer;

public class RecipeHandler {

	
	
	
	public static void initShapedRecipes() {
		GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN), new Object[] {"#W#", "#L#", "###", 'W', Items.WATER_BUCKET, 'L', Items.LAVA_BUCKET});
		GameRegistry.addRecipe(new ItemStack(Blocks.STONE), new Object[] {"#L#", "#W#", "###", 'W', Items.WATER_BUCKET, 'L', Items.LAVA_BUCKET});
		GameRegistry.addRecipe(new ItemStack(Items.SADDLE), new Object[] {"LLL", "LIL", "L#L", 'L', Items.LEATHER, 'I', Items.IRON_INGOT});
	    GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR, 2), new Object[] {"DWD", "WGW", "DWD", 'W', new ItemStack(Blocks.SKULL,1,1), 'D', Blocks.DIAMOND_BLOCK, 'G', Blocks.GLOWSTONE});
	    GameRegistry.addRecipe(new ItemStack(Blocks.DIAMOND_ORE), new Object[] {"SSS","SIS","SSS", 'S', Blocks.STONE, 'I', Items.DIAMOND});
	    GameRegistry.addRecipe(new ItemStack(Blocks.IRON_ORE), new Object[] {"SSS","SIS","SSS", 'S', Blocks.STONE, 'I', Items.IRON_INGOT});
	    GameRegistry.addRecipe(new ItemStack(Blocks.GOLD_ORE), new Object[] {"SSS","SIS","SSS", 'S', Blocks.STONE, 'I', Items.GOLD_INGOT});
	    GameRegistry.addRecipe(new ItemStack(Blocks.EMERALD_ORE), new Object[] {"SSS","SIS","SSS", 'S', Blocks.STONE, 'I', Items.EMERALD});
        GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING,8,0), new Object[] {"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,0)});
        GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING,8,1), new Object[] {"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,1)});
        GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING,8,2), new Object[] {"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,2)});
        GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING,8,3), new Object[] {"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,3)});
        GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING,8,4), new Object[] {"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,4)});
        GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING,8,5), new Object[] {"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,5)});
        GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE,8), new Object[] {"XXX","XXX","XXX", 'X', new ItemStack(Blocks.STONE,1,1)});
        GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE,8), new Object[] {"XXX","XXX","XXX", 'X', new ItemStack(Blocks.STONE,1,2)});
        GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE,8), new Object[] {"XXX","XXX","XXX", 'X', new ItemStack(Blocks.STONE,1,3)});
        GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE,8), new Object[] {"XXX","XXX","XXX", 'X', new ItemStack(Blocks.STONE,1,4)});
        GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE,8), new Object[] {"XXX","XXX","XXX", 'X', new ItemStack(Blocks.STONE,1,5)});
        GameRegistry.addRecipe(new ItemStack(Blocks.COBBLESTONE,8), new Object[] {"XXX","XXX","XXX", 'X', new ItemStack(Blocks.STONE,1,6)});
        GameRegistry.addRecipe(new ItemStack(Blocks.STONE,8), new Object[] {"XXX","XXX","XXX", 'X', Blocks.COBBLESTONE});
        GameRegistry.addRecipe(new ItemStack(Blocks.SPONGE,3), new Object[] {"BBB","WWW","SSS", 'B', Items.BREAD, 'W', Items.WATER_BUCKET, 'S', Blocks.SAND});
        
        
        
        
        
        
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,50), new Object[] {"GGG","EEE","GGG", 'G' ,Items.GUNPOWDER, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,51), new Object[] {"GGG","EEE","GGG", 'G' ,Items.BONE, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,52), new Object[] {"GGG","EEE","GGG", 'G' ,Items.SPIDER_EYE, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,54), new Object[] {"GGG","EEE","GGG", 'G' ,Items.ROTTEN_FLESH, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,55), new Object[] {"GGG","EEE","GGG", 'G' ,Items.SLIME_BALL, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,56), new Object[] {"GGG","EEE","GGG", 'G' ,Items.GHAST_TEAR, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,57), new Object[] {"GRG","EEE","GRG", 'G' ,Items.GOLD_NUGGET, 'E', Items.EGG, 'R', Items.ROTTEN_FLESH});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,58), new Object[] {"GGG","EEE","GGG", 'G' ,Items.ENDER_PEARL, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,59), new Object[] {"GSG","EEE","GSG", 'G' ,Items.SPIDER_EYE, 'E', Items.EGG, 'S', Blocks.STONE});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,60), new Object[] {"GGG","EEE","GGG", 'G' ,Items.IRON_INGOT, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,61), new Object[] {"GGG","EEE","GGG", 'G' ,Items.BLAZE_POWDER, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,62), new Object[] {"GGG","EEE","GGG", 'G' ,Items.MAGMA_CREAM, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,66), new Object[] {"GGG","EEE","GGG", 'G' ,Items.GLASS_BOTTLE, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,65), new Object[] {"GGG","EEE","GGG", 'G' ,Items.FLINT, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,90), new Object[] {"GGG","EEE","GGG", 'G' ,Items.PORKCHOP, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,91), new Object[] {"GGG","EEE","GGG", 'G' ,Blocks.WOOL, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,92), new Object[] {"GGG","EEE","GGG", 'G' ,Items.BEEF, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,93), new Object[] {"GGG","EEE","GGG", 'G' ,Items.CHICKEN, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,94), new Object[] {"GGG","EEE","GGG", 'G' ,Items.DYE, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,95), new Object[] {"GGG","EEE","GGG", 'G' ,Items.STICK, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,96), new Object[] {"GGG","EEE","BBB", 'B' ,Blocks.BROWN_MUSHROOM, 'G', Blocks.RED_MUSHROOM, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,98), new Object[] {"GGG","EEE","GGG", 'G' ,Items.FISH, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,100), new Object[] {"XGX","EEE","XLX", 'G' ,Items.SADDLE, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,16,120), new Object[] {"GGG","EEE","GGG", 'G' ,Items.EMERALD, 'E', Items.EGG});
 	    GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,68), new Object[] {"PPP","EEE","CCC", 'P', Items.PRISMARINE_SHARD, 'E', Items.EGG, 'C', Items.PRISMARINE_CRYSTALS });
		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,67), new Object[] {"PPP","EEE","FFF", 'P', Items.ENDER_PEARL, 'E', Items.EGG, 'F', Items.FLINT});
	    GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,65), new Object[] {"CCC","EEE","WWW", 'C', Items.CARROT, 'E', Items.EGG, 'W', Items.WHEAT});
	    GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,28), new Object[] {"BBB","EEE","LLL", 'B', Items.BONE, 'E', Items.EGG, 'L', Items.LEATHER});
	    GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,29), new Object[] {"RRR","EEE","BBB", 'R', Items.ROTTEN_FLESH, 'E', Items.EGG, 'B', Items.BONE}); 
	    GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,31), new Object[] {"CCC","EEE","LLL", 'C', Items.CARROT, 'E', Items.EGG, 'L', Items.LEATHER});
	    GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,32), new Object[] {"CCC","EEE","LLL", 'C', Blocks.CHEST, 'E', Items.EGG, 'L', Items.LEATHER});
	    GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,103), new Object[] {"CKC","EEE","CKC", 'C', Blocks.CHEST, 'K', Blocks.CARPET, 'E', Items.EGG});
	    GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,102), new Object[] {"SSS","EEE","SSS", 'S', Items.SNOWBALL, 'E', Items.EGG});
	    GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG,3,69), new Object[] {"CSC","EEE","CSC", 'C', Items.CHORUS_FRUIT, 'S', Items.SHULKER_SHELL, 'E', Items.EGG});
        
	    
	}
	
	

	public static void initShapelessRecipes() {
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.STRING, 4), new Object[] {Blocks.WOOL, new ItemStack(Items.SHEARS.setContainerItem(Items.SHEARS), OreDictionary.WILDCARD_VALUE), new ItemStack(Items.STICK.setContainerItem(Items.STICK))});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.NAME_TAG), new Object[] {Items.STRING, Items.PAPER, Items.SLIME_BALL});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.WHEAT_SEEDS), new Object[] {new ItemStack(Blocks.TALLGRASS,1,1)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LIT_PUMPKIN), new Object[] {Blocks.PUMPKIN, Items.GLOWSTONE_DUST});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE), new Object[] {Blocks.COBBLESTONE, Blocks.VINE});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRASS, 4), new Object[] {Blocks.DIRT, new ItemStack(Items.DYE,15)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONEBRICK,2, 4), new Object[] {Blocks.STONEBRICK, new ItemStack(Items.WOODEN_PICKAXE.setContainerItem(Items.WOODEN_PICKAXE))} );
        GameRegistry.addShapelessRecipe(new ItemStack(Items.BLAZE_POWDER, 8), new Object[] {Items.BLAZE_ROD, Blocks.STONE});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT,4,1), new Object[] {Blocks.DIRT,Blocks.DIRT,Blocks.GRAVEL,Blocks.GRAVEL});
	    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND,4,1), new Object[] {Blocks.SAND,Blocks.SAND,Blocks.SAND,Blocks.SAND,new ItemStack(Items.DYE,1,1)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.RABBIT_HIDE,4), new Object[] {Items.LEATHER});
	
	}

	public static void registerFurnaceRecipes() {
	   GameRegistry.addSmelting(Blocks.SEA_LANTERN, new ItemStack(Blocks.GLOWSTONE), 5F);
	   
	}
	

	

}