package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(50));
    }

    public static int getLargestPrime(int number) {
        int loopCount = 0;
        int largestFactor = 0;

        if(number > 1) {
            for(int factors = number; factors >= 1; factors--) {
                if(number % factors == 0) {
                    largestFactor = factors;
                    loopCount = 0;

                    for(int factorsOfFactors = largestFactor; factorsOfFactors >= 1; factorsOfFactors--) {
                        if (largestFactor % factorsOfFactors == 0)
                            loopCount++;
                    }

                    if(loopCount <= 2)
                        return largestFactor;
                }
            }

            return -1;
        }
        else
            return -1;
    }

}
