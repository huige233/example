package mcbugdev.example.init;

import mcbugdev.example.item.ItemBase;
import mcbugdev.example.main;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final Item ExampleItem = new ItemBase("bedrock_li", main.Exampletab);
}
