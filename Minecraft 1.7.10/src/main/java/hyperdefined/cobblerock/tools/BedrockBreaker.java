package hyperdefined.cobblerock.tools;

import java.util.List;

import hyperdefined.cobblerock.Reference;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BedrockBreaker extends ItemPickaxe {

	public BedrockBreaker(int i, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("bedrock_remover");
		this.setNoRepair();
		this.setTextureName(Reference.MODID + ":" + "bedrock_remover");
	}

	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.epic;
	}

	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
	    if(!world.isRemote) {
	        if(world.getBlock(x, y, z) == Blocks.bedrock) {
	            world.setBlockToAir(x, y, z);
	            EntityItem entityitem = new EntityItem(world, x, y, z, new ItemStack(Blocks.bedrock, 1, 0));
	            world.spawnEntityInWorld(entityitem);
	            stack.damageItem(1, player);
	            return true;
	        }
	        else {
	            return false;
			}
		}
	    else {
			return false;
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4) {
	    lores.add("Right click bedrock to mine!");
	}
}