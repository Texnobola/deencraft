/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deencraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.deencraft.DeencraftMod;

public class DeencraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeencraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DEEN_CRAFT = REGISTRY.register("deen_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.deencraft.deen_craft")).icon(() -> new ItemStack(DeencraftModItems.DATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DeencraftModItems.DATE.get());
			}).build());
}