package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(2, 1, 5));
    }

    // Determines whether if big packs of goods (weighing 5 kg) and small
    // packs of goods can be packed together (weighing 1 kg) in a combination
    // which produces x kg of goods, represented by "goal."
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int totalKilos = (5 * bigCount) + smallCount;
        int differenceTotal = totalKilos - goal;

        if(differenceTotal < 0)
            return false;
        else if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        else if(differenceTotal == 0)
            return true;
        else {
            if(bigCount > 0 && smallCount > 0) {
                while(bigCount > 0) {
                    bigCount--;

                    if(differenceTotal >= 5)
                        differenceTotal -= 5;
                    else if(differenceTotal == 0)
                        return true;
                    else if(differenceTotal < 5)
                        break;
                }

                while(smallCount > 0) {
                    smallCount--;

                    differenceTotal--;

                    if(differenceTotal == 0)
                        return true;
                }
            }
            else if(bigCount > 0) {
                while(bigCount > 0) {
                    bigCount--;

                    differenceTotal -= 5;

                    if(differenceTotal == 0)
                        return true;
                }
            }
            else if(smallCount > 0) {
                while(smallCount > 0) {
                    smallCount--;

                    differenceTotal -= 1;

                    if(differenceTotal == 0)
                        return true;
                }
            }

            return false;
        }
    }
}
