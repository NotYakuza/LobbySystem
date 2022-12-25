package de.laykzz.lobbysystem.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage("⋙\n§7§l[§d§lServer§7§l]§7 §c" + event.getPlayer().getName() + "§2 ist dem Server gejoint!\n§r⋙");
        player.setLevel(2022);
        player.setGlowing(false);

        ItemStack compass = new ItemStack(Material.COMPASS, 1);
        ItemMeta compassMeta = compass.getItemMeta();
        compassMeta.setDisplayName("§6§lReisekompass");
        compass.setItemMeta(compassMeta);


        ItemStack rod = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta rodMeta = rod.getItemMeta();
        rodMeta.setDisplayName("§6§lSpieler Sichtbarkeit");
        rod.setItemMeta(rodMeta);


        ItemStack skull = new ItemStack(Material.SKELETON_SKULL, 1);
        ItemMeta skullMeta = skull.getItemMeta();
        skullMeta.setDisplayName("§6§lSpieler Informationen");
        skull.setItemMeta(skullMeta);

        player.getInventory().clear();
        player.getInventory().setItem(4, new ItemStack(compass));
        player.getInventory().setItem(2, new ItemStack(rod));
        player.getInventory().setItem(6, new ItemStack(skull));

    }
}
