package com.craigegerton.hintss;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class hintss extends JavaPlugin implements Listener {

    public static final String LIFE_CHANGING_SENTENCE = "lol";

    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);

        this.getLogger().info("HAI I ARE HONTSS");
    }

    public void onDisable() {
        this.getLogger().info(LIFE_CHANGING_SENTENCE);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        // Delay response so it actually shows as a reply
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            public void run() {
                lol();
            }
        });
    }

    /**
     * Make hintss speak
     */
    public static void lol() {
        Bukkit.broadcastMessage(LIFE_CHANGING_SENTENCE);
    }
}
