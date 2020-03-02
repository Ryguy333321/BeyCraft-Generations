package beycraftGenerations.ry.main.init.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import beycraftGenerations.ry.main.items.ItemEnergyLayerDual;
import beycraftGenerations.ry.main.items.ItemEnergyLayers;
import beycraftGenerations.ry.main.items.ItemForgeDiscs;
import beycraftGenerations.ry.main.items.ItemPerformanceTips;
import beycraftGenerations.ry.main.util.beyutil.BeyTypes;
import beycraftGenerations.ry.main.util.beyutil.abilities.Absorb;
import beycraftGenerations.ry.main.util.beyutil.abilities.MultiType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;

public class ItemInit 
{
	//Item Lists
	public static final ArrayList<Item> ItemGatinkoChips = new ArrayList<Item>();
	public static final List<Item> ItemLayerWeights = new ArrayList<Item>();
	public static final List<Item> ItemLayerBases = new ArrayList<Item>();
	public static final List<Item> ItemForgeDiscs = new ArrayList<Item>();
	public static final List<Item> ItemPerformanceTips = new ArrayList<Item>();
	public static final List<Item> ItemLayerAccessories = new ArrayList<Item>();
	public static final List<Item> ItemEnergyLayers = new ArrayList<Item>();
	public static final List<Item> ItemLaunchers = new ArrayList<Item>();
	
	//Items
	public static final ItemEnergyLayers SPYRIZENREQUIUM = new ItemEnergyLayerDual("requiem_spryzen", -0.23F, 3, 3, 4, 1, new Absorb(), null, BeyTypes.BALANCE);
	public static final ItemForgeDiscs ZERODISK = new ItemForgeDiscs("0disk");
	public static final ItemPerformanceTips ZETASDRIVER = new ItemPerformanceTips("zetas_driver", null, null, null);
	
	
}
