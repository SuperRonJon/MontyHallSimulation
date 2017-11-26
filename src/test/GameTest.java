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
	
	@Test
	public void testMakeInitialChoice() {
		Game game = new Game();
		int max = 2;
		int min = 0;
		
		int choice = game.makeInitialChoice();
		
		assertTrue(min <= choice && choice <= max);
	}
	
	@Test
	public void testSwapChoice() {
		Game game = new Game();
		int firstChoice = game.makeInitialChoice();
		game.showEmptyDoor();
		int finalChoice = game.swapChoice();
		
		assertFalse(firstChoice == finalChoice);
		
		Door[] doors = game.getDoors();
		
		boolean flag = true;
		
		for(int i = 0; i < 2; i ++) {
			if(firstChoice == i && doors[i].isOpen()) {
				flag = false;
			}
			else if(finalChoice == i && doors[i].isOpen())
				flag = false;
		}
		
		assertTrue(flag);
	}

}
