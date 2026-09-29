package net.mcreator.deencraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.deencraft.item.DateItem;
import net.mcreator.deencraft.DeencraftMod;

import java.util.function.Function;

public class DeencraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DeencraftMod.MODID);
	public static final DeferredItem<Item> DATE;
	static {
		DATE = register("date", DateItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}
}