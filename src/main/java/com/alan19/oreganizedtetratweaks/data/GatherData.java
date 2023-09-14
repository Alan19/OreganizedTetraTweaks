package com.alan19.oreganizedtetratweaks.data;

import com.alan19.oreganizedtetratweaks.OreganizedTetraTweaks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OreganizedTetraTweaks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GatherData {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        generator.addProvider(true, new OTTRecipes(generator));
        OTTBlockTags blockTags = new OTTBlockTags(generator, existingFileHelper);
        generator.addProvider(true, new OTTItemTags(generator, blockTags, existingFileHelper));
    }
}
