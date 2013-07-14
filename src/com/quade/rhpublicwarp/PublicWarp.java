package com.quade.rhpublicwarp;

import org.bukkit.plugin.java.JavaPlugin;


public class PublicWarp extends JavaPlugin {
    public void onEnable() {
        getCommand("publicwarp").setExecutor(new PublicWarpCommands());
    }
}
