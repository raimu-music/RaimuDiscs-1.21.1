package ch.raimu.raimudiscs.datagen;

import ch.raimu.raimudiscs.RaimuDiscsMod;
import ch.raimu.raimudiscs.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RaimuDiscsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.DISC_BLUE_DAWN.get());
        basicItem(ModItems.DISC_OVERGROWN.get());
        basicItem(ModItems.DISC_NATSUKASHII.get());
        basicItem(ModItems.DISC_KAZE_NI_NATTE.get());
        basicItem(ModItems.DISC_DANDELIONS_LULLABY.get());
        basicItem(ModItems.DISC_NAP_TIME_IN_SHIBUYA.get());
        basicItem(ModItems.DISC_EARTH_CALLING.get());
        basicItem(ModItems.DISC_FLUID_MIND.get());

        basicItem(ModItems.FRAGMENT_OVERGROWN.get());
        basicItem(ModItems.FRAGMENT_BLUE_DAWN.get());
        basicItem(ModItems.FRAGMENT_NATSUKASHII.get());
        basicItem(ModItems.FRAGMENT_KAZE_NI_NATTE.get());
        basicItem(ModItems.FRAGMENT_DANDELIONS_LULLABY.get());
        basicItem(ModItems.FRAGMENT_NAP_TIME_IN_SHIBUYA.get());
        basicItem(ModItems.FRAGMENT_EARTH_CALLING.get());
        basicItem(ModItems.FRAGMENT_FLUID_MIND.get());

    }
}
