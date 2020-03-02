package beycraftGenerations.ry.main;

import beycraftGenerations.ry.main.proxy.CommonProxy;
import beycraftGenerations.ry.main.tabs.EnergyLayerTab;
import beycraftGenerations.ry.main.tabs.ForgeDiskTab;
import beycraftGenerations.ry.main.tabs.PerformanceTips;
import beycraftGenerations.ry.main.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class BeyCraftGenerations 
{
	
	public static final CreativeTabs ForgeDiskTab = new ForgeDiskTab("forgedisks");
	public static final CreativeTabs EnergyLayerTab = new EnergyLayerTab("energylayers");
	public static final CreativeTabs PerformanceTipTab = new PerformanceTips("perfromancetips");
	
	@Instance
	public static BeyCraftGenerations beycraftgenerations;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent e)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent e)
	{
		
	}
	
}
