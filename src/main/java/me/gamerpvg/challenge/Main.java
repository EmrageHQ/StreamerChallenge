package me.gamerpvg.challenge;

import me.gamerpvg.challenge.commands.Start;
import me.gamerpvg.challenge.listeners.Health;
import me.gamerpvg.challenge.listeners.JoinQuit;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //commands
        this.getCommand("start").setExecutor(new Start());

        //listeners
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new Health(), this);
        pluginManager.registerEvents(new JoinQuit(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
