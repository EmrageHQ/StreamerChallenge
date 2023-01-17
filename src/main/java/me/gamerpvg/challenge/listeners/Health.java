package me.gamerpvg.challenge.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Health implements Listener {
    @EventHandler
    public void PlayerDamage(final EntityDamageEvent event) {
        final Player p = (Player)event.getEntity();
        if (event.getEntity() instanceof Player) {
            p.setMaxHealth(p.getHealth());
        }
    }

    @EventHandler
    public void onDamage(final EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            final Player p = (Player)e.getEntity();
            p.setMaxHealth(p.getHealth());
            p.sendMessage("§4Du hast nur noch §l" + p.getHealth() / 2.0 + " §r§4Herzen!");
        }
    }
}
