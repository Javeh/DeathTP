package net.javeh.deathtp.listener;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import net.javeh.deathtp.item.DeathCompass;

public class DeathListener implements Listener {
	DeathCompass compass = new DeathCompass();
    public static HashMap<String, Location> map = new HashMap<>();
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerDeath(PlayerDeathEvent e) {
		boolean lawfulDeath = true;
		if(e.getEntity().getKiller() != null) {
			lawfulDeath = false;
		}
		//e.setDeathMessage(e.getEntity().getName()+" Died!");
		//map.put(e.getEntity().getName().toString(),e.getEntity().getLocation()); //Stores the player and death location
		if(!lawfulDeath) {
			if(e.getEntity().hasPermission("deathtp.pvp")) {
				lawfulDeath = true;
			}
		}
		if(lawfulDeath) {
		map.put(e.getEntity().getName().toString(), e.getEntity().getLocation());
		if(e.getDrops().contains(compass)){
			e.getDrops().remove(compass);
			}
	}
	}
}
