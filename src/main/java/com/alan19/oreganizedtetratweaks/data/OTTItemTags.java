package com.alan19.oreganizedtetratweaks.data;

import com.alan19.oreganizedtetratweaks.OTItems;
import com.alan19.oreganizedtetratweaks.OTTTags;
import com.alan19.oreganizedtetratweaks.OreganizedTetraTweaks;
import galena.oreganized.index.OItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class OTTItemTags extends ItemTagsProvider {
    public OTTItemTags(DataGenerator generator, BlockTagsProvider provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, provider, OreganizedTetraTweaks.MODID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags() {
        tag(OTTTags.ELECTRUM_INGOTS).add(OItems.ELECTRUM_INGOT.get());
        tag(OTTTags.ELECTRUM_PLATED_DIAMOND).add(OTItems.ELECTRUM_PLATED_DIAMOND.get());
        tag(OTTTags.ELECTRUM_PLATED_TOOLS)
                .add(OItems.ELECTRUM_SWORD.get(), OItems.ELECTRUM_PICKAXE.get(), OItems.ELECTRUM_SHOVEL.get(), OItems.ELECTRUM_AXE.get(), OItems.ELECTRUM_HOE.get())
                .addOptional(new ResourceLocation("oreganized", "electrum_machete"))
                .addOptional(new ResourceLocation("oreganized", "electrum_knife"));
        tag(OTTTags.ELECTRUM_PLATED_SWORD).add(OItems.ELECTRUM_SWORD.get());
        tag(OTTTags.ELECTRUM_PLATED_PICKAXE).add(OItems.ELECTRUM_PICKAXE.get());
        tag(OTTTags.ELECTRUM_PLATED_SHOVEL).add(OItems.ELECTRUM_SHOVEL.get());
        tag(OTTTags.ELECTRUM_PLATED_AXE).add(OItems.ELECTRUM_AXE.get());
        tag(OTTTags.ELECTRUM_PLATED_HOE).add(OItems.ELECTRUM_HOE.get());
        tag(Tags.Items.TOOLS_SWORDS).addTags(OTTTags.ELECTRUM_PLATED_SWORD);
        tag(Tags.Items.TOOLS_PICKAXES).addTags(OTTTags.ELECTRUM_PLATED_PICKAXE);
        tag(Tags.Items.TOOLS_SHOVELS).addTags(OTTTags.ELECTRUM_PLATED_SHOVEL);
        tag(Tags.Items.TOOLS_AXES).addTags(OTTTags.ELECTRUM_PLATED_AXE);
        tag(Tags.Items.TOOLS_HOES).addTags(OTTTags.ELECTRUM_PLATED_HOE);
    }
}
