package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if(number < 5)
            System.out.println("Invalid Value");
        else {
            for(int rows = 1; rows <= number; rows++) {
                for(int columns = 1; columns <= number; columns++) {
                    if(rows == 1 || rows == number)
                        System.out.print("*");
                    else if(rows > 1 && rows < number) {
                        if(columns == rows)
                            System.out.print("*");
                        else if(columns == 1 || columns == number)
                            System.out.print("*");
                        else if(columns == (number - rows + 1))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }
}
