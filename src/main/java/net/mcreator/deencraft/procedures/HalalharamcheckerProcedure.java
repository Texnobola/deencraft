package net.mcreator.deencraft.procedures;

import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import java.util.List;

@EventBusSubscriber(value = Dist.CLIENT)
public class HalalharamcheckerProcedure {
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.is(ItemTags.create(Identifier.parse("deencraft:halal_food")))) {
			if (Minecraft.getInstance().hasShiftDown()) {
				tooltip.add(Component.literal("Status: Halal"));
			}
		}
		if (itemstack.is(ItemTags.create(Identifier.parse("deencraft:haram_food")))) {
			if (Minecraft.getInstance().hasShiftDown()) {
				tooltip.add(Component.literal("Status: Haram"));
			}
		}
		if (itemstack.is(ItemTags.create(Identifier.parse("deencraft:mashbooh_food")))) {
			if (Minecraft.getInstance().hasShiftDown()) {
				tooltip.add(Component.literal("Status: Mashbooh"));
			}
		}
	}
}