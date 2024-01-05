package net.xanthian.variantfletchingtables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;
import net.xanthian.variantfletchingtables.utils.ModCreativeTab;
import net.xanthian.variantfletchingtables.utils.ModPOITypes;
import net.xanthian.variantfletchingtables.utils.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantfletchingtables";

    public static void ifModLoaded(String modId, Runnable runnable) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            runnable.run();
        }
    }

    @Override
    public void onInitialize() {

        Vanilla.registerVanillaTables();

        ifModLoaded("ad_astra", AdAstra::registerFletchingTables);

        ifModLoaded("beachparty", BeachParty::registerFletchingTables);

        ifModLoaded("betterarcheology", BetterArcheology::registerFletchingTables);

        ifModLoaded("bewitchment", Bewitchment::registerFletchingTables);

        ifModLoaded("biomemakeover", BiomeMakeover::registerFletchingTables);

        ifModLoaded("blockus", Blockus::registerFletchingTables);

        ifModLoaded("botania", Botania::registerFletchingTables);

        ifModLoaded("cinderscapes", Cinderscapes::registerFletchingTables);

        ifModLoaded("deeperdarker", DeeperAndDarker::registerFletchingTables);

        ifModLoaded("desolation", Desolation::registerFletchingTables);

        ifModLoaded("eldritch_end", EldritchEnd::registerFletchingTables);

        ifModLoaded("minecells", MineCells::registerFletchingTables);

        ifModLoaded("natures_spirit", NaturesSpirit::registerFletchingTables);

        ifModLoaded("promenade", Promenade::registerFletchingTables);

        ifModLoaded("regions_unexplored", RegionsUnexplored::registerFletchingTables);

        ifModLoaded("snifferplus", SnifferPlus::registerFletchingTables);

        ifModLoaded("techreborn", TechReborn::registerFletchingTables);

        ifModLoaded("vinery", Vinery::registerFletchingTables);

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();
        ModPOITypes.init();

        //Datagen Block - disable for client run
        //SnifferPlus.registerFletchingTables();
        //Botania.registerFletchingTables();
    }
}