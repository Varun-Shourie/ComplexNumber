package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sumFirstAndLast = 0;
        int loopCount = 0;
        
        if (number < 0) 
            return -1;
        
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            
            loopCount++;
            
            if(loopCount == 1) 
                sumFirstAndLast += digit;
            
            if(number == 0) 
                sumFirstAndLast += digit;
        }
        
        return sumFirstAndLast;
    }
}
