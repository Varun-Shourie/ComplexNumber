package academy.learnprogramming;

public class WakeUpDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay < 8) {
            return barking;
        } else if (hourOfDay == 23) {
            return barking;
        } else {
            return false;
        }
    }
}
