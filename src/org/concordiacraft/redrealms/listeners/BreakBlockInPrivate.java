package org.concordiacraft.redrealms.listeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.concordiacraft.redrealms.data.DataChunk;
import org.concordiacraft.redrealms.utilits.ChunkWork;

public class BreakBlockInPrivate implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerInteractWithBlock(PlayerInteractEvent e) {

/*        if (e.getPlayer().getInventory()) {
            Player player = e.getPlayer();
            RedMessenger.getManager().msg(player, RedMessenger.MessageType.NOTIFY, "Вы уверены, что хотите основать на выбранном регионе новый лагерь?");
        }*/
    }
}