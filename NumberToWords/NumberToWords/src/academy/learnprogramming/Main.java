package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if(number < 0)
            System.out.println("Invalid Value");
        else {
            int reverseNumber = reverse(number); // 421 --> 124 so give java 124 and it'll process as 421.

            int digitDifference = 0;

            if(getDigitCount(reverseNumber) < getDigitCount(number))
                digitDifference += (getDigitCount(number) - getDigitCount(reverseNumber));

            while(reverseNumber > 0) {
                int digit = reverseNumber % 10;

                switch(digit) {
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }

                reverseNumber /= 10;
            }

            while(digitDifference > 0) {
                System.out.println("zero");
                digitDifference--;
            }
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        int calculationNumber = number;

        if(calculationNumber < 0)
            calculationNumber *= -1;

        while(calculationNumber > 0) {
           int lastDigit = calculationNumber % 10;

           reverseNumber *= 10;
           reverseNumber += lastDigit;

           calculationNumber /= 10;
        }

        if(number < 0)
            return reverseNumber * -1;
        else
            return reverseNumber;

    }

    public static int getDigitCount(int number) {
        int digitCount = 0;

        if(number < 0)
            return -1;
        else if(number == 0)
            return 1;

        else {
            while(number > 0) {
                int digit = number % 10;

                digitCount++;
                number /= 10;
            }

            return digitCount;
        }
    }
}
