package com.aa.xaa;

import net.fabricmc.api.ClientModInitializer;
// import net.minecraft.block.BlockState;
// import net.minecraft.client.item.TooltipContext;
// import net.minecraft.entity.player.PlayerEntity;
// import net.minecraft.item.ItemStack;
// import net.minecraft.sound.SoundCategory;
// import net.minecraft.sound.SoundEvents;
// import net.minecraft.text.Text;
// import net.minecraft.util.ActionResult;
// import net.minecraft.util.Formatting;
// import net.minecraft.util.hit.BlockHitResult;
// import net.minecraft.util.math.BlockPos;
// import net.minecraft.world.World;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory; // 

import com.aa.xaa.blocks.ModBlocks;
import com.aa.xaa.items.ModItemGroup;
import com.aa.xaa.items.ModItems;

public class XaaClient implements ClientModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger(Xaa.MOD_ID);

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		LOGGER.info("Client initialization complete.");
		ModItems.initialize();
		ModItemGroup.initialize();
		ModBlocks.initialize();
	}
}