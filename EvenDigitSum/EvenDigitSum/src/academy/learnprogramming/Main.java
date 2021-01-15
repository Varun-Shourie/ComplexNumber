package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2552));
    }
    public static int getEvenDigitSum(int number) {
    	
        int sumOfEvenDigits = 0; 
        
     // exercise asks us to return -1 for negative numbers
        if(number < 0) {
            return -1; 
        }
        
        while(number > 0) {
        	
            int digit = number % 10;
            
            if(digit % 2 == 0) 
                sumOfEvenDigits = sumOfEvenDigits + digit;
            
            number /= 10;
        }
        
        return sumOfEvenDigits;
    }

}
