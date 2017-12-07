package main;

import java.util.Random;

public class Game {
	private Door[] doors;
	private Random rand;
	private int initialChoice;
	private int finalChoice;
	
	public Game() {
		doors = new Door[3];
		
		for(int i = 0; i < 3; i ++) {
			doors[i] = new Door();
		}
		
		rand = new Random();
		int random = rand.nextInt(3);
		doors[random].givePrize();
		
		initialChoice = -1;
		finalChoice = -1;
	}
	
	public int makeInitialChoice() {
		initialChoice = rand.nextInt(3);
		return initialChoice;
		
	}
	
	public void showEmptyDoor()
	{
		for(int i = 0; i < 3; i++) {
			if(i != initialChoice && !(doors[i].hasPrize())) {
				doors[i].open();
				return;
			}
		}
	}
	
	public int swapChoice() {
		for(int i = 0; i < 3; i++) {
			if(i != initialChoice && !(doors[i].isOpen())) {
				finalChoice = i;
			}
		}
		
		return finalChoice;
	}
	
	public boolean checkWin() {
		return doors[finalChoice].hasPrize();
	}
	
	public Door[] getDoors() {
		return doors;
	}
}
