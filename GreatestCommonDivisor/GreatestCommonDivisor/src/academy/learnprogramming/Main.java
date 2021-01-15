package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        else {
            int firstInstance = first;
            int secondInstance = second;
            if (first > second) {
                while (secondInstance <= second) {
                    if ((first % secondInstance != 0) || (second % secondInstance != 0)) {
                        secondInstance--;
                    } else if ((first % secondInstance == 0) && (second % secondInstance == 0)) {
                        return secondInstance;
                    }
                }
            }
            else if (second > first) {
                while (firstInstance <= first) {
                    if ((first % firstInstance != 0) || (second % firstInstance != 0)) {
                        firstInstance--;
                    } else if ((first % firstInstance == 0) && (second % firstInstance == 0)) {
                        return firstInstance;
                    }
                }
            }
            else {
                while (firstInstance <= second) {
                    if (second % firstInstance != 0) {
                        firstInstance--;
                    }
                }
            }
            return firstInstance;
        }
    }
}
