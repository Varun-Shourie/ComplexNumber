package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	
        System.out.println(isPalindrome(11212));
        
        System.out.println(isPalindrome(22222));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int initialNumber = number;
        
        
        if(number < 0) {
            number *= -1;
            initialNumber *= -1;
        } 
        
        while(number > 0) {
            int lastDigit = number % 10;
            
            reverse *= 10;
            reverse += lastDigit;
            
            number /= 10;
        }
        
        return reverse == initialNumber;
    }

    // suppose we use 101 as a palindrome
    // lastDigit = 101 % 10 = 1
    // reverse = 0;
    // reverse + 1 = 1;
    // number = 101/10 = 10;
    // *******************
    // lastDigit = 10 % 10 = 0;
    // reverse = 10;
    // reverse += lastDigit => 10;
    // number 10 / 10 = 1;
    // ****************************
    // lastDigit = 1 % 10 = 1;
    // reverse = 100;
    // reverse += lastDigit => 101;
    // number 1/10 =

}
