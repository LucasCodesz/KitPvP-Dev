package me.LucasCodes.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;

import me.LucasCodes.Main;

public class API {
	
	private static API instance;
	
	public static API getInstance() {
		return instance;
	}

	public void ConsoleMessage(String msg) {
		Bukkit.getConsoleSender().sendMessage(msg);
	}
	
	public void ServerMessage(String msg) {
		Bukkit.broadcastMessage(msg);
	}
	
	public void RegisterEvento(Listener evento) {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(evento, Main.getPlugin());
	}
	
	public void RegisterComando(String string, CommandExecutor classe) {
		Main.getPlugin().getCommand(string).setExecutor(classe);
	}
	
	public ItemStack criarItem(Material mat, String nome) {
		ItemStack item= new ItemStack(mat);
		ItemMeta itemm = item.getItemMeta();
		itemm.setDisplayName(nome);
		
		return item;
	}
	
	public Inventory criarInv(Integer slots, String nome, InventoryHolder dono) {
		Inventory inv = Bukkit.createInventory(dono, slots, nome);
		return inv;
	}
}
