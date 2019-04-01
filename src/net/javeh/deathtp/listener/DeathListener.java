package net.javeh.deathtp.listener;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {
    public static HashMap<String, Location> map = new HashMap<>();
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerDeath(PlayerDeathEvent e) {
		//e.setDeathMessage(e.getEntity().getName()+" Died!");
		map.put(e.getEntity().getName().toString(),e.getEntity().getLocation());
	}
}
