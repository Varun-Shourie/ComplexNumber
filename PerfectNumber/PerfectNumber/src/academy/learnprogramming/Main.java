package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        int sumOfNumbers = 0;
        
        if(number < 1) 
            return false;
        else {
        	
            for(int a = 1; a < number; a++) {
                if(number % a == 0)
                    sumOfNumbers += a;
                else if(sumOfNumbers == number) {
                    return true;
            }
                
            return false;
        }
    }
}
