package de.laykzz.lobbysystem.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DiscordCommand implements CommandExecutor {
    @java.lang.Override
    public boolean onCommand(CommandSender sender, Command command, java.lang.String label, java.lang.String[] args) {
        sender.sendMessage("§7§l[§d§lSystem§7§l]§7 §2Hiermit kommst du auf unseren Discord Server : ");
        return false;
    }
}
