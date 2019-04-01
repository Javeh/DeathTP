package net.javeh.deathtp.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.javeh.deathtp.item.DeathCompass;

public class ResetCompassCommand implements CommandExecutor{
	
	

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			DeathCompass compass = new DeathCompass();
			ItemStack item = compass.get();
			Player player = (Player) sender;
			World world = player.getLocation().getWorld();
			if(player.getBedSpawnLocation() != null) {
				player.setCompassTarget(player.getBedSpawnLocation());
			}
			else {
				player.setCompassTarget(world.getSpawnLocation());
			}
			

			player.getInventory().removeItem(new ItemStack(item));
		}
		return true;
	}

}
