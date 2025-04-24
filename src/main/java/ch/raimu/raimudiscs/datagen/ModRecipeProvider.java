package ch.raimu.raimudiscs.datagen;

import ch.raimu.raimudiscs.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        //RECIPE DEFINITION SECTION

        //DISCS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DISC_BLUE_DAWN.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', Ingredient.of(ModItems.FRAGMENT_BLUE_DAWN.get()))
                .unlockedBy("has_blue_dawn_fragment", has(ModItems.FRAGMENT_BLUE_DAWN.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DISC_OVERGROWN.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', Ingredient.of(ModItems.FRAGMENT_OVERGROWN.get()))
                .unlockedBy("has_overgrown_fragment", has(ModItems.FRAGMENT_OVERGROWN.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DISC_NATSUKASHII.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', Ingredient.of(ModItems.FRAGMENT_NATSUKASHII.get()))
                .unlockedBy("has_natsukashii_fragment", has(ModItems.FRAGMENT_NATSUKASHII.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DISC_KAZE_NI_NATTE.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', Ingredient.of(ModItems.FRAGMENT_KAZE_NI_NATTE.get()))
                .unlockedBy("has_kaze_ni_natte_fragment", has(ModItems.FRAGMENT_KAZE_NI_NATTE.get())).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DISC_DANDELIONS_LULLABY.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', Ingredient.of(ModItems.FRAGMENT_DANDELIONS_LULLABY.get()))
                .unlockedBy("has_dandelions_lullaby_fragment", has(ModItems.FRAGMENT_DANDELIONS_LULLABY.get())).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DISC_NAP_TIME_IN_SHIBUYA.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', Ingredient.of(ModItems.FRAGMENT_NAP_TIME_IN_SHIBUYA.get()))
                .unlockedBy("has_nap_time_in_shibuya_fragment", has(ModItems.FRAGMENT_NAP_TIME_IN_SHIBUYA.get())).save(recipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DISC_EARTH_CALLING.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', Ingredient.of(ModItems.FRAGMENT_EARTH_CALLING.get()))
                .unlockedBy("has_earth_calling_fragment", has(ModItems.FRAGMENT_EARTH_CALLING.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DISC_FLUID_MIND.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', Ingredient.of(ModItems.FRAGMENT_FLUID_MIND.get()))
                .unlockedBy("has_fluid_mind_fragment", has(ModItems.FRAGMENT_FLUID_MIND.get())).save(recipeOutput);

    }
}