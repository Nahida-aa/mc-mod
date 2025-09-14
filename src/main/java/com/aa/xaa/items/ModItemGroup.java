// package com.aa.xaa.items;

// import com.aa.xaa.Xaa;
// import com.aa.xaa.blocks.ModBlocks;

// import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
// import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
// import net.minecraft.item.ItemGroups;
// // import net.minecraft.item.Item;
// import net.minecraft.item.ItemGroup;
// import net.minecraft.item.ItemStack;
// import net.minecraft.registry.Registries;
// import net.minecraft.registry.Registry;
// import net.minecraft.registry.RegistryKey;
// import net.minecraft.text.Text;
// import net.minecraft.util.Identifier;

// public class ModItemGroup {
//     public static void initialize() {

//         // Get the event for modifying entries in the ingredients group.
//         // And register an event handler that adds our suspicious item to the
//         // ingredients group. 加入 材料组
//         ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> 
//             itemGroup.add(ModItems.SUSPICIOUS_SUBSTANCE)
//         );

//         // Register the group.
//         Registry.register(Registries.ITEM_GROUP, XAA_ITEM_GROUP_KEY, XAA_ITEM_GROUP);

//         // Register items to the custom item group.
//         ItemGroupEvents.modifyEntriesEvent(XAA_ITEM_GROUP_KEY).register(itemGroup -> {
//             itemGroup.add(ModItems.SUSPICIOUS_SUBSTANCE);
//             itemGroup.add(ModItems.ICE_ETHER);
//             // itemGroup.add(ModItems.GUIDITE_SWORD);
//             // itemGroup.add(ModItems.GUIDITE_HELMET);
//             // itemGroup.add(ModItems.GUIDITE_BOOTS);
//             // itemGroup.add(ModItems.GUIDITE_LEGGINGS);
//             // itemGroup.add(ModItems.GUIDITE_CHESTPLATE);
//             // itemGroup.add(ModItems.LIGHTNING_STICK);
//             // ...
//             itemGroup.add(ModBlocks.SUSPICIOUS_BLOCK);
//             itemGroup.add(ModBlocks.CONDENSED_DIRT);
//             itemGroup.add(ModBlocks.CONDENSED_OAK_LOG.asItem());
//         });
//     }

//     // public static ItemGroup register(String keyNamePath, ItemGroup itemGroup) {
//     //     final RegistryKey<ItemGroup> ITEM_GROUP_KEY = RegistryKey.of(
//     //         Registries.ITEM_GROUP.getKey(),
//     //         Identifier.of(Xaa.MOD_ID, keyNamePath));

//     //     ItemGroup registeredItemGroup = Registry.register(
//     //         Registries.ITEM_GROUP,
//     //         ITEM_GROUP_KEY.getValue(),
//     //         itemGroup);

//     //     return registeredItemGroup;
//     // }

//     public static final RegistryKey<ItemGroup> XAA_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Xaa.MOD_ID, "itemGroup"));

//     public static final ItemGroup XAA_ITEM_GROUP = FabricItemGroup.builder()
//         .icon(() -> new ItemStack(ModItems.SUSPICIOUS_SUBSTANCE))
//         .displayName(Text.translatable("itemGroup.xaa"))
//         .build();
// }

