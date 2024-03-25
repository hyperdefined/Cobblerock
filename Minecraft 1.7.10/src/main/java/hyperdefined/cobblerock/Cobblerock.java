package hyperdefined.cobblerock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hyperdefined.cobblerock.init.BlockRegistry;
import hyperdefined.cobblerock.init.ItemRegistry;
import hyperdefined.cobblerock.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

	@Mod(name = Reference.MOD_NAME, modid = Reference.MODID, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MCVERSION)
	
	public class Cobblerock {
 
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
 	public static CommonProxy proxy;

	@Instance(Reference.MODID)
 	public static Cobblerock Instance;

 	public static final Logger LOGGER = LogManager.getLogger("Cobblerock");

 	public static CreativeTabs tabcobblerock = new CreativeTabs("tabcobblerock") {
 		public Item getTabIconItem() {
 			return Item.getItemFromBlock(BlockRegistry.dense_cobblestone);
 		}
 	};
 	
 	public static ToolMaterial bedrock_remover_material = EnumHelper.addToolMaterial("bedrock_remover_material", -1, 100, 0.1f, 0.1f, 0);
 	
 	@EventHandler
 	public void PreInit(FMLPreInitializationEvent e) {
 		proxy.preInit(e);
 		Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_PREINIT_DONE); 
 	}
 
 	@EventHandler
 	public void Init(FMLInitializationEvent e) {
 		proxy.init(e);
 	}
 
 	@EventHandler
 	public void postInit(FMLPostInitializationEvent e) {
 		proxy.postInit(e);
 	}
};