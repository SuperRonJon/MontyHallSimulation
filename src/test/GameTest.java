package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Door;
import main.Game;

public class GameTest {

	@Test
	public void testDoor() {
		Game game = new Game();
		boolean prize = false;
		
		Door[] doors = game.getDoors();
		
		for(int i = 0; i < 3; i++) {
			if(doors[i].hasPrize())
				prize = true;
		}
		assertTrue(prize);
	}

}
