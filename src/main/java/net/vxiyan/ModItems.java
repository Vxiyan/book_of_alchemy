package net.vxiyan;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import java.util.function.Function;
import java.util.logging.Level;
//import net.minecraft.util.TypedActionResult;
//import net.minecraft.screens.ScreenHandlerType;
//import net.minecraft.text.Text;
//import net.minecraft.client.gui.DrawContext;

public class ModItems {
    public static Item register(String name, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Book_of_alchemy.MOD_ID, name));
        Item item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final Item Book_of_Alchemy = register("book_of_alchemy", Item::new, new Item.Properties().stacksTo(1).useCooldown(5));
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(ModItems.Book_of_Alchemy));
    }
}

// In your custom Item class, override the use method
//@Override
//public TypedActionResult<ItemStack> use(Level world, Player user, InteractionHand hand) {
    //if (world.isClient) {
        //Minecraft.getInstance().setScreen(new MyCustomScreen(new MyCustomScreenHandler(ScreenHandlerType.GENERIC_9X3, 0)));
    //}
    //return TypedActionResult.success(user.getStackInHand(hand));
//}

// Create your custom Screen
//public class MyCustomScreen extends Screen {
    //public MyCustomScreen(ScreenHandler handler) {
        //super(Text.of("My Custom GUI"));
        // Initialize your screen handler and other components
    //}

    //@Override
    //protected void init() {
        // Add widgets, buttons, etc.
    //}

    //@Override
    //public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        //this.renderBackground(context); // Renders the default background
        //super.render(context, mouseX, mouseY, delta);
    //}
//}

// Create your custom ScreenHandler
//public class MyCustomScreenHandler extends ScreenHandler {
    //public MyCustomScreenHandler(ScreenHandlerType<?> type, int syncId) {
        //super(type, syncId);
    //}

    //@Override
    //public ItemStack quickMove(Player player, int slot) {
        // Implement quick move logic
        //return ItemStack.EMPTY;
    //}

    //@Override
    //public boolean canUse(Player player) {
        //return true; // Or implement custom conditions
    //}
//}