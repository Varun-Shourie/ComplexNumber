package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int count = 0;
	    
        for(int number = 1; number <= 1000; number++) {
		
            if(number % 3 == 0 && number % 5 == 0) {
                System.out.println("Number which meets conditions: " + number);
                sum += number;
                count++;
            }
            else if(count == 5) {
                break;
            }
        }
	    
        System.out.println("Sum of all numbers provided: " + sum);
    }
}
