package academy.learnprogramming;

public class Main {

	// Constants are typed in upper case to easily identify.
    private static final String INVALID_VALUE_MESSAGE = "Invalid message"; // once final, we can't change the value.
        
    public static void main(String[] args) {
	// write your code here
        System.out.println("Amount of time is equal to: " + getDurationString(60,10));
        System.out.println("Amount of time is equal to: " + getDurationString(124));
        System.out.println("Amount of time is equal to: " + getDurationString(9));
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int minutesRemaining = minutes % 60;

            String hoursString = hours + "h ";
            if(hours < 10) {
                hoursString = "0" + hoursString;
            }
            
            String minutesString = minutesRemaining + "m ";
            if(minutes < 10) {
                minutesString = "0" + minutesString;
            }
            
            String secondsString = seconds + "s ";
            if(seconds < 10) {
                secondsString = "0" + secondsString;
            }
            
            return (hoursString + minutesString + secondsString); // or you can input " " to create spaces
        }
        else 
        	return INVALID_VALUE_MESSAGE;
    }
    public static String getDurationString(int seconds) {
    	
        if(seconds >= 0) {
            int minutes = seconds / 60;
            int secondsRemaining = seconds % 60;
            return getDurationString(minutes, secondsRemaining);
        }
        
        return INVALID_VALUE_MESSAGE;
    }
}
