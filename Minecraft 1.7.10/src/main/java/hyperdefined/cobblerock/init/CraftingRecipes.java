package hyperdefined.cobblerock.init;

import cpw.mods.fml.common.registry.GameRegistry;
import hyperdefined.cobblerock.Cobblerock;
import hyperdefined.cobblerock.LoggerStrings;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingRecipes {
    public static void Crafting(){
        Cobblerock.LOGGER.info(LoggerStrings.COBBLEROCK_ADD_CRAFTING);
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.dense_cobblestone, 1), "XXX", "XXX", "XXX", 'X', Blocks.cobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.super_dense_cobblestone, 1), "XXX", "XXX", "XXX", 'X', BlockRegistry.dense_cobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.mega_dense_cobblestone, 1), "XXX", "XXX", "XXX", 'X', BlockRegistry.super_dense_cobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.ultra_dense_cobblestone, 1), "XXX", "XXX", "XXX", 'X', BlockRegistry.mega_dense_cobblestone);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.bedrock, 1), "XXX", "XXX", "XXX", 'X', BlockRegistry.ultra_dense_cobblestone);
        
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.ultra_dense_cobblestone, 36), "   ", " XX", " XX", 'X', Blocks.bedrock);
        
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 9), BlockRegistry.dense_cobblestone);
        GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.dense_cobblestone, 9), BlockRegistry.super_dense_cobblestone);
        GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.super_dense_cobblestone, 9), BlockRegistry.mega_dense_cobblestone);
        GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.mega_dense_cobblestone, 9), BlockRegistry.ultra_dense_cobblestone);
        
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.bedrock_remover, 1), " X ", " YX", "Y  ", 'X', Blocks.bedrock, 'Y', Items.stick);
    }
}