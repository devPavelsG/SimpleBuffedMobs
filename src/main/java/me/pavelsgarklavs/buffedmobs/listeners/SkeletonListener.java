package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class SkeletonListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.SKELETON) {
            Skeleton skeleton = (Skeleton) event.getEntity();

            AttributeInstance healthAttribute = skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            ItemStack punchBow = new ItemStack(Material.BOW);
            punchBow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
            punchBow.addEnchantment(Enchantment.ARROW_FIRE, 1);
            punchBow.addEnchantment(Enchantment.ARROW_DAMAGE, 1);

            skeleton.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
            skeleton.getEquipment().setItemInMainHand(punchBow);
            skeleton.setHealth(40);
        }
    }
}
