package john.mod.item;

import john.mod.PrimeiroMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings())); //REPLICAR PRA CRIAR NOVOS ITEMS

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PrimeiroMod.MOD_ID, name), item);
    }

     public static void registerModItems() {
         PrimeiroMod.LOGGER.info("Registering Mod Items for " + PrimeiroMod.MOD_ID);

         ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
             fabricItemGroupEntries.add(PINK_GARNET);
             fabricItemGroupEntries.add(RAW_PINK_GARNET); //REPLICAR PRA CRIAR NOVOS ITEMS
         });
     }
}
