package hyperdefined.cobblerock.init;

import cpw.mods.fml.common.registry.GameRegistry;
import hyperdefined.cobblerock.Cobblerock;
import hyperdefined.cobblerock.LoggerStrings;
import hyperdefined.cobblerock.tools.BedrockBreaker;
import net.minecraft.item.Item;

public class ItemRegistry {
	
	public static Item bedrock_remover;
	
	public static void init() {
		Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_REGISTER_ITEM_CLASSES);
		bedrock_remover = new BedrockBreaker(24005, Cobblerock.bedrock_remover_material).setUnlocalizedName("bedrock_remover");		
	}
	public static void register() {
		Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_ADD_ITEMS);
		GameRegistry.registerItem(bedrock_remover, "bedrock_remover");
	}
}