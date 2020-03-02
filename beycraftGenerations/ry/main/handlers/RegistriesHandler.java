package beycraftGenerations.ry.main.handlers;

import beycraftGenerations.ry.main.BeyCraftGenerations;
import beycraftGenerations.ry.main.init.blocks.BlockInit;
import beycraftGenerations.ry.main.init.items.ItemInit;
import beycraftGenerations.ry.main.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RegistriesHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ItemGatinkoChips.toArray(new Item[0]));
		event.getRegistry().registerAll(ItemInit.ItemLayerWeights.toArray(new Item[0]));
		event.getRegistry().registerAll(ItemInit.ItemLayerBases.toArray(new Item[0]));
		event.getRegistry().registerAll(ItemInit.ItemForgeDiscs.toArray(new Item[0]));
		event.getRegistry().registerAll(ItemInit.ItemPerformanceTips.toArray(new Item[0]));
		event.getRegistry().registerAll(ItemInit.ItemEnergyLayers.toArray(new Item[0]));
		event.getRegistry().registerAll(ItemInit.ItemLayerAccessories.toArray(new Item[0]));
		event.getRegistry().registerAll(ItemInit.ItemLaunchers.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ItemGatinkoChips)
		{
			BeyCraftGenerations.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for(Item item : ItemInit.ItemLayerWeights)
		{
			BeyCraftGenerations.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for(Item item : ItemInit.ItemLayerAccessories)
		{
			BeyCraftGenerations.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for(Item item : ItemInit.ItemLayerBases)
		{
			BeyCraftGenerations.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for(Item item : ItemInit.ItemEnergyLayers)
		{
			BeyCraftGenerations.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for(Item item : ItemInit.ItemForgeDiscs)
		{
			BeyCraftGenerations.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for(Item item : ItemInit.ItemPerformanceTips)
		{
			BeyCraftGenerations.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for(Item item : ItemInit.ItemLaunchers)
		{
			BeyCraftGenerations.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		
		for(Block block : BlockInit.BEYCRAFTBLOCKS)
		{
			BeyCraftGenerations.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		}
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BEYCRAFTBLOCKS.toArray(new Block[0]));
	}
	
	
}
