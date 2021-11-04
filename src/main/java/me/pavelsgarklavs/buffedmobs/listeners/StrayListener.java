package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Stray;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class StrayListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.STRAY) {
            Stray stray = (Stray) event.getEntity();

            AttributeInstance healthAttribute = stray.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            ItemStack powerBow = new ItemStack(Material.BOW);
            powerBow.addEnchantment(Enchantment.ARROW_DAMAGE, 3);

            stray.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
            stray.getEquipment().setItemInMainHand(powerBow);
            stray.setHealth(40);
        }
    }
}
