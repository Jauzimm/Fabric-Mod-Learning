package john.mod;

import john.mod.block.ModBlocks;
import john.mod.item.ModItemGroups;
import john.mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeiroMod implements ModInitializer {
	public static final String MOD_ID = "primeiro-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}