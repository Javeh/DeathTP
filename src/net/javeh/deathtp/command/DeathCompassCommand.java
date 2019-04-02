package net.javeh.deathtp.command;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.javeh.deathtp.item.DeathCompass;
import net.javeh.deathtp.listener.DeathListener;

public class DeathCompassCommand implements CommandExecutor {
	DeathCompass compass = new DeathCompass();
	// ItemStack item = compass.get();

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {

		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (DeathListener.map.get(player.getName().toString()) != null) {
				Location deathlocation = (DeathListener.map.get(player.getName().toString()));

				if (player.hasPermission("deathtp.compass")) {
					player.setCompassTarget(deathlocation);
					player.sendMessage("You died at " + deathlocation.getBlockX() + "," + deathlocation.getBlockY()
							+ "," + deathlocation.getBlockZ());

					if (!player.getInventory().contains(compass)) {
						player.getInventory().addItem(new ItemStack(compass));
					}
				}
			}
			else {
				player.sendMessage(ChatColor.GOLD+"You haven't died recently!");
			}
		}
		return true;
	}

}
