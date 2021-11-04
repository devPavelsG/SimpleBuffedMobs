package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class CreeperListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.CREEPER) {
            Creeper creeper = (Creeper) event.getEntity();

            AttributeInstance healthAttribute = creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            creeper.setPowered(true);
            creeper.setFuseTicks(15);
            creeper.setHealth(40);
        }
    }

}
