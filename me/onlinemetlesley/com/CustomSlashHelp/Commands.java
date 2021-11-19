package me.OnlineMetlesley.com.CustomSlashHelp;

import java.util.Iterator;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.command.CommandExecutor;

public class Commands implements CommandExecutor
{
    public Plugin instance;
    
    public void function() {
        final Main plugin = (Main)Main.instance;
        plugin.getServer();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player player = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("help") && sender instanceof Player) {
            if (args.length == 0) {
                for (final String help : Main.instance.getConfig().getStringList("Help.Help1.Lines")) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', help.replace("%player%", player.getName())));
                }
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("1")) {
                    for (final String help : Main.instance.getConfig().getStringList("Help.Help1.Lines")) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', help.replace("%player%", player.getName())));
                    }
                    return false;
                }
                if (args[0].equalsIgnoreCase("2")) {
                    for (final String help2 : Main.instance.getConfig().getStringList("Help.Help2.Lines")) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', help2.replace("%player%", player.getName())));
                    }
                    return false;
                }
                if (args[0].equalsIgnoreCase("3")) {
                    for (final String help3 : Main.instance.getConfig().getStringList("Help.Help3.Lines")) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', help3.replace("%player%", player.getName())));
                    }
                    return false;
                }
                if (args[0].equalsIgnoreCase("4")) {
                    for (final String help4 : Main.instance.getConfig().getStringList("Help.Help4.Lines")) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', help4.replace("%player%", player.getName())));
                    }
                    return false;
                }
                if (args[0].equalsIgnoreCase("5")) {
                    for (final String help5 : Main.instance.getConfig().getStringList("Help.Help5.Lines")) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', help5.replace("%player%", player.getName())));
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
