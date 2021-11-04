package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class WitherSkeletonListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.WITHER_SKELETON) {
            WitherSkeleton witherSkeleton = (WitherSkeleton) event.getEntity();

            AttributeInstance healthAttribute = witherSkeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            witherSkeleton.getEquipment().setBoots(new ItemStack(Material.NETHERITE_BOOTS));
            witherSkeleton.getEquipment().setItemInMainHand(new ItemStack(Material.NETHERITE_SWORD));
            witherSkeleton.setHealth(40);
        }
    }
}
