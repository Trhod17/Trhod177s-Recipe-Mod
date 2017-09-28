package trhod177.recipemod.books;

import amerifrance.guideapi.api.GuideAPI;
import amerifrance.guideapi.api.GuideBook;
import amerifrance.guideapi.api.IGuideBook;
import amerifrance.guideapi.api.IPage;
import amerifrance.guideapi.api.impl.Book;
import amerifrance.guideapi.api.impl.abstraction.CategoryAbstract;
import amerifrance.guideapi.api.impl.abstraction.EntryAbstract;
import amerifrance.guideapi.category.CategoryItemStack;
import amerifrance.guideapi.entry.EntryItemStack;
import amerifrance.guideapi.page.PageFurnaceRecipe;
import amerifrance.guideapi.page.PageIRecipe;
import amerifrance.guideapi.page.PageText;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import trhod177.recipemod.Reference;
import trhod177.recipemod.handlers.RecipeHandler;

import javax.annotation.Nonnull;
import java.awt.*;
import java.util.*;
import java.util.List;

@GuideBook
public class RecipeGuide implements IGuideBook {
   
	
	public boolean spawnWithBook;
	 
	 
    public static Book myGuide;

    @Nonnull
    @Override
    public Book buildBook() {
    	
    	//Start of item recipes
    	
        // Create the map of entries. A LinkedHashMap is used to retain the order of entries.
        Map<ResourceLocation, EntryAbstract> item = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> block = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> furnace = new LinkedHashMap<ResourceLocation, EntryAbstract>();

        // Creation of first entry.
        List<IPage> saddle = new ArrayList<IPage>();
        item.put(new ResourceLocation("Item Recipes", "Saddle"), new EntryItemStack(saddle, "Saddle", new ItemStack(Items.SADDLE)));
        saddle.add(new PageText("The Recipe for a saddle."));
        saddle.add(new PageIRecipe(new ShapedOreRecipe(Items.SADDLE, "LLL", "LIL", "LXL", 'L', Items.LEATHER, 'I', Items.IRON_INGOT)));

        // Creation of second entry.
        List<IPage> netherstar = new ArrayList<IPage>();
        netherstar.add(new PageText("The Recipe for 2 nether stars."));
        netherstar.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.NETHER_STAR,2), "DWD", "WGW", "DWD", 'W', new ItemStack(Items.SKULL,1,1), 'D', Blocks.DIAMOND_BLOCK, 'G', Blocks.GLOWSTONE)));
        item.put(new ResourceLocation("Item Recipes", "Nether_Star"), new EntryItemStack(netherstar, "Nether Star", new ItemStack(Items.NETHER_STAR)));
         
        // Creation of third entry.
        List<IPage> saplings = new ArrayList<IPage>();
        saplings.add(new PageText("The crafting recipes for all the current minecraft saplings"));
        saplings.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.SAPLING,8,0),"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,0) )));
        saplings.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.SAPLING,8,1),"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,1) )));
        saplings.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.SAPLING,8,2),"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,2) )));
        saplings.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.SAPLING,8,3),"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,3) )));
        saplings.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.SAPLING,8,4),"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,4) )));
        saplings.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.SAPLING,8,5),"DDD","DAD","DDD", 'D', Blocks.DIRT, 'A', new ItemStack(Blocks.SAPLING,1,5)  )));
        item.put(new ResourceLocation("Item Recipes", "saplings"), new EntryItemStack(saplings, "sapling", new ItemStack(Blocks.SAPLING)));
        
        // Creation of fourth entry.
        List<IPage> string = new ArrayList<IPage>();
        string.add(new PageText("Shapeless Recipe For String"));
        string.add(new PageIRecipe(new ShapelessOreRecipe(new ItemStack(Items.STRING,4), Blocks.WOOL, Items.SHEARS, Items.STICK)));
        item.put(new ResourceLocation("Item Recipes", "string"), new EntryItemStack(string, "string", new ItemStack(Items.STRING)));
        
        // Creation of fifth entry.
        List<IPage> nametag = new ArrayList<IPage>();
        nametag.add(new PageText("Shapeless recipe for a nametag"));
        nametag.add(new PageIRecipe(new ShapelessOreRecipe(new ItemStack(Items.NAME_TAG), Items.PAPER, Items.STRING, Items.PAPER)));
        item.put(new ResourceLocation("Item Recipes", "nametag"), new EntryItemStack(nametag, "nametag", new ItemStack(Items.NAME_TAG))); 
        
        // Creation of sixth entry.
        List<IPage> seeds = new ArrayList<IPage>();
        seeds.add(new PageText("Shapeless Recipe for wheat seeds"));
        seeds.add(new PageIRecipe(new ShapelessOreRecipe(new ItemStack(Items.WHEAT_SEEDS), new ItemStack(Blocks.TALLGRASS,1,1))));
        item.put(new ResourceLocation("Item Recipes", "seeds"), new EntryItemStack(seeds, "seeds", new ItemStack(Items.WHEAT_SEEDS)));
        
        // Creation of seventh entry.
        List<IPage> blaze = new ArrayList<IPage>();        
        blaze.add(new PageText("Shapesless recipe for 8 blaze powder"));
        blaze.add(new PageIRecipe(new ShapelessOreRecipe(new ItemStack(Items.BLAZE_POWDER,8), Items.BLAZE_ROD, Blocks.STONE)));
        item.put(new ResourceLocation("Item Recipes", "blaze"), new EntryItemStack(blaze, "blaze", new ItemStack(Items.BLAZE_POWDER)));
        
        // Creation of eighth entry.
        List<IPage> hide = new ArrayList<IPage>();
        hide.add(new PageText("Shapeless recipe for 4 rabbit hide"));
        hide.add(new PageIRecipe(new ShapelessOreRecipe(new ItemStack(Items.RABBIT_HIDE), Items.LEATHER)));
        item.put(new ResourceLocation("Item Recipes", "hide"), new EntryItemStack(hide, "hide", new ItemStack(Items.RABBIT_HIDE)));
        
        // Creation of ninth entry
        List<IPage> spawn = new ArrayList<IPage>();
        spawn.add(new PageText("Recipes for 3 spawn eggs. The villager spawn egg recipe gives you 8 instead of 3."));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,50), "GGG","EEE","GGG", 'G' ,Items.GUNPOWDER, 'E', Items.EGG )));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,51), "GGG","EEE","GGG", 'G' ,Items.BONE, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,52), "GGG","EEE","GGG", 'G' ,Items.SPIDER_EYE, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,54), "GGG","EEE","GGG", 'G' ,Items.ROTTEN_FLESH, 'E', Items.EGG )));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,55), "GGG","EEE","GGG", 'G' ,Items.SLIME_BALL, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,56), "GGG","EEE","GGG", 'G' ,Items.GHAST_TEAR, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,57), "GRG","EEE","GRG", 'G' ,Items.GOLD_NUGGET, 'E', Items.EGG, 'R', Items.ROTTEN_FLESH)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,58), "GGG","EEE","GGG", 'G' ,Items.ENDER_PEARL, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,59), "GSG","EEE","GSG", 'G' ,Items.SPIDER_EYE, 'E', Items.EGG, 'S', Blocks.STONE)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,60), "GGG","EEE","GGG", 'G' ,Items.IRON_INGOT, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,61), "GGG","EEE","GGG", 'G' ,Items.BLAZE_POWDER, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,62), "GGG","EEE","GGG", 'G' ,Items.MAGMA_CREAM, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,66), "GGG","EEE","GGG", 'G' ,Items.GLASS_BOTTLE, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,65), "GGG","EEE","GGG", 'G' ,Items.FLINT, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,90), "GGG","EEE","GGG", 'G' ,Items.PORKCHOP, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,91), "GGG","EEE","GGG", 'G' ,Blocks.WOOL, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,92), "GGG","EEE","GGG", 'G' ,Items.BEEF, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,93), "GGG","EEE","GGG", 'G' ,Items.CHICKEN, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,94), "GGG","EEE","GGG", 'G' ,Items.DYE, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,95), "GGG","EEE","GGG", 'G' ,Items.STICK, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,96), "GGG","EEE","BBB", 'B' ,Blocks.BROWN_MUSHROOM, 'G', Blocks.RED_MUSHROOM, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,98), "GGG","EEE","GGG", 'G' ,Items.FISH, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,100), "XGX","EEE","XLX", 'G' ,Items.SADDLE, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,16,120), "GGG","EEE","GGG", 'G' ,Items.EMERALD, 'E', Items.EGG)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,68), "PPP","EEE","CCC", 'P', Items.PRISMARINE_SHARD, 'E', Items.EGG, 'C', Items.PRISMARINE_CRYSTALS)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,67), "PPP","EEE","FFF", 'P', Items.ENDER_PEARL, 'E', Items.EGG, 'F', Items.FLINT)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,65), "CCC","EEE","WWW", 'C', Items.CARROT, 'E', Items.EGG, 'W', Items.WHEAT)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,28), "BBB","EEE","LLL", 'B', Items.BONE, 'E', Items.EGG, 'L', Items.LEATHER)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,29),  "RRR","EEE","BBB", 'R', Items.ROTTEN_FLESH, 'E', Items.EGG, 'B', Items.BONE))); 
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,31),  "CCC","EEE","LLL", 'C', Items.CARROT, 'E', Items.EGG, 'L', Items.LEATHER)));
        spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,32),  "CCC","EEE","LLL", 'C', Blocks.CHEST, 'E', Items.EGG, 'L', Items.LEATHER)));
	    spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,103), "CKC","EEE","CKC", 'C', Blocks.CHEST, 'K', Blocks.CARPET, 'E', Items.EGG)));
	    spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,102), "SSS","EEE","SSS", 'S', Items.SNOWBALL, 'E', Items.EGG)));
	    spawn.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Items.SPAWN_EGG,3,69), "CSC","EEE","CSC", 'C', Items.CHORUS_FRUIT, 'S', Items.SHULKER_SHELL, 'E', Items.EGG)));
        item.put(new ResourceLocation("Item Recipes", "spawn"), new EntryItemStack(spawn, "spawn", new ItemStack(Items.SPAWN_EGG,1,120)));
        
        
        // Creation of tenth entry.
        
        
        
        // End of item recipes.
        
        
        // Start of block recipes.
           
        // Creation of first entry.
        List<IPage> cobblestone = new ArrayList<IPage>();
        cobblestone.add(new PageText("The recipes for cobblestone")); 
        cobblestone.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE,8), "XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE,1,1))));
        cobblestone.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE,8), "XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE,1,2))));
        cobblestone.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE,8), "XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE,1,3))));
        cobblestone.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE,8), "XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE,1,4))));
        cobblestone.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE,8), "XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE,1,5))));
        cobblestone.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE,8), "XXX", "XXX", "XXX", 'X', new ItemStack(Blocks.STONE,1,6))));
        block.put(new ResourceLocation("Block Recipes", "cobblestone"), new EntryItemStack(cobblestone, "cobblestone", new ItemStack(Blocks.COBBLESTONE)));
        
        
        // Creation of second entry.
        List<IPage> mossy = new ArrayList<IPage>();
        mossy.add(new PageText("The shapeless recipe for mossy cobblestone"));
        mossy.add(new PageIRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE), Blocks.VINE, Blocks.COBBLESTONE)));
        block.put(new ResourceLocation("Block Recipes", "mossy"), new EntryItemStack(mossy, "mossy", new ItemStack(Blocks.MOSSY_COBBLESTONE)));
        
        
        // Creation of third entry,
        List<IPage> obsidian_and_stone = new ArrayList<IPage>();
        obsidian_and_stone.add(new PageText("The Recipes for obsidian and stone"));
        obsidian_and_stone.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.OBSIDIAN),"#W#", "#L#", "###", 'W', Items.WATER_BUCKET, 'L', Items.LAVA_BUCKET)));
        obsidian_and_stone.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.STONE),"#L#", "#W#", "###", 'W', Items.WATER_BUCKET, 'L', Items.LAVA_BUCKET)));
        block.put(new ResourceLocation("Block Recipes", "obstone"), new EntryItemStack(obsidian_and_stone, "obstone", new ItemStack(Blocks.OBSIDIAN)));
        
        
        // Creation of fourth entry.
        List<IPage> ore = new ArrayList<IPage>();        
        ore.add(new PageText("The Recipes for diamond/gold/iron/emerald ore"));
        ore.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.DIAMOND_ORE), "SSS","SDS","SSS", 'D', Items.DIAMOND, 'S', Blocks.STONE)));
        ore.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.GOLD_ORE), "SSS","SDS","SSS", 'D', Items.GOLD_INGOT, 'S', Blocks.STONE)));
        ore.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.IRON_ORE), "SSS","SDS","SSS", 'D', Items.IRON_INGOT, 'S', Blocks.STONE)));
        ore.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.EMERALD_ORE), "SSS","SDS","SSS", 'D', Items.EMERALD, 'S', Blocks.STONE)));
        block.put(new ResourceLocation("Block Recipes", "ore"), new EntryItemStack(ore, "ore", new ItemStack(Blocks.DIAMOND_ORE)));
        
        // Creation of fifth entry.
        List<IPage> stone = new ArrayList<IPage>();
        stone.add(new PageText("Another stone recipe"));
        stone.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.STONE,8), "XXX", "XXX", "XXX", 'X', Blocks.COBBLESTONE)));
        stone.add(new PageText("I must have been Stoned when i came up with this recipe."));
        block.put(new ResourceLocation("Block Recipes", "stone"), new EntryItemStack(stone, "stone", new ItemStack(Blocks.STONE)));
        
        
        // Creation of Sixth entry.
        List<IPage> sponge = new ArrayList<IPage>();
        sponge.add(new PageText("The recipe for sponge"));
        sponge.add(new PageIRecipe(new ShapedOreRecipe(new ItemStack(Blocks.SPONGE,3), "BBB", "WWW", "SSS", 'B', Items.BREAD, 'W', Items.WATER_BUCKET, 'S', Blocks.SAND)));
        block.put(new ResourceLocation("Block Recipes", "sponge"), new EntryItemStack(sponge, "sponge", new ItemStack(Blocks.SPONGE)));
        
        // End of block recipes.
        
        // Start of furnace recipes.
        
        // Creation of first entry.
        List<IPage> glowstone = new ArrayList<IPage>();
        glowstone.add(new PageText("Furnace recipe for glowstone"));
        glowstone.add(new PageFurnaceRecipe(Blocks.SEA_LANTERN));
        furnace.put(new ResourceLocation("furnace", "glowstone"), new EntryItemStack(glowstone, "Furnace Recipes", new ItemStack(Blocks.GLOWSTONE)));
        
        // End of furnace recipes.
        
        // Setup the list of categories and add our entries to it.
        List<CategoryAbstract> RecipeTypes = new ArrayList<CategoryAbstract>();
        RecipeTypes.add(new CategoryItemStack(item, "Item Recipes", new ItemStack(Items.STICK)));
        RecipeTypes.add(new CategoryItemStack(block, "Block Recipes", new ItemStack(Blocks.PLANKS)));
        RecipeTypes.add(new CategoryItemStack(furnace, "Furnace Recipes", new ItemStack(Blocks.FURNACE)));
        
        // Setup the book's base information
        myGuide = new Book();
        myGuide.setTitle("Trhod177's Recipe Guide");
        myGuide.setDisplayName("Trhod177's Recipe Guide");
        myGuide.setAuthor("Trhod177");
        myGuide.setWelcomeMessage("Trhod177's Recipe Guide");
        myGuide.setColor(Color.CYAN);
        myGuide.setCategoryList(RecipeTypes);
        myGuide.setRegistryName(new ResourceLocation(Reference.MODID, Reference.NAME));
        return myGuide;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void handleModel(ItemStack bookStack) {
        // Use the default GuideAPI model 
        GuideAPI.setModel(myGuide);
    }

    @Override
    public void handlePost(ItemStack bookStack) {
        // Register a recipe so player's can obtain the book
        GameRegistry.addShapelessRecipe(bookStack, Items.BOOK, Items.PAPER);
    }
    
    
    
    	
    
    
    
}