package mcbugdev.example;

import mcbugdev.example.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ExamplesTab extends CreativeTabs {
    public ExamplesTab() {
        super("example");
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public ItemStack createIcon() {
        return(new ItemStack(ModItems.ExampleItem));
    }
}
