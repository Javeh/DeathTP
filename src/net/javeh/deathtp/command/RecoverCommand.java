package net.javeh.deathtp.command;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.javeh.deathtp.listener.DeathListener;

public class RecoverCommand implements CommandExecutor {
	Random rand = new Random();
	//String[] messages = {("ChatColor.GREEN+player.getName().toString()+ChatColor.YELLOW+\\\" is a coward and has to use /recover, making him tonight's big loser.\\\""),"b", "c"};
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(DeathListener.map.get(player.getName().toString()) != null) {
			if(player.hasPermission("deathtp.tp")) {
			player.teleport((DeathListener.map.get(player.getName().toString())));
			if(player.hasPermission("deathtp.broadcast")) {
			//Bukkit.broadcastMessage(messages[rand.nextInt()]);
			//ChatColor.GREEN+player.getName().toString()+ChatColor.YELLOW+\" is a coward and has to use /recover, making him tonight's big loser.\"", 
			//TODO add random messages.
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
