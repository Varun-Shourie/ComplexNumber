package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0; // add Math.round later;
        long numberCount = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            boolean isAnInt = scanner.hasNextInt();
            
            if(isAnInt) {
                numberCount++;
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                average = Math.round(sum / (double) (numberCount));
            } else {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
