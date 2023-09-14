package com.alan19.oreganizedtetratweaks;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OreganizedTetraTweaks.MODID);

    public static final RegistryObject<Item> ELECTRUM_PLATED_DIAMOND = ITEMS.register("electrum_plated_diamond", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
