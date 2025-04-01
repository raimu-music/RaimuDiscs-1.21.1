package ch.raimu.raimudiscs.item;

import ch.raimu.raimudiscs.RaimuDiscsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
                DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RaimuDiscsMod.MOD_ID);

        public static final Supplier<CreativeModeTab> RAIMU_DISCS = CREATIVE_MODE_TAB.register("raimu_discs_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLUE_DAWN_MUSIC_DISC.get()))
                        .title(Component.translatable("creativetab.raimudiscsmod.raimu_discs"))
                        .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.BLUE_DAWN_MUSIC_DISC);
                        }).build());

        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TAB.register(eventBus);
        }
}
