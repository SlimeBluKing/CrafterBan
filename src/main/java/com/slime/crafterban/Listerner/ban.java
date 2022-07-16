package com.slime.crafterban.Listerner;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.entity.*;

public class ban implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player vittima = e.getEntity();
        String bannone = vittima.getName();
        Bukkit.getBanList(BanList.Type.NAME).addBan(bannone, "Off! Sei morto :D", null, "console");
        vittima.kickPlayer("Off! Sei morto :D");
    }
}
