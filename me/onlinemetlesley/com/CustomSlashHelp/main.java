package me.OnlineMetlesley.com.CustomSlashHelp;

import org.bukkit.command.CommandExecutor;
import java.util.List;
import org.bukkit.plugin.Plugin;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
    FileConfiguration config;
    Server getserver;
    public static Plugin instance;
    List<String> help1;
    List<String> help2;
    List<String> help3;
    List<String> help4;
    List<String> help5;
    
    public Main() {
        this.config = this.getConfig();
        this.getserver = this.getServer();
        this.help1 = (List<String>)this.getConfig().getStringList("Help.Help1.Lines");
        this.help2 = (List<String>)this.getConfig().getStringList("Help.Help2.Lines");
        this.help3 = (List<String>)this.getConfig().getStringList("Help.Help3.Lines");
        this.help4 = (List<String>)this.getConfig().getStringList("Help.Help4.Lines");
        this.help5 = (List<String>)this.getConfig().getStringList("Help.Help5.Lines");
    }
    
    public Plugin getInstance() {
        return Main.instance;
    }
    
    public void onEnable() {
        this.getCommand("help").setExecutor((CommandExecutor)new Commands());
        ((Main)(Main.instance = (Plugin)this)).saveDefaultConfig();
        this.getConfig().options().copyDefaults(true);
        final MetricsLite metrics = new MetricsLite((Plugin)this);
    }
    
    public void onDisable() {
    }
}
