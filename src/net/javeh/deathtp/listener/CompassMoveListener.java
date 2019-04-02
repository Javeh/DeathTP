package net.javeh.deathtp.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

import net.javeh.deathtp.item.DeathCompass;

public class CompassMoveListener implements Listener{
	DeathCompass compass = new DeathCompass();
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void onCompassInteract(InventoryMoveItemEvent e) { //Partially works, stops inventory to inventory, not player to inventory.
		if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase(compass.getItemMeta().getDisplayName().toString())) {
		e.setCancelled(true);
		
	}}
}
