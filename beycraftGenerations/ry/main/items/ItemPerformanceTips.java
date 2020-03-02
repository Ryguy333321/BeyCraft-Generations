package beycraftGenerations.ry.main.items;

import beycraftGenerations.ry.main.BeyCraftGenerations;
import beycraftGenerations.ry.main.init.items.ItemInit;
import beycraftGenerations.ry.main.util.beyutil.BeyTypes;
import beycraftGenerations.ry.main.util.beyutil.abilities.MultiType;
import beycraftGenerations.ry.main.util.beyutil.abilities.interfaces.IAbility;
import net.minecraft.item.Item;

public class ItemPerformanceTips extends ItemBeyPart 
{
	
	public ItemPerformanceTips(String name, BeyTypes type, IAbility primaryAbility, IAbility secundaryAbility) 
	{
		super(name, type, primaryAbility, secundaryAbility);
		setCreativeTab(BeyCraftGenerations.PerformanceTipTab);
		ItemInit.ItemPerformanceTips.add(this);
	}

}
