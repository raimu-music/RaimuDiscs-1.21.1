package ch.raimu.raimudiscs.item;

import ch.raimu.raimudiscs.RaimuDiscsMod;
import ch.raimu.raimudiscs.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RaimuDiscsMod.MOD_ID);



    public static final DeferredItem<Item> DISC_BLUE_DAWN = ITEMS.register("blue_dawn_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BLUE_DAWN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DISC_OVERGROWN = ITEMS.register("overgrown_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.OVERGROWN_KEY).stacksTo(1)));

    public static final DeferredItem<Item> FRAGMENT_BLUE_DAWN = ITEMS.register("blue_dawn_fragment",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FRAGMENT_OVERGROWN = ITEMS.register("overgrown_fragment",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
