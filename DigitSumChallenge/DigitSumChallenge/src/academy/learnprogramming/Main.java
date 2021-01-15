package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
        System.out.println(250 % 10);
    }

    public static int sumDigits(int number) {
        int sumOfDigits = 0;
        
        if(number < 10)
            return -1;
        else {
        	// Extracts and drops the least significant digit until are digits are summed. 
            while(true) {
                sumOfDigits += number % 10; 
                number = number / 10; 
                
                if(number < 10) {
                    sumOfDigits += number;
                    break;
                }
            }
            
            return sumOfDigits;
        }
    }
}
