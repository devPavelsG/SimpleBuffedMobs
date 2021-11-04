package me.pavelsgarklavs.buffedmobs.listeners;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Spider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class SpiderListener implements Listener {
    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.SPIDER) {
            Spider spider = (Spider) event.getEntity();

            AttributeInstance healthAttribute = spider.getAttribute(Attribute.GENERIC_MAX_HEALTH);
            healthAttribute.setBaseValue(40);

            spider.addPotionEffects(new ArrayList<PotionEffect>() {{
                add(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3, false, false, false));
            }});
            spider.setHealth(40);
        }
    }
}
