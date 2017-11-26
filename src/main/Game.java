package main;

import java.util.Random;

public class Game {
	private Door[] doors;
	private Random rand;
	public int initialChoice;
	public int finalChoice;
	
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
	
	public void makeInitialChoice() {
		initialChoice = rand.nextInt(3);
		
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
	
	public void swapChoice() {
		for(int i = 0; i < 3; i++) {
			if(i != initialChoice && !(doors[i].isOpen())) {
				
			}
		}
	}
	
	public Door[] getDoors() {
		return doors;
	}
}
