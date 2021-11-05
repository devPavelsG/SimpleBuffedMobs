package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class EndermanListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.ENDERMAN) {
            Enderman enderman = (Enderman) event.getEntity();

            enderman.addPotionEffects(new ArrayList<PotionEffect>() {{
                add(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 5, false, false, false));
            }});
        }
    }
}
