package hyperdefined.cobblerock.blocks;

import hyperdefined.cobblerock.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SuperDenseCobblestone extends Block{

	public SuperDenseCobblestone(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(10f);
		this.setResistance(40f);
		this.setBlockTextureName(Reference.MODID + ":" + "super_dense_cobblestone");
		this.setBlockName("super_dense_cobblestone");
	}	
}