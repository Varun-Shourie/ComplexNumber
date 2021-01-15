// PROJECT: Converts a kilometer quantity to miles. 
// NUMBER: 1

import java.util.Random;

public class SpeedConverter {
	
	public static void main(String[] args) {
		
		int randomNumber = 0;
		
		Random randomGenerator = new Random();
	
		randomNumber = randomGenerator.nextInt(100);
		
		System.out.printf("Here's a value which is chosen by me: %d.\n", randomNumber);
		printConversion(randomNumber);
		
	}
	
	// Converts a kilometer quantity to miles per hour.
	private static long toMilesPerHour(double kilometersPerHour) {
		
		if(kilometersPerHour < 0) 
			return -1;
		else
			return Math.round(kilometersPerHour / 1.609);
	}
	
	// Prints the converted value. 
	private static void printConversion(double kilometersPerHour) {
		
		if(kilometersPerHour < 0)
			System.out.println("Invalid value");
		else
			System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
	}
	
}
