package beycraftGenerations.ry.main.items;

import beycraftGenerations.ry.main.BeyCraftGenerations;
import beycraftGenerations.ry.main.entity.EntityBey;
import beycraftGenerations.ry.main.init.items.ItemInit;
import beycraftGenerations.ry.main.util.beyutil.BeyTypes;
import beycraftGenerations.ry.main.util.beyutil.abilities.Absorb;
import beycraftGenerations.ry.main.util.beyutil.abilities.interfaces.IAbility;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemEnergyLayers extends ItemBeyPart 
{
	public final float height;
	protected final float rotationDirection;
	private final int attack;
	private final int defense;
	private final int weight;

	public ItemEnergyLayers(String name, float height, int rotationDirection, int attack, int defense, int weight, IAbility primaryAbility, IAbility secandaryAbility, BeyTypes type) 
	{
		super(name, type, primaryAbility, secandaryAbility);
		this.attack = attack;
		this.defense = defense;
		this.weight = weight;
		this.height = height;
		this.rotationDirection = rotationDirection;
		ItemInit.ItemEnergyLayers.add(this);
	}
	
	public void registerModels()
	{
		BeyCraftGenerations.proxy.registerItemRenderer(this, 0, "inventory");
	}

	public float getHeight() 
	{
		return height;
	}

	public int getAttack() 
	{
		return attack;
	}

	public int getDefense() 
	{
		return defense;
	}

	public int getWeight() 
	{
		return weight;
	}

	public float getRotationDirection() 
	{
		return rotationDirection;
	}

	public boolean canAbsorb(EntityBey entity) 
	{
		return (PRIMARYABILITY instanceof Absorb || SECUNDARYABILITY instanceof Absorb)
				&& entity.getRotationDirection() != rotationDirection;
	}
	
}
