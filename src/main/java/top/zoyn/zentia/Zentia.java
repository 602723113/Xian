package top.zoyn.zentia;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 插件主类
 *
 * @author Zoyn
 */
public final class Zentia extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§[寻仙|Zentia] 寻仙者, 慎也!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
