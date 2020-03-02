package beycraftGenerations.ry.main.tabs;

import beycraftGenerations.ry.main.init.items.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EnergyLayerTab extends CreativeTabs
{

	public EnergyLayerTab(String name) 
	{
		super("energylayers");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.SPYRIZENREQUIUM);
	}
}
