package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberCount = 0;
        int maximum = 0; // you can also set max to max int value
        int minimum = 0; // you can also set min to min int value and compare from there.

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            numberCount++;

            if(hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine();

                if(numberCount == 1) {
                    maximum = number;
                    minimum = number;
                }
                // another way to write if and else logic in this case is:
                // if(first) {
                //    first = false;
                //    minimum = number;
                //    maximum = number;

                else {
                    if(number > maximum)
                        maximum = number;
                    else if(number < minimum)
                        minimum = number;
                }

                System.out.println("minimum number: " + minimum);
                System.out.println("maximum number: " + maximum);
            }
            else {
                break;
            }
        }

        System.out.println("minimum number: " + minimum);
        System.out.println("maximum number: " + maximum);

        scanner.close();
    }
}
