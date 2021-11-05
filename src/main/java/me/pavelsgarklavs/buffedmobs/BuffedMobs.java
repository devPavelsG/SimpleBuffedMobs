package me.pavelsgarklavs.buffedmobs;

import me.pavelsgarklavs.buffedmobs.listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class BuffedMobs extends JavaPlugin {
    public static BuffedMobs instance;

    public static BuffedMobs getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        System.out.println("\u001b[31mBuffedMobs has started! \u001b[32;1mAuthor: \u001b[31mDev_Pavels\u001b[0m");

        getServer().getPluginManager().registerEvents(new CreeperListener(), this);
        getServer().getPluginManager().registerEvents(new ZombieListener(), this);
        getServer().getPluginManager().registerEvents(new SkeletonListener(), this);
        getServer().getPluginManager().registerEvents(new SpiderListener(), this);
        getServer().getPluginManager().registerEvents(new EndermanListener(), this);
        getServer().getPluginManager().registerEvents(new DrownedListener(), this);
        getServer().getPluginManager().registerEvents(new HuskListener(), this);
        getServer().getPluginManager().registerEvents(new StrayListener(), this);
        getServer().getPluginManager().registerEvents(new PiglinListener(), this);
        getServer().getPluginManager().registerEvents(new WitherSkeletonListener(), this);
        getServer().getPluginManager().registerEvents(new BlazeListener(), this);
    }

    @Override
    public void onDisable() {
        instance = null;

        System.out.println("\u001b[31mBuffedMobs has stopped!\u001b[0m");
    }
}
