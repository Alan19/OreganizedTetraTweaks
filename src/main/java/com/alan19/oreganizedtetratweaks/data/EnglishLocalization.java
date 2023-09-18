package com.alan19.oreganizedtetratweaks.data;

import com.alan19.oreganizedtetratweaks.OTItems;
import com.alan19.oreganizedtetratweaks.OreganizedTetraTweaks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishLocalization extends LanguageProvider {
    public EnglishLocalization(DataGenerator gen) {
        super(gen, OreganizedTetraTweaks.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(OTItems.ELECTRUM_PLATED_DIAMOND.get(), "Electrum Plated Diamond");
        add("tetra.material.electrum_plated_diamond", "Electrum plated diamond");
        add("tetra.material.electrum_plated_diamond.prefix", "Electrum plated diamond");
    }
}
