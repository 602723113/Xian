package top.zoyn.xian;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import top.zoyn.xian.command.XianCommand;
import top.zoyn.xian.manager.ItemManager;

/**
 * 插件主类
 *
 * @author Zoyn
 */
public final class Xian extends JavaPlugin {

    private static Xian instance;

    public static Xian getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getConsoleSender().sendMessage("§7[§e修真|Xian§7] §6天地玄黃，宇宙洪荒。日月盈昃，辰宿列張。");
        Bukkit.getPluginCommand("zentia").setExecutor(new XianCommand());

        saveResource("yaodan.yml", false);
        // 读取物品
        ItemManager.loadItems();
    }

}
