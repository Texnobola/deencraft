package net.mcreator.deencraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class DateItem extends Item {
	public DateItem(Item.Properties properties) {
		super(properties.stacksTo(16).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(2f).alwaysEdible().build()));
	}
}