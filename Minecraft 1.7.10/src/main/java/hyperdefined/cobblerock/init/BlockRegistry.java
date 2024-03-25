package hyperdefined.cobblerock.init;

import cpw.mods.fml.common.registry.GameRegistry;
import hyperdefined.cobblerock.Cobblerock;
import hyperdefined.cobblerock.LoggerStrings;
import hyperdefined.cobblerock.blocks.DenseCobblestone;
import hyperdefined.cobblerock.blocks.DenseCobblestoneItemBlock;
import hyperdefined.cobblerock.blocks.MegaDenseCobblestone;
import hyperdefined.cobblerock.blocks.MegaDenseCobblestoneItemBlock;
import hyperdefined.cobblerock.blocks.SuperDenseCobblestone;
import hyperdefined.cobblerock.blocks.SuperDenseCobblestoneItemBlock;
import hyperdefined.cobblerock.blocks.UltraDenseCobblestone;
import hyperdefined.cobblerock.blocks.UltraDenseCobblestoneItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class BlockRegistry {

	public static Block dense_cobblestone;
	public static Block super_dense_cobblestone;
	public static Block mega_dense_cobblestone;
	public static Block ultra_dense_cobblestone;
	public static ItemBlock dense_cobblestone_ItemBlock;
	public static ItemBlock super_dense_cobblestone_ItemBlock;
	public static ItemBlock mega_dense_cobblestone_ItemBlock;
	public static ItemBlock ultra_dense_cobblestone_ItemBlock;
	
	public static void init() {	
		Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_REGISTER_BLOCK_CLASSES);
		dense_cobblestone = new DenseCobblestone(32323, 0);
		super_dense_cobblestone = new SuperDenseCobblestone(42001, 0);
		mega_dense_cobblestone = new MegaDenseCobblestone(20401, 0);
		ultra_dense_cobblestone = new UltraDenseCobblestone(20401, 0);
	}
	
	public static void register() {
		Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_ADD_BLOCKS);
		GameRegistry.registerBlock(dense_cobblestone, DenseCobblestoneItemBlock.class, "dense_cobblestone");
		GameRegistry.registerBlock(super_dense_cobblestone, SuperDenseCobblestoneItemBlock.class, "super_dense_cobblestone");
		GameRegistry.registerBlock(mega_dense_cobblestone, MegaDenseCobblestoneItemBlock.class, "mega_dense_cobblestone");
		GameRegistry.registerBlock(ultra_dense_cobblestone, UltraDenseCobblestoneItemBlock.class, "ultra_dense_cobblestone");
	}
}