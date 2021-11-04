package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class ZombieListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.ZOMBIE) {
            Zombie zombie = (Zombie) event.getEntity();

            AttributeInstance healthAttribute = zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            ItemStack knockbackSword = new ItemStack(Material.STONE_SWORD);
            knockbackSword.addEnchantment(Enchantment.KNOCKBACK, 2);
            knockbackSword.addEnchantment(Enchantment.DAMAGE_ALL, 2);

            zombie.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
            zombie.getEquipment().setItemInMainHand(knockbackSword);
            zombie.setHealth(40);
        }
    }
}
