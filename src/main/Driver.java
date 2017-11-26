package main;

import java.io.IOException;
import java.util.Scanner;

public class Driver {
	
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter number of experiments: ");
		int iterations = sc.nextInt();
		Simulation sim = new Simulation(iterations);
		sim.run();
		sim.showStats();
		System.out.println("\nPress ENTER to exit...");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
