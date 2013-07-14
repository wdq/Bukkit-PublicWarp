package com.quade.rhpublicwarp;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;


public class PublicWarpCommands implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("publicwarp")) {

            if(args.length == 1) {

                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "pex group guest add essentials.warps." + args[0]);
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "pex group copper add essentials.warps." + args[0]);
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "pex group iron add essentials.warps." + args[0]);
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "pex group silver add essentials.warps." + args[0]);
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "pex group legacy add essentials.warps." + args[0]);
                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "pex group gold add essentials.warps." + args[0]);

                sender.sendMessage(args[0] + " has been made public.");

            } else {

                sender.sendMessage("Incorrect syntax. Try /publicwarp warpname.");
            }

            return true;
        }
        return false;
    }
}
