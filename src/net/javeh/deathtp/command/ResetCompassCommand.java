package net.javeh.deathtp.command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ResetCompassCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			player.setCompassTarget(player.getBedSpawnLocation());
			ItemStack item = new ItemStack(Material.COMPASS, 1);

			ItemMeta itemmeta = item.getItemMeta();
			itemmeta.setDisplayName(ChatColor.GREEN+"Death Location");
			

			item.setItemMeta(itemmeta);
			player.getInventory().removeItem(new ItemStack(item));
		}
		return true;
	}

}
