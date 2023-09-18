package com.alan19.oreganizedtetratweaks.data;

import com.alan19.oreganizedtetratweaks.OTItems;
import com.alan19.oreganizedtetratweaks.OreganizedTetraTweaks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModels extends ItemModelProvider {
    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, OreganizedTetraTweaks.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        forItem(OTItems.ELECTRUM_PLATED_DIAMOND);
    }

    private void forItem(RegistryObject<? extends Item> item) {
        singleTexture(item.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/" + item.getId().getPath()));
    }
}
