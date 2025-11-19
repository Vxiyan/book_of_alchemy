package net.vxiyan;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.toasts.SystemToast;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class Book_of_alchemy_ScreenGUI extends Screen {
    public Book_of_alchemy_ScreenGUI(Component title) {
        super(title);
    }
    @Override
    protected void init() {
        Button buttonWidget = Button.builder(Component.nullToEmpty("Cast"), (btn) -> {
            this.minecraft.getToastManager().addToast(
                    SystemToast.multiline(this.minecraft, SystemToast.SystemToastId.NARRATOR_TOGGLE, Component.nullToEmpty("Spell Casted"), Component.nullToEmpty("Your element has been used to cast a spell!"))
            );
        }).bounds(40,20,120,20).build();
        this.addRenderableWidget(buttonWidget);
    }
}