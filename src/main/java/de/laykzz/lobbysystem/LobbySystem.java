package de.laykzz.lobbysystem;

import de.laykzz.lobbysystem.commands.DiscordCommand;
import de.laykzz.lobbysystem.listener.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbySystem extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("Discord").setExecutor(new DiscordCommand());


        PluginManager PluginManager = Bukkit.getPluginManager();
        PluginManager.registerEvents(new JoinListener(), this);



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
