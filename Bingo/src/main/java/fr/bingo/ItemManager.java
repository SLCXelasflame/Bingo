package fr.bingo;


import org.bukkit.ChatColor;
import org.bukkit.Material;


import org.bukkit.enchantments.Enchantment;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;


public class ItemManager {


    public static ItemStack Team_Selector;
    public static ItemStack Bingo_List;
    public static ItemStack red;
    public static ItemStack blue;
    public static ItemStack green;
    public static ItemStack yellow;

    public static void init() {
        createTeam_Selector();
        createBingo_List();
        createred();
        createblue();
        creategreen();
        createyellow();
    }

    private static void createTeam_Selector() {
        ItemStack item = new ItemStack(Material.COMPASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Team selector");
        meta.addEnchant(Enchantment.MENDING, 1, true);
        item.setItemMeta(meta);
        Team_Selector = item;
    }

    private static void createBingo_List() {
        ItemStack item = new ItemStack(Material.BOOK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bingo list");
        meta.addEnchant(Enchantment.MENDING, 1, true);
        item.setItemMeta(meta);
        Bingo_List = item;
    }
    private static void createred() {
        ItemStack item = new ItemStack(Material.RED_STAINED_GLASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Equipe rouge");
        item.setItemMeta(meta);
        red = item;
    }
    private static void createblue() {
        ItemStack item = new ItemStack(Material.BLUE_STAINED_GLASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_BLUE + "Equipe bleu");
        item.setItemMeta(meta);
        blue = item;
    }
    private static void creategreen() {
        ItemStack item = new ItemStack(Material.GREEN_STAINED_GLASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "Equipe vert");
        item.setItemMeta(meta);
        green = item;
    }
    private static void createyellow() {
        ItemStack item = new ItemStack(Material.YELLOW_STAINED_GLASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Equipe jaune");
        item.setItemMeta(meta);
        yellow = item;
    }

}