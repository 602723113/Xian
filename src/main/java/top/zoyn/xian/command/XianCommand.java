package top.zoyn.xian.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import top.zoyn.xian.manager.ItemManager;
import top.zoyn.xian.utils.PageableInventory;

public class XianCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("zentia")) {
            Player player = (Player) sender;
            PageableInventory pageInv = new PageableInventory(54, "§8[ §4妖丹列表 §8]", ItemManager.getYaodan(), 1, 45);
            player.openInventory(pageInv.getInventory());
            return true;
        }
        return false;
    }
}
