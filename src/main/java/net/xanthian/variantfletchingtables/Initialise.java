package net.xanthian.variantfletchingtables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;
import net.xanthian.variantfletchingtables.utils.ModCreativeTab;
import net.xanthian.variantfletchingtables.utils.ModPOITypes;
import net.xanthian.variantfletchingtables.utils.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantfletchingtables";

    @Override
    public void onInitialize() {

        Vanilla.registerVanillaTables();

        ifModLoaded("ad_astra", AdAstra::registerFletchingTables);

        ifModLoaded("beachparty", BeachParty::registerFletchingTables);

        ifModLoaded("betterarcheology", BetterArcheology::registerFletchingTables);

        ifModLoaded("bewitchment", Bewitchment::registerFletchingTables);

        ifModLoaded("biomemakeover", BiomeMakeover::registerFletchingTables);

        ifModLoaded("blockus", Blockus::registerFletchingTables);

        ifModLoaded("deeperdarker", DeeperAndDarker::registerFletchingTables);

        ifModLoaded("eldritch_end", EldritchEnd::registerFletchingTables);

        ifModLoaded("minecells", MineCells::registerFletchingTables);

        ifModLoaded("natures_spirit", NaturesSpirit::registerFletchingTables);

        ifModLoaded("promenade", Promenade::registerFletchingTables);

        ifModLoaded("regions_unexplored", () -> {
            RegionsUnexplored.registerFletchingTables();
            if (isModVersion("regions_unexplored", "0.4")) {
                RegionsUnexplored.register04FletchingTables();
            } else {
                RegionsUnexplored.register05FletchingTables();
            }
        });

        ifModLoaded("snifferplus", SnifferPlus::registerFletchingTables);

        ifModLoaded("techreborn", TechReborn::registerFletchingTables);

        ifModLoaded("vinery", Vinery::registerFletchingTables);

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();
        ModPOITypes.init();

        //Datagen Block - disable for client run
        //SnifferPlus.registerFletchingTables();
        //RegionsUnexplored.register04FletchingTables();
        //NaturesSpirit.registerFletchingTables();
        //DeeperAndDarker.registerFletchingTables();
        //BiomeMakeover.registerFletchingTables();
        //AdAstra.registerFletchingTables();

    }

    public static boolean isModVersion(String modId, String ver) {
        return FabricLoader.getInstance()
                .getModContainer(modId)
                .map(ModContainer::getMetadata)
                .map(ModMetadata::getVersion)
                .map(Version::getFriendlyString)
                .filter(version -> version.startsWith(ver))
                .isPresent();
    }

    public static void ifModLoaded(String modId, Runnable runnable) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            runnable.run();
        }
    }
}