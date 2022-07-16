package com.slime.crafterban;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import com.slime.crafterban.Listerner.*;

public final class CrafterBan extends JavaPlugin {
    private static CrafterBan instance;

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getLogger().info("Plugin attivato");
        Bukkit.getServer().getPluginManager().registerEvents(new ban(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Plugin disattivato");
    }
}
