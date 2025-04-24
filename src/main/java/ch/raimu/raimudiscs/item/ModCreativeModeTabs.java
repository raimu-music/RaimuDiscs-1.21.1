package ch.raimu.raimudiscs.item;

import ch.raimu.raimudiscs.RaimuDiscsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RaimuDiscsMod.MOD_ID);

    public static final Supplier<CreativeModeTab> RAIMU_DISCS_TAB = CREATIVE_MODE_TAB.register("raimu_discs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DISC_BLUE_DAWN.get()))
                    .title(Component.translatable("creativetab.raimudiscsmod.raimu_discs"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DISC_DANDELIONS_LULLABY);
                        output.accept(ModItems.DISC_NAP_TIME_IN_SHIBUYA);
                        output.accept(ModItems.DISC_FLUID_MIND);
                        output.accept(ModItems.DISC_OVERGROWN);
                        output.accept(ModItems.DISC_EARTH_CALLING);
                        output.accept(ModItems.DISC_BLUE_DAWN);
                        output.accept(ModItems.DISC_NATSUKASHII);
                        output.accept(ModItems.DISC_KAZE_NI_NATTE);

                        output.accept(ModItems.FRAGMENT_DANDELIONS_LULLABY);
                        output.accept(ModItems.FRAGMENT_NAP_TIME_IN_SHIBUYA);
                        output.accept(ModItems.FRAGMENT_FLUID_MIND);
                        output.accept(ModItems.FRAGMENT_OVERGROWN);
                        output.accept(ModItems.FRAGMENT_EARTH_CALLING);
                        output.accept(ModItems.FRAGMENT_BLUE_DAWN);
                        output.accept(ModItems.FRAGMENT_NATSUKASHII);
                        output.accept(ModItems.FRAGMENT_KAZE_NI_NATTE);

                    }).build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
