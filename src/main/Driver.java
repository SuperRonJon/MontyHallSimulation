package main;

public class Driver {

	public static void main(String[] args) {
		Simulation sim = new Simulation(10);
		sim.run();
		sim.showStats();

	}

}
