package fr.bingo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class Start {


    public static void addTeam(String team, Player player){
        String pseudo = player.getName();
        File file = new File(Bingo.getPlugin(Bingo.class).getDataFolder(), "team.yml");
        YamlConfiguration configuration = YamlConfiguration.loadConfiguration(file);
        configuration.set(pseudo, team);
        if (team.equalsIgnoreCase("rouge")) {
            player.setDisplayName(ChatColor.RED +"[Rouge] "+ pseudo);
            player.setPlayerListName(ChatColor.RED + "[Rouge] "+pseudo);
        }
        if (team.equalsIgnoreCase("bleu")) {
            player.setDisplayName(ChatColor.DARK_BLUE + "[Bleu] "+pseudo);
            player.setPlayerListName(ChatColor.DARK_BLUE +"[Bleu] "+  pseudo);

        }
        if (team.equalsIgnoreCase("vert")) {
            player.setDisplayName(ChatColor.GREEN +"[Vert] "+ pseudo);
            player.setPlayerListName(ChatColor.GREEN +"[Vert] "+ pseudo);

        }
        if (team.equalsIgnoreCase("jaune")) {
            player.setDisplayName(ChatColor.YELLOW + "[Jaune] "+pseudo);
            player.setPlayerListName(ChatColor.YELLOW +"[Jaune] "+ pseudo );

        }

        try {
            configuration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
