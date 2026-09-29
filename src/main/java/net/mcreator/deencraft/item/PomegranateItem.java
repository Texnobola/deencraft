package net.mcreator.deencraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PomegranateItem extends Item {
	public PomegranateItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(2.4f).build()));
	}
}