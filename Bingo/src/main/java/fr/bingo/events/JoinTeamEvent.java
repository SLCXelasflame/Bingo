package fr.bingo.events;

import fr.bingo.ItemManager;
import fr.bingo.Start;
import org.bukkit.Bukkit;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;




public class JoinTeamEvent implements Listener {



    public Inventory team = Bukkit.createInventory(null, 18, "Unranked");
    @EventHandler
    public void onJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        player.sendMessage("Psartek mon reuf bon bingo a toi");
        player.getInventory().clear();
        player.getInventory().setArmorContents(new ItemStack[player.getInventory().getArmorContents().length]);

        player.getInventory().setItem(0, ItemManager.Team_Selector);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 999999, 254, true , true));
        player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 999999, 254, true, true));


    }
    @EventHandler
    public void onInteract(PlayerInteractEvent event){


        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack it = event.getItem();

        if (it == null) return;

        if (it.equals(ItemManager.Team_Selector)){
            if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK){



                team.setItem(0, ItemManager.red);
                team.setItem(1, ItemManager.yellow);
                team.setItem(2, ItemManager.blue);
                team.setItem(3, ItemManager.green);
                player.openInventory(team);
            }
        }
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){

        Inventory inv = event.getInventory();
        Player player = (Player) event.getWhoClicked();
        ItemStack current = event.getCurrentItem();
        if (current == null) return;

        if (inv.equals(team)){

            event.setCancelled(true);

            if (current.isSimilar(ItemManager.red)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas rejoindre la team rouge");
                Start.addTeam("rouge", player);
            }
            if (current.isSimilar(ItemManager.yellow)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas rejoindre la team jaune");
                Start.addTeam("jaune", player);
            }

            if (current.isSimilar(ItemManager.blue)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas rejoindre la team bleu");
                Start.addTeam("bleu", player);
            }

            if (current.isSimilar(ItemManager.green)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas rejoindre la team verte");
                Start.addTeam("vert", player);
            }


        }
    }
}