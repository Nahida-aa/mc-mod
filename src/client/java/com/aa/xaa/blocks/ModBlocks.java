// package com.aa.xaa.blocks;

// import com.aa.xaa.Xaa;

// import net.minecraft.block.AbstractBlock;
// import net.minecraft.block.Block;
// import net.minecraft.block.Blocks;
// import net.minecraft.block.PillarBlock;
// import net.minecraft.item.BlockItem;
// import net.minecraft.item.Item;
// import net.minecraft.registry.Registries;
// import net.minecraft.registry.Registry;
// import net.minecraft.sound.BlockSoundGroup;

// import net.minecraft.util.Identifier;

// public class ModBlocks {
//     public static void initialize() {}

//     public static Block register(Block block, String namePath, boolean shouldRegisterItem) {
// 		// Register the block and its item. 由于 Block 也是一个 item (可存在于背包中), 因此也要先注册一个 item
// 		Identifier id = new Identifier(Xaa.MOD_ID, namePath);

// 		// Sometimes, you may not want to register an item for the block.
// 		// Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
// 		// ，有时候你可能不希望为某些方块注册一个物品。例如，对于一些技术性方块（technical block），如 minecraft:air 或 minecraft:end_gateway，它们在游戏中并不需要作为物品存在于玩家的背包中，因此不需要注册对应的物品。
// 		if (shouldRegisterItem) {
// 			BlockItem blockItem = new BlockItem(block, new Item.Settings());
// 			Registry.register(Registries.ITEM, id, blockItem);
// 		}

// 		return Registry.register(Registries.BLOCK, id, block);
// 	}

//     public static final Block CONDENSED_DIRT = register(
// 		new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS)),
// 		"condensed_dirt",
// 		true
//     );

//     public static final Block CONDENSED_OAK_LOG = register(
// 		new PillarBlock(
// 			AbstractBlock.Settings.create()
// 				.sounds(BlockSoundGroup.WOOD)
// 		), "condensed_oak_log", true
//     );

// 	public static final Block SUSPICIOUS_BLOCK = register(
// 		new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK)),
// 		"suspicious_block",
// 		true
//     );
// }
