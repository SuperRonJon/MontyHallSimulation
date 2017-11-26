package main;

public class Door {
	private boolean prize;
	private boolean open;
	
	public Door() {
		prize = false;
		open = false;
	}
	
	public void givePrize() {
		prize = true;
	}
	
	public boolean hasPrize() {
		return prize;
	}
	
	public void open() {
		open = true;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public void reset() {
		prize = false;
		open = false;
	}
}
