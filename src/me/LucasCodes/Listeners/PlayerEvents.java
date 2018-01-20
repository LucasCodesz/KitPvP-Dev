package me.LucasCodes.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.LucasCodes.KitManager.KitManager;

public class PlayerEvents implements Listener {

	private static PlayerEvents instance;
	
	public static PlayerEvents getInstance() {
		return instance;
	}
	
	@EventHandler
	void onJoin(PlayerJoinEvent e) {
		e.setJoinMessage(null);
		
		KitManager.getInstance().darKit(e.getPlayer(), "Nenhum");
	}
	
	@EventHandler
	void onQuit(PlayerQuitEvent e) {
		e.setQuitMessage(null);
		
	}
	
}
