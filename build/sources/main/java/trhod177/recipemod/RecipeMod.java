package trhod177.recipemod;


import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Optional.Method;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.recipemod.handlers.RecipeHandler;
import trhod177.recipemod.proxy.CommonProxy;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies = Reference.depend)
public class RecipeMod {
	
	
	
	public static trhod177.recipemod.proxy.CommonProxy CommonProxy;
	public static trhod177.recipemod.proxy.ClientProxy ClientProxy;
	
	@Mod.Instance(Reference.MODID)
	public static RecipeMod instance;

	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		RecipeHandler.initShapedRecipes();
		RecipeHandler.initShapelessRecipes();
		RecipeHandler.registerFurnaceRecipes();
		
		
	   }
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
	
		
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}
	
	
	
}

