package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class DrownedListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.DROWNED) {
            Drowned drowned = (Drowned) event.getEntity();

            AttributeInstance healthAttribute = drowned.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            ItemStack fastBoots = new ItemStack(Material.LEATHER_BOOTS);
            fastBoots.addEnchantment(Enchantment.DEPTH_STRIDER, 3);

            drowned.getEquipment().setBoots(fastBoots);
            drowned.setHealth(40);
        }
    }
}
