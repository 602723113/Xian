package top.zoyn.xian.manager;

import com.cryptomorin.xseries.XMaterial;
import com.google.common.collect.Lists;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import top.zoyn.xian.Xian;
import top.zoyn.xian.utils.ItemBuilder;

import java.io.File;
import java.util.List;

public class ItemManager {

    private static final List<ItemStack> yaodan = Lists.newArrayList();

    public static List<ItemStack> getYaodan() {
        return yaodan;
    }

    public static void loadItems() {
        FileConfiguration yaodanConfig = YamlConfiguration.loadConfiguration(new File(Xian.getInstance().getDataFolder(), "yaodan.yml"));
        yaodanConfig.getKeys(false).forEach(attribute -> {
            String displayName = yaodanConfig.getString(attribute + ".display-name");
            for (int i = 0; i < 9; i++) {
                String showName = displayName.replace("&", "§").replace("%level%", "" + (i + 1));
                XMaterial.CHARCOAL.getId();
                ItemBuilder builder = new ItemBuilder(Material.getMaterial(yaodanConfig.getString(attribute + ".material")))
                        .itemFlag(ItemFlag.HIDE_ENCHANTS)
                        .displayName(showName);
                if (i >= 4) {
                    builder.enchant(Enchantment.DURABILITY, 1, true);
                }
                yaodan.add(builder.build());
//

            }
        });
    }

}
