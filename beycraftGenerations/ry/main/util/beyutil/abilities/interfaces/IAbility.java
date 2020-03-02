package beycraftGenerations.ry.main.util.beyutil.abilities.interfaces;

import beycraftGenerations.ry.main.entity.EntityBey;
import net.minecraft.item.ItemStack;

public interface IAbility 
{
	public void executeAbility(EntityBey entity);

	public void executeAbility(ItemStack driver);
}
