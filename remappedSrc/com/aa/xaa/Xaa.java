package com.aa.xaa; // 声明这个class 的 package: 组织 class and interface 的 set
// source.java : 表示这个文件是一个java源文件, 从第一行到最后一行 都是 source.java [*]
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// meta.class.java : 从 [p,}] 都是 meta.class.java
public class Xaa implements ModInitializer {
	public static final String MOD_ID = "xaa";

	// meta.class.body.java : ({,})
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world! " + MOD_ID);

	}
}

