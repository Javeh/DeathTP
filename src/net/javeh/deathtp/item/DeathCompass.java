package net.javeh.deathtp.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DeathCompass {
	
	public ItemStack get() {
		ItemStack compass = new ItemStack(Material.COMPASS, 1);

		ItemMeta itemmeta = compass.getItemMeta();
		itemmeta.setDisplayName(ChatColor.GREEN+"Death Location");
		

		compass.setItemMeta(itemmeta);
		return compass;
	}
}
