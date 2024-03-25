package hyperdefined.cobblerock.blocks;

import hyperdefined.cobblerock.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DenseCobblestone extends Block {

	public DenseCobblestone(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(10f);
		this.setResistance(30f);
		this.setBlockTextureName(Reference.MODID + ":" + "dense_cobblestone");
		this.setBlockName("dense_cobblestone");
	}	
}