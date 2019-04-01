package net.javeh.deathtp.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import net.javeh.deathtp.listener.DeathListener;

public class RecoverCommand implements CommandExecutor {

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			player.teleport((DeathListener.map.get(player.getName().toString())));
			Bukkit.broadcastMessage(ChatColor.GREEN+player.getName().toString()+ChatColor.YELLOW+" is a coward and has to use /recover, making him tonight's big loser.");
		}
		return true;
	}

}
