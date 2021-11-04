package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Husk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class HuskListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.HUSK) {
            Husk husk = (Husk) event.getEntity();

            AttributeInstance healthAttribute = husk.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            ItemStack fireAspectSword = new ItemStack(Material.WOODEN_SWORD);
            fireAspectSword.addEnchantment(Enchantment.FIRE_ASPECT, 1);

            husk.addPotionEffects(new ArrayList<PotionEffect>() {{
                add(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3, false, false, false));
            }});
            husk.getEquipment().setItemInMainHand(fireAspectSword);
            husk.setHealth(40);
        }
    }
}
