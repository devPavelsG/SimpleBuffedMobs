package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class BlazeListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.BLAZE) {
            Blaze blaze = (Blaze) event.getEntity();

            AttributeInstance healthAttribute = blaze.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            blaze.setHealth(40);
        }
    }
}
