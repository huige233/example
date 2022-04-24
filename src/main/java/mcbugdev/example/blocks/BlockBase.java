package mcbugdev.example.blocks;

import mcbugdev.example.init.ModBlock;
import mcbugdev.example.init.ModItems;
import mcbugdev.example.main;
import mcbugdev.example.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Random;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(main.Exampletab);
        ModBlock.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }


    @Override
    public void registerModels() {
        main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
