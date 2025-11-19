package net.vxiyan;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

public class ScreenHandler {
    public static void initialize() {
        Minecraft.getInstance().setScreen(new Book_of_alchemy_ScreenGUI(Component.empty()));
    }
}
