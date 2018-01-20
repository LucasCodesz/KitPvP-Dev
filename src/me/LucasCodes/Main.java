package me.LucasCodes;

import org.bukkit.plugin.java.JavaPlugin;

import me.LucasCodes.KitManager.KitManager;
import me.LucasCodes.Listeners.PlayerEvents;
import me.LucasCodes.Listeners.ServerEvents;
import me.LucasCodes.Utils.API;

public class Main extends JavaPlugin {
	
	private static Main main;
	
	public static Main getPlugin() {
		return main;
	}
	
	public void onEnable() {
		API.getInstance().ConsoleMessage("§aPlugin Ativado");
		
		onRegistrar();
	}
	
	public void onDisable() {
		API.getInstance().ConsoleMessage("§cPlugin Desativado");
	}
	
	void onRegistrar() {
		API.getInstance().RegisterEvento(new PlayerEvents());
		API.getInstance().RegisterEvento(new ServerEvents());
		API.getInstance().RegisterEvento(new KitManager());
		
	}

}
