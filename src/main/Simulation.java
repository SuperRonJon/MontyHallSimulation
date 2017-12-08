package main;

public class Simulation {
	private int iterations;
	private int wins;
	private int losses;
	private double winPercentage;
	
	public Simulation(int its) {
		iterations = its;
		wins = 0;
		losses = 0;
		winPercentage = 0.0;
	}
	
	public void run() {
		for(int i = 0; i < iterations; i++) {
			Game game = new Game();
			game.makeInitialChoice();
			game.showEmptyDoor();
			game.swapChoice();
			if(game.checkWin()) {
				wins++;	
			}
			else {
				losses++;
			}
		}
	}
	
	public void showStats() {
		winPercentage = (double)wins/iterations;
		
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + losses);
		System.out.println("Win %: " + winPercentage);
	}
}
