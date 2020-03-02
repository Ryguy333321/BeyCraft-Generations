package beycraftGenerations.ry.main.tabs;

import beycraftGenerations.ry.main.init.items.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ForgeDiskTab extends CreativeTabs
{

	public ForgeDiskTab(String name) 
	{
		super("forgedisks");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.ZERODISK);
	}

}
