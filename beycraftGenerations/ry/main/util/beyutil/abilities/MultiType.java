package beycraftGenerations.ry.main.util.beyutil.abilities;

import java.util.List;

import beycraftGenerations.ry.main.entity.EntityBey;
import beycraftGenerations.ry.main.items.ItemBeyPart;
import beycraftGenerations.ry.main.util.beyutil.BeyTypes;
import beycraftGenerations.ry.main.util.beyutil.abilities.interfaces.IAbility;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class MultiType implements IAbility 
{

	private final List<BeyTypes> types;

	/**
	 * 
	 */
	public MultiType(List<BeyTypes> types) {
		this.types = types;

	}

	public List<BeyTypes> getTypes() {
		return types;
	}

	public void executeAbility(EntityBey entity) {
	}

	@Override
	public void executeAbility(ItemStack stack) {
		if(!stack.hasTagCompound()) {
			NBTTagCompound compound = new NBTTagCompound();
			compound.setString("Type", ((ItemBeyPart)stack.getItem()).getType().name());
			stack.setTagCompound(compound);
		}
		int count = 0;
		for (int i = 0; i < types.size(); i++) {
			if(stack.getTagCompound().getString("Type").equals(types.get(i).name())){
				count = i;
			}
		}
		if((count+1)<types.size()) {
			stack.getTagCompound().setString("Type", types.get(count+1).name());
		} else {
			stack.getTagCompound().setString("Type", types.get(0).name());
		}
	}
}
