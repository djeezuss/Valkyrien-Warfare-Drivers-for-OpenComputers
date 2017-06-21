package io.github.djeezuss.VWDrivers;

import io.github.djeezuss.VWDrivers.block.ModBlocks;
import io.github.djeezuss.VWDrivers.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ModCreativeTab extends CreativeTabs {

	public ModCreativeTab() {
		super(Reference.MOD_ID);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.shipInterface);
	}

}
