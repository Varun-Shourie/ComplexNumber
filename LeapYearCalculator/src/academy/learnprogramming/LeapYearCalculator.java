package academy.learnprogramming;

public class LeapYearCalculator {

	// If the year is between 1AD and 9999AD,
    // the year divides evenly into 4,
    // and there is a remainder when divided by 100, the
    // year is a leap year.
    public static boolean isLeapYear(int year) { 
    	
        if(year >= 1 && year <= 9999) {
        	
            if((year%4==0) && (year%100!=0))
                return true;
            else 
            	return year % 400 == 0;
        }
        else 
        	return false;
    }
}
