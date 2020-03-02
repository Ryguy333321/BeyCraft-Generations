package beycraftGenerations.ry.main.entity;

import beycraftGenerations.ry.main.init.items.ItemInit;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.MoverType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityBey extends EntityCreature implements IEntityAdditionalSpawnData
{

	private int rotationDirection;
	
	public EntityBey(World worldIn) 
	{
		super(worldIn);
	}

	@Override
	public void writeSpawnData(ByteBuf buffer) 
	{
		
	}

	@Override
	public void readSpawnData(ByteBuf additionalData) 
	{
	
	}

	public int getRotationDirection() {
		return rotationDirection;
	}
	
}

