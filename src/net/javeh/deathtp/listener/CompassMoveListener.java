package net.javeh.deathtp.listener;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import net.javeh.deathtp.item.DeathCompass;

public class CompassMoveListener implements Listener {
	DeathCompass compass = new DeathCompass();

	@EventHandler(priority = EventPriority.LOWEST)
	public void onCompassInteract(InventoryMoveItemEvent e) { // Partially works, stops inventory to inventory, not
																// player to inventory.
		if (e.getItem().getItemMeta().getDisplayName()
				.equalsIgnoreCase(compass.getItemMeta().getDisplayName().toString())) {
			e.setCancelled(true);

		}
	}
	Material storage[] = {Material.ENDER_CHEST, Material.TRAPPED_CHEST,Material.CRAFTING_TABLE,Material.CHEST,Material.ITEM_FRAME,Material.CHEST_MINECART,Material.FURNACE,Material.FURNACE_MINECART,Material.ARMOR_STAND,Material.HOPPER,Material.HOPPER_MINECART};
	@EventHandler(priority = EventPriority.LOWEST)
	public void onStorageInteract(PlayerInteractEvent e) {
		
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getPlayer().getInventory().contains(compass)) {
			Player player = e.getPlayer();
			Block b = e.getClickedBlock();
			//if(b.getType() == Material.CHEST || b.getType() == Material.ITEM_FRAME || b.getType() == Material.CHEST_MINECART ||  b.getType() == Material.FURNACE || b.getType() == Material.FURNACE_MINECART || b.getType() == Material.ARMOR_STAND || b.getType() == Material.HOPPER || b.getType() == Material.HOPPER_MINECART) {
			if(Arrays.asList(storage).contains(b.getType())) {
			player.sendMessage(ChatColor.RED+"You can't do that! Use "+ChatColor.GOLD+"/resetcompass"+ChatColor.RED+" to remove your compass");
			e.setCancelled(true);
			}
		}
	}
}
