package net.vxiyan;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.vxiyan.ScreenHandler;
public class Book_of_alchemy implements ModInitializer {
	public static final String MOD_ID = "book_of_alchemy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
	public void onInitialize() {
        System.out.println("Alchemy Initialized");
        ModItems.initialize();
        ScreenHandler.initialize();
    }
}
