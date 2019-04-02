package net.javeh.deathtp.command;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.Note.Tone;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.javeh.deathtp.listener.DeathListener;

public class RecoverCommand implements CommandExecutor {
	Random rand = new Random();
	//String[] messages = {("ChatColor.GREEN+player.getName().toString()+ChatColor.YELLOW+\\\" is a coward and has to use /recover, making him tonight's big loser.\\\""),"b", "c"};
	String[] messages = {"is a coward and has to use /deathtp, making him tonight's big loser.","used /deathtp.","had an accident and had to use /deathtp","needed some help getting back to where they died.", "knows exactly why the server is seeing this message"
	,"is back from the dead", "is teleporting yet again","really doesn't mind dying in this game"};
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(DeathListener.map.get(player.getName().toString()) != null) {
			if(player.hasPermission("deathtp.tp")) {
			player.teleport((DeathListener.map.get(player.getName().toString())));
			player.playNote(player.getLocation(), Instrument.PIANO, Note.natural(1, Tone.D));
			if(player.hasPermission("deathtp.broadcast")) {
			Bukkit.broadcastMessage(ChatColor.GREEN+""+ChatColor.BOLD+player.getName()+" "+ChatColor.RESET+""+ChatColor.YELLOW+messages[rand.nextInt(messages.length -1)]);
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
