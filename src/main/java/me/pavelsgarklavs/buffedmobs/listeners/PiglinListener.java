package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Piglin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class PiglinListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.PIGLIN) {
            Piglin piglin = (Piglin) event.getEntity();

            AttributeInstance healthAttribute = piglin.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            piglin.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
            piglin.setHealth(40);
        }
    }
}
