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

        basicItem(ModItems.BLUE_DAWN_MUSIC_DISC.get());


    }
}
