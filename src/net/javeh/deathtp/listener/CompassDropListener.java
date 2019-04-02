package net.javeh.deathtp.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.javeh.deathtp.item.DeathCompass;

public class CompassDropListener implements Listener {
	DeathCompass compass = new DeathCompass();
	//ItemStack item = compass.get();
	//originally onPlayerDropItem
	
	@EventHandler(priority = EventPriority.LOWEST)
 public void onPlayerDrop(PlayerDropItemEvent event){
		/*
		event.getPlayer().sendMessage(ChatColor.ITALIC+""+ChatColor.BOLD+"ITEM HAS BEEN DROPPED");
		event.getPlayer().sendMessage(ChatColor.GREEN+event.getItemDrop().getItemStack().getItemMeta().getDisplayName().toString());
		event.getPlayer().sendMessage(ChatColor.BOLD+""+ChatColor.RED+""+"VS");
		event.getPlayer().sendMessage(ChatColor.GREEN+compass.getItemMeta().getDisplayName().toString());
		*/
		//	 ItemStack item = new ItemStack(Material.COMPASS, 1);

	//	ItemMeta itemmeta = item.getItemMeta();
		//itemmeta.setDisplayName(ChatColor.GREEN+"Death Location");
		

		//item.setItemMeta(itemmeta); 
		//if(event.getItemDrop().getItemStack().getItemMeta().toString()==item.getItemMeta().toString()) { //presently does not work, have to take it on the honor system
			//if(event.getItemDrop().getItemStack().getItemMeta() == item.getItemMeta()) {
		
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(compass.getItemMeta().getDisplayName()))  {
		event.setCancelled(true);
		event.getPlayer().sendMessage(ChatColor.DARK_RED+""+ChatColor.BOLD+""+"HEY! Don't do that");
		}
	}
}
