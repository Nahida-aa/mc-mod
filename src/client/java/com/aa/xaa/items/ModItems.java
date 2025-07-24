package com.aa.xaa.items;

import java.util.List;

import com.aa.xaa.Xaa;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.world.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.data.registries;.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
// import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void initialize() {
        registerItems();
        // Add the suspicious substance to the composting registry with a 30% chance of
        // increasing the composter's level.e
        CompostingChanceRegistry.INSTANCE.add(ModItems.SUSPICIOUS_SUBSTANCE, 0.3f);

        // Add the suspicious substance to the registry of fuels, with a burn time of 30
        // seconds.
        // Remember, Minecraft deals with logical based-time using ticks.
        // 20 ticks = 1 second.
        FuelRegistry.INSTANCE.add(ModItems.SUSPICIOUS_SUBSTANCE, 30 * 20);
    }

    // Register an item with the given key name path. 调用 官方的 Registry.register() 方法
    public static Item register(String keyNamePath, Item item) {
        final RegistryKey<Item> ITEM_KEY = RegistryKey.of(
            RegistryKeys.ITEM,
            Identifier.of(Xaa.MOD_ID, keyNamePath)); // 一个被声明为 final 的变量在初始化之后不能被改变。

        // Register the item.： 将 item 注册到 Registries.ITEM
        Item registeredItem = Registry.register(
            Registries.ITEM,
            ITEM_KEY.getValue(),
            item);

        // Return the registered item!
        return registeredItem;
    }

    public static final Item SUSPICIOUS_SUBSTANCE = register("suspicious_substance", new Item(new Item.Settings()));
    
    public static final Item ICE_ETHER = register("ice_ether", new Item(new Item.Settings()));

    // public static final ToolMaterial GUIDITE_TOOL_MATERIAL = new ToolMaterial(
    //     BlockTags.WOODEN_SLABS,
    //     455,
    //     5.0F,
    //     1.5F,
    //     22,
    //     GuiditeArmorMaterial.REPAIRS_GUIDITE_ARMOR
    // );

    // public static final RegistryKey<Item> GUIDITE_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM,
    //         Identifier.of(Xaa.MOD_ID, "guidite_sword"));
    // public static final Item GUIDITE_SWORD = register(
    //         new SwordItem(GUIDITE_TOOL_MATERIAL, 1f, 1f, new Item.Settings().registryKey(GUIDITE_SWORD_KEY)),
    //         GUIDITE_SWORD_KEY);

    public static void registerItems() {
        // Register items here
    }
}
