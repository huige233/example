package mcbugdev.example.item;

import mcbugdev.example.init.ModItems;
import mcbugdev.example.main;
import mcbugdev.example.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name, CreativeTabs tab) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(tab);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
