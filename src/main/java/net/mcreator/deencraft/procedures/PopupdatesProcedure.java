package net.mcreator.deencraft.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.client.Minecraft;

import net.mcreator.deencraft.init.DeencraftModItems;
import net.mcreator.deencraft.client.toasts.DatesweetToast;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PopupdatesProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event.getEntity() != null) {
			execute(event, event.getItem());
		}
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == DeencraftModItems.DATE.get()) {
			Minecraft.getInstance().getToastManager().addToast(new DatesweetToast());
		}
	}
}