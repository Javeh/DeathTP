package net.javeh.deathtp;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.javeh.deathtp.command.DeathCompassCommand;
import net.javeh.deathtp.command.RecoverCommand;
import net.javeh.deathtp.command.ResetCompassCommand;
import net.javeh.deathtp.listener.CompassDropListener;
import net.javeh.deathtp.listener.CompassJoinListener;
import net.javeh.deathtp.listener.CompassMoveListener;
import net.javeh.deathtp.listener.DeathListener;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		//commands
			this.getCommand("recover").setExecutor(new RecoverCommand());
			this.getCommand("deathtp").setExecutor(new RecoverCommand());
		//	this.getCommand("deathcompass").setExecutor(new DeathCompassCommand());
			this.getCommand("deathcompass").setExecutor(new DeathCompassCommand());
			this.getCommand("resetcompass").setExecutor(new ResetCompassCommand());
		//events
		     getServer().getPluginManager().registerEvents(new DeathListener(), this);
		     getServer().getPluginManager().registerEvents(new CompassDropListener(), this);
		     getServer().getPluginManager().registerEvents(new CompassMoveListener(), this);
		     getServer().getPluginManager().registerEvents(new CompassJoinListener(), this);
		}
		
	@Override
	public void onDisable() {
		
	}

}												
