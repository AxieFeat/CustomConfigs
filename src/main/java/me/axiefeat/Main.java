package me.axiefeat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("CustomConfigs загружен!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("CustomConfigs отключён!");
    }
}
