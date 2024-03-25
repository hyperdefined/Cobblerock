package hyperdefined.cobblerock.init;

import cpw.mods.fml.common.registry.LanguageRegistry;
import hyperdefined.cobblerock.Cobblerock;
import hyperdefined.cobblerock.LoggerStrings;

public class AddNames {
	public static void addItemNames() {
		Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_ADD_NAMES);
		LanguageRegistry.addName(ItemRegistry.bedrock_remover, "Bedrock Remover");
		LanguageRegistry.addName(BlockRegistry.dense_cobblestone, "Dense Cobblestone");
		LanguageRegistry.addName(BlockRegistry.super_dense_cobblestone, "Super Dense Cobblestone");
		LanguageRegistry.addName(BlockRegistry.mega_dense_cobblestone, "Mega Dense Cobblestone");
		LanguageRegistry.addName(BlockRegistry.ultra_dense_cobblestone, "Ultra Dense Cobblestone");
	}
}