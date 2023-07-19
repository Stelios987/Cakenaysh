package com.stelios.cakenaysh.Util.Items;

import com.stelios.cakenaysh.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public enum CustomItems {


    //BATTLE ITEMS
    SPEED_BOOTS(new BattleItemBuilder(Material.CHAINMAIL_BOOTS, 1,false,0,0,0,0
            ,0,20,0,100,0,0,0,0, true)
            .setDisplayName(new ArrayList<>(Arrays.asList("Speed Boots")),
                    new ArrayList<>(Arrays.asList(119, 218, 230)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("We do a little running...")),
                    new ArrayList<>(Arrays.asList(113, 121, 122)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    HELM_OF_SPARTA(new BattleItemBuilder(Material.GOLDEN_HELMET, 1,false,0,0,0,0
            ,10,10000,10000,0,0,1,0,0, true)
            .setDisplayName(new ArrayList<>(Arrays.asList("Helmet of Sparta")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("idk what to put here lol")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    CHEST_OF_SPARTA(new BattleItemBuilder(Material.GOLDEN_CHESTPLATE, 1,false,0,0,0,0
            ,10,10000,10000,0,0,0,0,1, true)
            .setDisplayName(new ArrayList<>(Arrays.asList("Chestplate of Sparta")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("idk what to put here lol")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    LEGS_OF_SPARTA(new BattleItemBuilder(Material.GOLDEN_LEGGINGS, 1,false,0,0,0,0
            ,10,10000,10000,0,0,0,1,0, true)
            .setDisplayName(new ArrayList<>(Arrays.asList("Leggings of Sparta")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("idk what to put here lol")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    BOOTS_OF_SPARTA(new BattleItemBuilder(Material.GOLDEN_BOOTS, 1,false,0,0,0,0
            ,10,10000,10000,0,0,0,0,0, true)
            .setDisplayName(new ArrayList<>(Arrays.asList("Boots of Sparta")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("idk what to put here lol")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    TEST_HELM(new BattleItemBuilder(Material.NETHERITE_HELMET, 1,false,0,0,1000,0
            ,0,0,1000,0,0,0,0,0, true)
            .setDisplayName(new ArrayList<>(Arrays.asList("Test Helm")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("We do a little testing...")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    WRATH_OF_SPARTA(new BattleItemBuilder(Material.GOLDEN_SWORD, 1,false,50000,40,100,90
            ,10,2,10,10,2, 4,0,0, false)
            .setUnbreakable()
            .setDisplayName(new ArrayList<>(Arrays.asList("Wrath of Sparta")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("THIS IS SPARTA!")),
                    new ArrayList<>(Arrays.asList(255,215,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    SCYTHE_OF_INTELLIJ(new BattleItemBuilder(Material.GOLDEN_HOE, 1,false,60,20,120,5
            ,0,0,0,0,0,0,0,0, false)
            .setUnbreakable()
            .setDisplayName(new ArrayList<>(Arrays.asList("Scythe of Intellij")),
                    new ArrayList<>(Arrays.asList(66,27,224)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("A divine weapon created by the ancient", "nl", "God of Intellect: Intellij")),
                    new ArrayList<>(Arrays.asList(200,200,200,200,200,200)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)))),

    TEST_ITEM(new BattleItemBuilder(Material.ACACIA_SLAB,1,true,5,5,1,1
            ,2,1,1,2,1,4,2,6,8,3,3,4,5,1,34,5,4,1,2,1,1,1,false)
            .setDisplayName(new ArrayList<>(Arrays.asList("Te","st"," Item")),
                    new ArrayList<>(Arrays.asList(66,27,224,25,124,254,33,55,235)),
                    new ArrayList<>(Arrays.asList(false, false, true)),
                    new ArrayList<>(Arrays.asList(true, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, true)),
                    new ArrayList<>(Arrays.asList(false, true, false)),
                    new ArrayList<>(Arrays.asList(false, true, false)))
            .setLore(new ArrayList<>(Arrays.asList("We make", "a few new items...", "nl", "we gotta test the system")),
                    new ArrayList<>(Arrays.asList(45,26,135,200,200,200,200,200,200)),
                    new ArrayList<>(Arrays.asList(true, false, false)),
                    new ArrayList<>(Arrays.asList(false, true, false)),
                    new ArrayList<>(Arrays.asList(false, false, true)),
                    new ArrayList<>(Arrays.asList(false, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, false)))),

    CLOSE(new ItemBuilder(Material.BARRIER, 1,false)
            .setDisplayName(new ArrayList<>(Arrays.asList("Close")),
                    new ArrayList<>(Arrays.asList(255,0,0)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    SETTINGS(new ItemBuilder(Material.REDSTONE_TORCH, 1,false)
            .setDisplayName(new ArrayList<>(Arrays.asList("Settings")),
                    new ArrayList<>(Arrays.asList(0,255,0)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("View and edit RPG settings.")),
                    new ArrayList<>(Arrays.asList(128,128,128)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    BLANK_BLACK_PANE(new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE, 1,false)
            .setDisplayName(new ArrayList<>(Arrays.asList("")),
                    new ArrayList<>(Arrays.asList(0,0,0)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    DIAL_OF_THE_SUN(new ItemBuilder(Material.CLOCK, 1,false)
            .setDisplayName(new ArrayList<>(Arrays.asList("Dial of the Sun")),
                    new ArrayList<>(Arrays.asList(255,255,0)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("This clock is an ancient relic lost to time.", "nl", "It is believed that strange events happen", "nl", "when this item is pointed towards the sky...")),
                    new ArrayList<>(Arrays.asList(75,75,75,75,75,75,75,75,75)),
                    new ArrayList<>(Arrays.asList(false, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, false)))),

    ;


    private final ItemBuilder itemBuilder;

    CustomItems(ItemBuilder itemBuilder){
        this.itemBuilder = itemBuilder;
    }


    //gets an items itemBuilder
    //@return the ItemBuilder
    public ItemBuilder getItemBuilder(){
        return itemBuilder;
    }

    //gets an item from the enum
    //@param name: The name of the item being picked.
    //@return the ItemBuilder
    public static ItemBuilder getItem(String name){
        for (CustomItems item : CustomItems.values()){
            if (item.name().equalsIgnoreCase(name)){

                //if the item is unstackable, make it unstackable
                if (item.getItemBuilder().getUnstackable()){
                    item.itemBuilder.getItemMeta().getPersistentDataContainer().set(new NamespacedKey(Main.getPlugin(Main.class), "uniqueID"),
                            PersistentDataType.STRING, UUID.randomUUID().toString());
                }
                return item.itemBuilder;
            }
        }
        return null;
    }

    //

    //gets all the itemBuilders in the enum
    //@return ArrayList<ItemBuilder> of all the items
    public static ArrayList<ItemBuilder> getAllItems(){
        ArrayList<ItemBuilder> items = new ArrayList<>();
        for (CustomItems item : CustomItems.values()){
            items.add(item.itemBuilder);
        }
        return items;
    }

    //returns all the names of items in the enum
    //@return ArrayList<String> of all the names
    public static ArrayList<String> getNames(){
        ArrayList<String> names = new ArrayList<>();
        for (CustomItems item : CustomItems.values()){
            names.add(item.name());
        }
        return names;
    }

}