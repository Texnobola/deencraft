/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deencraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.deencraft.DeencraftMod;

@EventBusSubscriber
public class DeencraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeencraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DEEN_CRAFT = REGISTRY.register("deen_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.deencraft.deen_craft")).icon(() -> new ItemStack(DeencraftModItems.DATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DeencraftModItems.DATE.get());
				tabData.accept(DeencraftModItems.OLIVE.get());
				tabData.accept(DeencraftModItems.GRAPE.get());
				tabData.accept(DeencraftModItems.FIG.get());
				tabData.accept(DeencraftModItems.POMEGRANATE.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(DeencraftModItems.OLIVE.get());
			tabData.accept(DeencraftModItems.GRAPE.get());
			tabData.accept(DeencraftModItems.FIG.get());
			tabData.accept(DeencraftModItems.POMEGRANATE.get());
		}
	}
}