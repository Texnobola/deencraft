package net.mcreator.deencraft.procedures;

import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.deencraft.init.DeencraftModItems;

import javax.annotation.Nullable;

import java.util.List;

@EventBusSubscriber(value = Dist.CLIENT)
public class DatecheckProcedure {
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
		if (itemstack.getItem() == DeencraftModItems.DATE.get()) {
			if (Minecraft.getInstance().hasShiftDown()) {
				tooltip.add(Component.literal("\"A date is very sweet natural food: \" + [green \"Halal\"]"));
			}
		}
	}
}