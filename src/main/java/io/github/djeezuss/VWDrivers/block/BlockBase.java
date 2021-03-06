package io.github.djeezuss.VWDrivers.block;

import io.github.djeezuss.VWDrivers.VWDrivers;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {
	
	public String name;

	public BlockBase(Material materialIn, String name) {
		super(materialIn);
		
		this.name = name;
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(VWDrivers.creativeTab);
	}
	
	public void registerItemModel(ItemBlock itemBlock) {
		VWDrivers.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
}
