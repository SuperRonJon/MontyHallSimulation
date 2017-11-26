package main;

public class Simulation {
	private int iterations;
	private int wins;
	private int losses;
	private int maxWins;
	private double winPercentage;
	
	public Simulation(int its) {
		iterations = its;
		wins = 0;
		losses = 0;
		maxWins = 0;
		winPercentage = 0.0;
	}
	
	public void run() {
		int winstreak = 0;
		for(int i = 0; i < iterations; i++) {
			Game game = new Game();
			game.makeInitialChoice();
			game.showEmptyDoor();
			if(game.checkWin()) {
				wins++;
				winstreak++;
				if(winstreak > maxWins)
				maxWins = wins;
			}
			else {
				losses++;
				winstreak = 0;
			}
		}
	}
	
	public void showStats() {
		winPercentage = (double)wins/iterations;
		
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + losses);
		System.out.println("Win %: " + winPercentage);
		System.out.println("Maximum wins in a row: " + maxWins);
	}
}
