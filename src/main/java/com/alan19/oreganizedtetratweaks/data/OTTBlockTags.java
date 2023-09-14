package com.alan19.oreganizedtetratweaks.data;

import com.alan19.oreganizedtetratweaks.OreganizedTetraTweaks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class OTTBlockTags extends BlockTagsProvider {
    public OTTBlockTags(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, OreganizedTetraTweaks.MODID, existingFileHelper);
    }
}
