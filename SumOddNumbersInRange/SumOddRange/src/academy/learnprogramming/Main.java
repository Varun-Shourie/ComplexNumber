package academy.learnprogramming;

// Sums all of the odd numbers in a given range, provided by the user in the Main method. 

public class Main {

    public static void main(String[] args) {
        
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));

    }

    public static boolean isOdd(int number) {
    	
        if (number <= 0)
            return false;
        else if (number % 2 != 0)
            return true;
        else 
        	return false;
        
    }

    public static int sumOdd(int start, int end) {
        int sumOfNumbers = 0;
        
        if (start < 0 || end < 0 || end < start) 
            return -1;
        
        for (int i = start; i <= end; i++) {
            if(isOdd(i)) 
                sumOfNumbers += i;
        } 
        
        return sumOfNumbers;
    }
}

