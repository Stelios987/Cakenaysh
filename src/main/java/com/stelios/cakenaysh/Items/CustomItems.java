package com.stelios.cakenaysh.Items;

import com.stelios.cakenaysh.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public enum CustomItems {


    //GUI ITEMS
    SKILLS(new Item(Material.END_CRYSTAL, 1,false, "Skills")
            .setDisplayName(new ArrayList<>(Arrays.asList("Skills")),
                    new ArrayList<>(Arrays.asList(0,255,0)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("View and level up your skills.")),
                    new ArrayList<>(Arrays.asList(128,128,128)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    QUESTS(new Item(Material.WRITABLE_BOOK, 1,false, "Quests")
            .setDisplayName(new ArrayList<>(Arrays.asList("Quest Log")),
                    new ArrayList<>(Arrays.asList(0,255,0)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("View your active quests,", "nl", "progress, and rewards.")),
                    new ArrayList<>(Arrays.asList(128,128,128,128,128,128)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)))),

    RECIPE_BOOK(new Item(Material.WRITTEN_BOOK, 1,false, "Recipe Book")
            .setDisplayName(new ArrayList<>(Arrays.asList("Recipe Book")),
                    new ArrayList<>(Arrays.asList(0,255,0)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("View special crating recipes", "nl", "for items you have unlocked.")),
                    new ArrayList<>(Arrays.asList(128,128,128,128,128,128)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)),
                    new ArrayList<>(Arrays.asList(false, false)))),

    CHARACTER_MANAGEMENT(new Item(Material.NAME_TAG, 1,false, "Character Management")
            .setDisplayName(new ArrayList<>(Arrays.asList("Character Management")),
                    new ArrayList<>(Arrays.asList(0,255,0)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("You can have multiple", "nl", "characters on this server.", "nl", "nl", "View and manage them here.")),
                    new ArrayList<>(Arrays.asList(128,128,128,128,128,128,128,128,128,128,128,128)),
                    new ArrayList<>(Arrays.asList(false, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, false)),
                    new ArrayList<>(Arrays.asList(false, false, false)))),

    BACK_BUTTON(new Item(Material.ARROW, 1,false, "Back button")
            .setDisplayName(new ArrayList<>(Arrays.asList("Back")),
                    new ArrayList<>(Arrays.asList(255,255,255)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    CLOSE(new Item(Material.BARRIER, 1,false, "Close")
            .setDisplayName(new ArrayList<>(Arrays.asList("Close")),
                    new ArrayList<>(Arrays.asList(255,0,0)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    SETTINGS(new Item(Material.REDSTONE_TORCH, 1,false, "Settings")
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

    BLANK_BLACK_PANE(new Item(Material.BLACK_STAINED_GLASS_PANE, 1,false, "Blank Black Pane")
            .setDisplayName(new ArrayList<>(Arrays.asList("")),
                    new ArrayList<>(Arrays.asList(0,0,0)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),





    //BATTLE ITEMS
    JAZZ_HANDS(new BattleItem(Material.GOLDEN_BOOTS, 1,false,"Jazz Hands", "armor",-50,40,0,0
            ,0,20,0,0,0,0,100,0,0,0,
            0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0)
            .setDisplayName(new ArrayList<>(Arrays.asList("Jazz Hands")),
                    new ArrayList<>(Arrays.asList(255, 0, 251)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("Jazz", "Hands are a great way", "nl", "to distract your enemies.")),
                    new ArrayList<>(Arrays.asList(30, 41, 235, 141, 49, 148, 65, 26, 112)),
                    new ArrayList<>(Arrays.asList(false,true,false)),
                    new ArrayList<>(Arrays.asList(false,true,false)),
                    new ArrayList<>(Arrays.asList(false,false,false)),
                    new ArrayList<>(Arrays.asList(false,false,false)),
                    new ArrayList<>(Arrays.asList(false,false,false)))),

    SPEED_BOOTS(new BattleItem(Material.CHAINMAIL_BOOTS, 1,false,"Speed Boots", "armor",0,0,0,0
            ,0,20,0,0,0,0,100,0,0,0,
            0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0)
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

    HELM_OF_SPARTA(new BattleItem(Material.GOLDEN_HELMET, 1,false,"Helmet of Sparta", "armor",0,0,0,0
            ,10,10000,0,0,0,10000,0,0,0,0,
            0,0,0,0,0,0,0,0,
            0,0,0,0,1,0,0)
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

    CHEST_OF_SPARTA(new BattleItem(Material.GOLDEN_CHESTPLATE, 1,false,"Chestplate of Sparta", "armor",0,0,0,0
            ,10,10000,0,0,0,10000,0,0,0,0,
            0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0)
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

    LEGS_OF_SPARTA(new BattleItem(Material.GOLDEN_LEGGINGS, 1,false,"Leggings of Sparta", "armor",0,40,0,0
            ,10,10000,0,0,0,10000,0,0,0,0,
            0,0,0,0,0,0,0,0,0,
            0,0,0,0,1,0)
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

    BOOTS_OF_SPARTA(new BattleItem(Material.GOLDEN_BOOTS, 1,false,"Boots of Sparta", "armor",0,0,0,0
            ,10,10000,0,0,0,10000,0,0,0,0,
            0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0)
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

    TEST_HELM(new BattleItem(Material.NETHERITE_HELMET, 1,false,"Test Helm", "armor",0,0,1000,0
            ,0,0,0,0,0,1000,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,
            0,0,0,0,0)
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

    TEST_ACCESSORY(new BattleItem(Material.BLACK_DYE, 1,false,"Test Accessory", "accessory",0,40,0,0
            ,0,100,0,0,0,0,200,0,0,0,
            0,0,0,0,0,0,0,0,
            0,0,0,0,1,0,0)
            .setDisplayName(new ArrayList<>(Arrays.asList("Test Accessory")),
                    new ArrayList<>(Arrays.asList(69, 123, 209)),
                    new ArrayList<>(Arrays.asList(true)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))
            .setLore(new ArrayList<>(Arrays.asList("We do a little more testing...")),
                    new ArrayList<>(Arrays.asList(105, 151, 224)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)),
                    new ArrayList<>(Arrays.asList(false)))),

    WRATH_OF_SPARTA(new BattleItem(Material.GOLDEN_SWORD, 1,false, "Wrath of Sparta", "weapon",50000,40,100,50
            ,10,2,1,1,2,10,10,0,0,0,0,
            0,0,0,0,0,0,0,0,0,
            0,0,4,0,0)
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

    SCYTHE_OF_INTELLIJ(new BattleItem(Material.GOLDEN_HOE, 1,false,"Scythe of Intellij", "weapon", 60,20,120,5
            ,0,0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,
            0,0,0,0,0)
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

    TEST_ITEM(new BattleItem(Material.ACACIA_SLAB,1,true,"Test Item", "weapon",5,5,1,1
            ,2,1,1,1,1,1,2,1,4,2,
            6,8,3,3,4,5,1,34,
            5,4,1,2,1,1,1)
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


    //REGULAR ITEMS
    DIAL_OF_THE_SUN(new Item(Material.CLOCK, 1,false, "Dial of the Sun")
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


    private final Item item;

    CustomItems(Item item){
        this.item = item;
    }


    //gets an items item
    //@return the Item
    public Item getItem(){
        return item;
    }

    //gets an item from the enum
    //@param name: The name of the item being picked.
    //@return the Item
    public static Item getItemFromName(String name){
        for (CustomItems item : CustomItems.values()){
            if (item.name().equalsIgnoreCase(name)){

                //if the item is unstackable, make it unstackable
                if (item.getItem().getUnstackable()){
                    item.item.getItemMeta().getPersistentDataContainer().set(new NamespacedKey(Main.getPlugin(Main.class), "uniqueID"),
                            PersistentDataType.STRING, UUID.randomUUID().toString());
                }
                return item.item;
            }
        }
        return null;
    }

    //

    //gets all the itemBuilders in the enum
    //@return ArrayList<Item> of all the items
    public static ArrayList<Item> getAllItems(){
        ArrayList<Item> items = new ArrayList<>();
        for (CustomItems item : CustomItems.values()){
            items.add(item.item);
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
