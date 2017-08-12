package com.licrafter.mod;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod(useMetadata = true, modid = LicraftMod.MODID, version = LicraftMod.VERSION)
public class LicraftMod {
    public static final String MODID = "licraftmod";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName());
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void playerTick(TickEvent.PlayerTickEvent tick) {
    }

    @SubscribeEvent
    public void destroy(BlockEvent.BreakEvent event) {
        System.out.println("name = " + event.getPlayer().getName());
    }
}
