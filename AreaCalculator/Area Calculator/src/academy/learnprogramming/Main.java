package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(area(4));
        System.out.println(area(2,2));
    }

    public static double area(double radius) {
        if(radius < 0) {
            return -1.0d;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1.0d;
        }

        return x * y;
    }
}
