package fr.bingo.commands;

import fr.bingo.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandStart implements CommandExecutor {
    public  static  final String[] MESSAGE = {"5","4", "3", "2", "1", "Bon jeu"};

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("start")){
            Player p = (Player) sender;
            if(args.length == 0){

                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say La partie va bientot se lancer");
                for(int i = 0; i <= MESSAGE.length-1; i++){
                    Bukkit.broadcastMessage(MESSAGE[i]);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }}
        return false;

    }}
