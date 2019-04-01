//package net.javeh.deathtp.command;
//
//
//
//import java.util.ArrayList;
//
//import org.bukkit.ChatColor;
//import org.bukkit.Location;
//import org.bukkit.Material;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.meta.ItemMeta;
//
//import net.javeh.deathtp.item.DeathCompass;
//import net.javeh.deathtp.listener.CompassDropListener;
//import net.javeh.deathtp.listener.DeathListener;
//
//public class NavigateCommand implements CommandExecutor {
//	DeathCompass compass = new DeathCompass();
//	ItemStack item = compass.get();
//	
//	
//	@SuppressWarnings("unlikely-arg-type")
//	@Override
//	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
//		
//		if(sender instanceof Player) {
//			Player player = (Player) sender;
//			Location deathlocation = (DeathListener.map.get(player.getName().toString()));
//			player.setCompassTarget(deathlocation);
//			player.sendMessage("You died at " +deathlocation.getBlockX()+","+deathlocation.getBlockY()+","+deathlocation.getBlockZ());
//			
//			if(!player.getInventory().contains(item)) {
//			player.getInventory().addItem(new ItemStack(item));
//			}
//		}
//		return true;
//	}
//
//}
