package academy.learnprogramming;

public class Main {

    public static final String INVALID_VALUE = "Invalid Value";
    
    public static void main(String[] args) {
	
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(-1000000);
        
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0)
            System.out.println(INVALID_VALUE);
        else {
            double days = (minutes / 60d) / 24d;
            int years = (int) days / 365;
            int remainderOfYears = (int) days % 365;
            
            System.out.println(minutes + " min = " + years + " y and " + remainderOfYears + " d");
        } 
    }
}
