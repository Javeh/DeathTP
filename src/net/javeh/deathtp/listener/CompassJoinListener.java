package net.javeh.deathtp.listener;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.javeh.deathtp.item.DeathCompass;

public class CompassJoinListener implements Listener {
	DeathCompass compass = new DeathCompass();
	@EventHandler (priority = EventPriority.LOWEST)
	public void onPlayerJoin(PlayerJoinEvent e){
		if(e.getPlayer().getInventory().contains(compass)) {
			
			e.getPlayer().getInventory().removeItem(compass);
		}
	}
}
