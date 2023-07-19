package com.stelios.cakenaysh.Util.AbilityCreation.Abilities;

import com.stelios.cakenaysh.Util.AbilityCreation.ItemAbility;
import com.stelios.cakenaysh.Main;
import com.stelios.cakenaysh.Util.AbilityCreation.CustomAbilities;
import com.stelios.cakenaysh.Util.Items.ItemBuilder;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class DialOfTheSunAbility extends ItemAbility {

    public DialOfTheSunAbility(CustomAbilities ability, ItemBuilder item, int stamina, long cooldown) {
        super(ability, item, stamina, cooldown);
    }

    @Override
    public void doAbility(Player player) {

        //play sound
        player.playSound(player.getLocation(), Sound.ENTITY_WITHER_SPAWN, 1, 100);

        //gradually set the time to dawn
        new BukkitRunnable() {
        long time = player.getWorld().getTime();
        @Override
        public void run() {
            if (time > 23800) {
                this.cancel();
                return;
            }
            time += 100;
            player.getWorld().setTime(time);
        }
        }.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
    }
}