package tests;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import v3_instruments.* ;


public class InventoryTest {

	private Inventory inventory;

	public InventoryTest() {
		inventory = new Inventory() ;
		v3_instruments.Client.initializeInventory(inventory);
	}
	
	@Test
	public void testInventory() {
		assertTrue(inventory!=null);
	}

	@Test
	public void testAddInstrument() {
		HashMap prop = new HashMap() ;
		prop.put("instrument type", InstrumentType.MANDOLIN) ;
		prop.put("style", Style.A) ;
		
		inventory.addInstrument("19292", 295.95, new InstrumentSpec(prop)) ;

		assertTrue (inventory.getInstrument("19292")!=null) ;
	}

	@Test
	public void testGetInstrument() {
		assertFalse (inventory.getInstrument("V95693")!=null) ;
		assertTrue (inventory.getInstrument("5A8BCC")!=null) ;
		assertEquals ("4500000", inventory.getInstrument("4500000").getSerialNumber());
		assertEquals (new Double(999.99), (Double) inventory.getInstrument("5ADDD28C").getPrice());
	}

	@Test
	public void testSearch() {
		HashMap prop = new HashMap() ;
		prop.put("instrument type", InstrumentType.MANDOLIN) ;
		prop.put("style", Style.A) ;
		assertTrue(inventory.search(new InstrumentSpec(prop)) != null);
		
		prop = new HashMap() ;
		prop.put("instrument type", InstrumentType.GUITAR) ;
		assertTrue(inventory.search(new InstrumentSpec(prop))!=null);
	}



}
