package fr.bingo;

import fr.bingo.commands.CommandStart;
import fr.bingo.events.JoinTeamEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bingo extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        System.out.println("Le plugin bingo est bien chargé");
        getCommand("start").setExecutor(new CommandStart());
        this.getServer().getPluginManager().registerEvents(new JoinTeamEvent(), this);
        ItemManager.init();
        this.getConfig();
    }

    @Override
    public void onDisable() {
        System.out.println("Le plugin bingo est bien déchargé");    }
}
