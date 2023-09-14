package com.alan19.oreganizedtetratweaks.data;

import com.alan19.oreganizedtetratweaks.OTTTags;
import com.alan19.oreganizedtetratweaks.OTItems;
import com.alan19.oreganizedtetratweaks.OreganizedTetraTweaks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class OTTRecipes extends RecipeProvider {
    public OTTRecipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        UpgradeRecipeBuilder.smithing(Ingredient.of(Tags.Items.GEMS_DIAMOND), Ingredient.of(OTTTags.ELECTRUM_INGOTS), OTItems.ELECTRUM_PLATED_DIAMOND.get())
                .unlocks("has_%s".formatted(OTTTags.ELECTRUM_INGOTS.location().getPath()), has(OTTTags.ELECTRUM_INGOTS))
                .save(pFinishedRecipeConsumer, new ResourceLocation(OreganizedTetraTweaks.MODID, "electrum_plated_diamond_smithing"));
    }
}
