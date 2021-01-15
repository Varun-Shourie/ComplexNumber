package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFactors(32);
    }

    public static void printFactors(int number) {
        if(number < 1)
            System.out.println("Invalid value");
        else {
            for(int a = 1; a <= number; a++) {
                if(number % a == 0)
                    System.out.println(a);
            }
        }
    }
    
}
