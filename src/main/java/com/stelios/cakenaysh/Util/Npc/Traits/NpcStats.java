package com.stelios.cakenaysh.Util.Npc.Traits;

import com.stelios.cakenaysh.Main;
import net.citizensnpcs.api.persistence.Persist;
import net.citizensnpcs.api.trait.Trait;

public class NpcStats extends Trait {
    public NpcStats() {
        super("npcstats");
        main = Main.getPlugin(Main.class);
    }

    Main main;

    //stats
    @Persist("critDamage") float critDamage = 0.0f;
    @Persist("critChance") float critChance = 0.0f;
    @Persist("strength") float strength = 0.0f;
    @Persist("defense") float defense = 0.0f;
    @Persist("infernalDefense") float infernalDefense = 0.0f;
    @Persist("infernalDamage") float infernalDamage = 0.0f;
    @Persist("undeadDefense") float undeadDefense = 0.0f;
    @Persist("undeadDamage") float undeadDamage = 0.0f;
    @Persist("aquaticDefense") float aquaticDefense = 0.0f;
    @Persist("aquaticDamage") float aquaticDamage = 0.0f;
    @Persist("aerialDefense") float aerialDefense = 0.0f;
    @Persist("aerialDamage") float aerialDamage = 0.0f;
    @Persist("meleeDefense") float meleeDefense = 0.0f;
    @Persist("meleeDamage") float meleeDamage = 0.0f;
    @Persist("rangedDefense") float rangedDefense = 0.0f;
    @Persist("rangedDamage") float rangedDamage = 0.0f;
    @Persist("magicDefense") float magicDefense = 0.0f;
    @Persist("magicDamage") float magicDamage = 0.0f;

    //getters
    public float getCritDamage() {
        return critDamage;
    }
    public float getCritChance() {
        return critChance;
    }
    public float getStrength() {
        return strength;
    }
    public float getDefense() {
        return defense;
    }
    public float getInfernalDefense() {
        return infernalDefense;
    }
    public float getInfernalDamage() {
        return infernalDamage;
    }
    public float getUndeadDefense() {
        return undeadDefense;
    }
    public float getUndeadDamage() {
        return undeadDamage;
    }
    public float getAquaticDefense() {
        return aquaticDefense;
    }
    public float getAquaticDamage() {
        return aquaticDamage;
    }
    public float getAerialDefense() {
        return aerialDefense;
    }
    public float getAerialDamage() {
        return aerialDamage;
    }
    public float getMeleeDefense() {
        return meleeDefense;
    }
    public float getMeleeDamage() {
        return meleeDamage;
    }
    public float getRangedDefense() {
        return rangedDefense;
    }
    public float getRangedDamage() {
        return rangedDamage;
    }
    public float getMagicDefense() {
        return magicDefense;
    }
    public float getMagicDamage() {
        return magicDamage;
    }

    //setting a stat
    public void setStat(String name, float value){
        switch(name){
            case "critdamage":
                critDamage = value;
                break;
            case "critchance":
                critChance = value;
                break;
            case "strength":
                strength = value;
                break;
            case "defense":
                defense = value;
                break;
            case "infernaldefense":
                infernalDefense = value;
                break;
            case "infernaldamage":
                infernalDamage = value;
                break;
            case "undeaddefense":
                undeadDefense = value;
                break;
            case "undeaddamage":
                undeadDamage = value;
                break;
            case "aquaticdefense":
                aquaticDefense = value;
                break;
            case "aquaticdamage":
                aquaticDamage = value;
                break;
            case "aerialdefense":
                aerialDefense = value;
                break;
            case "aerialdamage":
                aerialDamage = value;
                break;
            case "meleedefense":
                meleeDefense = value;
                break;
            case "meleedamage":
                meleeDamage = value;
                break;
            case "rangeddefense":
                rangedDefense = value;
                break;
            case "rangeddamage":
                rangedDamage = value;
                break;
            case "magicdefense":
                magicDefense = value;
                break;
            case "magicdamage":
                magicDamage = value;
                break;
        }
    }

    //resetting all stats
    public void resetStats(){
        critDamage = 0.0f;
        critChance = 0.0f;
        strength = 0.0f;
        defense = 0.0f;
        infernalDefense = 0.0f;
        infernalDamage = 0.0f;
        undeadDefense = 0.0f;
        undeadDamage = 0.0f;
        aquaticDefense = 0.0f;
        aquaticDamage = 0.0f;
        aerialDefense = 0.0f;
        aerialDamage = 0.0f;
        meleeDefense = 0.0f;
        meleeDamage = 0.0f;
        rangedDefense = 0.0f;
        rangedDamage = 0.0f;
        magicDefense = 0.0f;
        magicDamage = 0.0f;
    }


}