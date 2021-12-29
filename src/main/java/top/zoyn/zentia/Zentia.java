package top.zoyn.zentia;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import top.zoyn.zentia.command.ZentiaCommand;
import top.zoyn.zentia.manager.ItemManager;

/**
 * 插件主类
 *
 * @author Zoyn
 */
public final class Zentia extends JavaPlugin {

    private static Zentia instance;

    public static Zentia getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getConsoleSender().sendMessage("§6[寻仙|Zentia] 寻仙者, 慎也!");
        Bukkit.getPluginCommand("zentia").setExecutor(new ZentiaCommand());

        saveResource("yaodan.yml", false);
        // 读取物品
        ItemManager.loadItems();
    }

    @Override
    public void onDisable() {
    }
}
