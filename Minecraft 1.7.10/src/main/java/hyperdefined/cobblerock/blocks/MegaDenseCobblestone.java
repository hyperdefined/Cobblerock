package hyperdefined.cobblerock.blocks;

import hyperdefined.cobblerock.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MegaDenseCobblestone extends Block {

	public MegaDenseCobblestone(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(10f);
		this.setResistance(40f);
		this.setBlockTextureName(Reference.MODID + ":" + "mega_dense_cobblestone");
		this.setBlockName("mega_dense_cobblestone");
	}	
}