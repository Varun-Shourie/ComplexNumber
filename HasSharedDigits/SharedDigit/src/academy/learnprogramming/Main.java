package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if(numberOne < 10 || numberOne > 99) 
            return false;
        else if(numberTwo < 10 || numberTwo > 99) 
            return false;
        else {
            int lastDigit = 0;
            int firstDigit = 0;
            int lastDigitTwo = 0;
            int firstDigitTwo= 0;

            while(numberOne > 0) {
                lastDigit += numberOne % 10;
                numberOne /= 10;
                
                firstDigit += numberOne % 10;
                numberOne /= 10;
            }
            
            while(numberTwo > 0) {
                lastDigitTwo += numberTwo % 10;
                numberTwo /= 10;
                
                firstDigitTwo += numberTwo % 10;
                numberTwo /= 10;
            }
            
            if (lastDigit == firstDigitTwo || lastDigit == lastDigitTwo )
                return true;
            else
                return (firstDigit == firstDigitTwo || firstDigit == lastDigitTwo);
        }
    }
}
