package net.B4n4n4_P0wer.banana_fixes.item;

import net.B4n4n4_P0wer.banana_fixes.BananaFixes;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BananaFixes.MOD_ID);

    public static final RegistryObject<Item> BLACK_SKKK  = ITEMS.register("black_skkk",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
