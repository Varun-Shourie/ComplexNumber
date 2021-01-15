package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	
    	// Demonstrates all four cases possible. 
        printEqual(10,10,-1);
        printEqual(10,10,10);
        printEqual(10,1,0);
        printEqual(0,0,1);
    }
    
    // Compares whether if three parameters are all equal to each other or not. 
    public static void printEqual(int parameterOne, int parameterTwo, int parameterThree) {
        if (parameterOne < 0 || parameterTwo < 0 || parameterThree < 0) 
            System.out.println("Invalid Value");
        else if(parameterOne == parameterTwo && parameterTwo == parameterThree) 
            System.out.println("All numbers are equal");
        else if(parameterOne != parameterTwo && parameterOne != parameterThree && parameterTwo != parameterThree) {
            System.out.println("All numbers are different");
        else 
            System.out.println("Neither all are equal or different");
    }
}
