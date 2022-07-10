
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.sex.item.DildoItem;
import net.mcreator.sex.SexMod;

public class SexModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SexMod.MODID);
	public static final RegistryObject<Item> DILDO = REGISTRY.register("dildo", () -> new DildoItem());
}
