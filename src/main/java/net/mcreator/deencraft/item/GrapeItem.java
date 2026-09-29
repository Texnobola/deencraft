package net.mcreator.deencraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GrapeItem extends Item {
	public GrapeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(32).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.4f).build()));
	}
}