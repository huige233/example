package mcbugdev.example.init;

import mcbugdev.example.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlock {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block Example_Block = new BlockBase("example_block", Material.ROCK);
}
