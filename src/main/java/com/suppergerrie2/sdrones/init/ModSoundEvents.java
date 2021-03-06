package com.suppergerrie2.sdrones.init;

import com.suppergerrie2.sdrones.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModSoundEvents {

	public static SoundEvent droneDrivingSound;
	public static SoundEvent droneBleepSound;

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		droneDrivingSound = new SoundEvent(new ResourceLocation(Reference.MODID, "drone_driving")).setRegistryName("drone_driving");
		droneBleepSound = new SoundEvent(new ResourceLocation(Reference.MODID, "drone_bleep")).setRegistryName("drone_bleep");

		event.getRegistry().registerAll(droneDrivingSound, droneBleepSound);
	}

}
