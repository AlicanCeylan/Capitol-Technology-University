package complexNumbers;

import java.util.Scanner;

public class Ch_13_17 {

	public static void main(String[] args) {
		// Prompt the user to enter two complex numbers
		System.out.print("Enter the first complex number: ");
		Complex complexNumber1 = getComplex();
		System.out.print("Enter the second complex number: ");
		Complex complexNumber2 = getComplex();

		// displays the result of their addition, subtraction, 
		// multiplication, division, and absolute value
		System.out.print(complexNumber1 + " + " + complexNumber2 + " = ");
		print(complexNumber1.add(complexNumber2));

		System.out.print(complexNumber1 + " - " + complexNumber2 + " = "); 
		print(complexNumber1.subtract(complexNumber2));

		System.out.print(complexNumber1 + " * " + complexNumber2 + " = "); 
		print(complexNumber1.multiply(complexNumber2));

		System.out.print(complexNumber1 + " / " + complexNumber2 + " = "); 
		print(complexNumber1.divide(complexNumber2));

		System.out.println("|" + complexNumber1 + "| = " + 
			complexNumber1.abs());
	}

	private static void print(Complex num) {
		if (num.getImaginaryPart() == 0)
			System.out.println(num.getRealPart());
		else
			System.out.println(num.getRealPart() + " + " + 
			num.getImaginaryPart() + "i");
		
	}

	private static Complex getComplex() {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		double[] c = new double[2];
		for (int i = 0; i < c.length; i++)
		 	c[i] = input.nextDouble(); 
		return new Complex(c[0], c[1]); 
	}

}
