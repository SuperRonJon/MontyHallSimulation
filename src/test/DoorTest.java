package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Door;

public class DoorTest {

	@Test
	public void testOpenDoor() {
		Door d = new Door();
		assertFalse(d.isOpen());
		d.open();
		assertTrue(d.isOpen());
	}
	
	@Test
	public void testGivePrize() {
		Door d = new Door();
		assertFalse(d.hasPrize());
		d.givePrize();
		assertTrue(d.hasPrize());
	}

}
