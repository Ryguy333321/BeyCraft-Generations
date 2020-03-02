package beycraftGenerations.ry.main.items;

import beycraftGenerations.ry.main.util.beyutil.BeyTypes;
import beycraftGenerations.ry.main.util.beyutil.abilities.interfaces.IAbility;

public class ItemEnergyLayerDual extends ItemEnergyLayers 
{

	public ItemEnergyLayerDual(String name, float height, int attack, int defense, int weight, int burst,
			IAbility primaryAbility, IAbility secundaryAbility, BeyTypes type) {
		super(name, height, 1, attack, defense, weight, primaryAbility, secundaryAbility, type);
		
	}

}
