package net.javeh.deathtp.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.javeh.deathtp.item.DeathCompass;

public class CompassDropListener implements Listener {
	DeathCompass compass = new DeathCompass();
	ItemStack item = compass.get();
	
 public void onPlayerDropItem(PlayerDropItemEvent event){
//	 ItemStack item = new ItemStack(Material.COMPASS, 1);

	//	ItemMeta itemmeta = item.getItemMeta();
		//itemmeta.setDisplayName(ChatColor.GREEN+"Death Location");
		

		//item.setItemMeta(itemmeta); 
		if(event.getItemDrop().getItemStack()==item) { //presently does not work, have to take it on the honor system
			event.isCancelled();
		}
	}
}
