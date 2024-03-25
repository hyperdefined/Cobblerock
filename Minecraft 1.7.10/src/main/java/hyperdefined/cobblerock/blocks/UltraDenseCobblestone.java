package hyperdefined.cobblerock.blocks;

import hyperdefined.cobblerock.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UltraDenseCobblestone extends Block{

	public UltraDenseCobblestone(int par1, int par2) {
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(10f);
		this.setResistance(50f);
		this.setBlockTextureName(Reference.MODID + ":" + "ultra_dense_cobblestone");
		this.setBlockName("ultra_dense_cobblestone");
	}	
}