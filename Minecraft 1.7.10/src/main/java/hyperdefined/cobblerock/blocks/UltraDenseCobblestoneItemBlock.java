package hyperdefined.cobblerock.blocks;

import java.util.List;

import hyperdefined.cobblerock.init.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class UltraDenseCobblestoneItemBlock extends ItemBlock{

    public UltraDenseCobblestoneItemBlock(Block block) {
        super(BlockRegistry.ultra_dense_cobblestone);
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean show) {
        list.add("1 block = 6,561 cobblestone.");
    }
}