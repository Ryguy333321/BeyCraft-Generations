package beycraftGenerations.ry.main.items;

import beycraftGenerations.ry.main.BeyCraftGenerations;
import beycraftGenerations.ry.main.init.items.ItemInit;
import beycraftGenerations.ry.main.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemForgeDiscs extends Item 
{
	public ItemForgeDiscs(String name) 
	{
		setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		this.setUnlocalizedName(name);
		setCreativeTab(BeyCraftGenerations.ForgeDiskTab);
		ItemInit.ItemForgeDiscs.add(this);
	}
}
