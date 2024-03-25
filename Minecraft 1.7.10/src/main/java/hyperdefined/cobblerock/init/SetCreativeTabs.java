package hyperdefined.cobblerock.init;

import hyperdefined.cobblerock.Cobblerock;;

public class SetCreativeTabs {
    
    public static void addCreativeTabNames() {
        BlockRegistry.dense_cobblestone.setCreativeTab(Cobblerock.tabcobblerock);
        BlockRegistry.mega_dense_cobblestone.setCreativeTab(Cobblerock.tabcobblerock);
        BlockRegistry.super_dense_cobblestone.setCreativeTab(Cobblerock.tabcobblerock);
        BlockRegistry.ultra_dense_cobblestone.setCreativeTab(Cobblerock.tabcobblerock);
        ItemRegistry.bedrock_remover.setCreativeTab(Cobblerock.tabcobblerock);
    }
}