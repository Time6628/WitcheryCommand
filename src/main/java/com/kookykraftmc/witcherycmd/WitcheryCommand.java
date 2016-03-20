package com.kookykraftmc.witcherycmd;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import io.netty.handler.logging.LoggingHandler;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Created by TimeTheCat on 3/20/2016.
 */
@Mod(modid = ModInfo.ID, name =  ModInfo.NAME, version = ModInfo.VERSION, acceptableRemoteVersions = "*")

public class WitcheryCommand {
    public static Logger logger = LogManager.getLogger(ModInfo.NAME);

    @Mod.Instance
    public static WitcheryCommand instance;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("[" + ModInfo.NAME + "]" + " Is now loading!");
    }

    @EventHandler
    public void pinit(FMLPostInitializationEvent pie) {
        logger.info("[" + ModInfo.NAME + "]" + " has been loaded!");
    }
    @EventHandler
    public void serverStart(FMLServerStartingEvent ss) {
        ss.registerServerCommand(new WCmd());
    }
}
