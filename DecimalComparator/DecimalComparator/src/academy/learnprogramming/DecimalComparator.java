package academy.learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
    	
        int comparisonOne = ((int) numberOne) * 1000;
        int comparisonTwo = ((int) numberTwo) * 1000;
        
        if (comparisonOne == comparisonTwo) {
            return true;
        }

        return false;

    }
}
