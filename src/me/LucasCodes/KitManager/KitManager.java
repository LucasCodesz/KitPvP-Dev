package me.LucasCodes.KitManager;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import me.LucasCodes.Utils.API;

public class KitManager implements Listener {
	
	private static KitManager instance;
	
	public static KitManager getInstance() {
		return instance;
	}

	private static HashMap<Player, String> hability = new HashMap<>();
	
	public void darKit(Player p, String kit) {
		hability.put(p, kit);
	}
	
	public String pegarKit(Player p) {
		if(!hability.containsKey(p)) {
			return "Nenhum";
		}
		return hability.get(p);
	}
	
    public boolean temKit(Player p) {
    	return hability.containsKey(p);
	}
    
    public void setupKit(Player p) {
    	if(pegarKit(p).equalsIgnoreCase("kangaroo")) {
    		p.getInventory().addItem(API.getInstance().criarItem(Material.FIREWORK, "Kangaroo"));
    	}
    }
}
