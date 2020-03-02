package beycraftGenerations.ry.main.tabs;

import beycraftGenerations.ry.main.init.items.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PerformanceTips extends CreativeTabs
{

	public PerformanceTips(String name) 
	{
		super("Performancetips");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.ZETASDRIVER);
	}

}