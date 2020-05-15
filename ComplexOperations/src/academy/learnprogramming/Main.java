package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
       ComplexNumber complexNumber = new ComplexNumber(10,3);
       ComplexNumber complexNumber1 = new ComplexNumber(20, -2);
       complexNumber.add(complexNumber1);
       System.out.println("complexNumber.real = " + complexNumber.getReal());
       System.out.println("complexNumber.imaginary = " + complexNumber.getImaginary());
    }
}
