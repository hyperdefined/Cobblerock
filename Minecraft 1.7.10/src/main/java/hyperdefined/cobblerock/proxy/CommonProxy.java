package hyperdefined.cobblerock.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hyperdefined.cobblerock.Cobblerock;
import hyperdefined.cobblerock.LoggerStrings;
import hyperdefined.cobblerock.init.AddNames;
import hyperdefined.cobblerock.init.BlockRegistry;
import hyperdefined.cobblerock.init.CraftingRecipes;
import hyperdefined.cobblerock.init.ItemRegistry;
import hyperdefined.cobblerock.init.SetCreativeTabs;

public class CommonProxy {
		
    public void preInit(FMLPreInitializationEvent e) {
    	Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_VERSION);
    	BlockRegistry.init();
		BlockRegistry.register();
		ItemRegistry.init();
		ItemRegistry.register();
    }
    
    public void init(FMLInitializationEvent e) {
    	AddNames.addItemNames();
    	SetCreativeTabs.addCreativeTabNames();
    	CraftingRecipes.Crafting();
    }

    public void postInit(FMLPostInitializationEvent e) {
    	Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_DONE_LOADING);
    	Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_MORE_INFO);
    }
}