package ch_13_1;

import java.util.Scanner;

public class Ch_13_1 {

	public static void main(String[] args) {
		// Create a Scanner
				Scanner input = new Scanner(System.in);

				System.out.print("Enter three sides of the triangle: ");
				double side1 = input.nextDouble();
				double side2 = input.nextDouble();
				double side3 = input.nextDouble();
				
				System.out.print("Enter a color: ");
				String color = input.next();

				System.out.print("Is the triangle filled (true / false)? ");
				boolean filled = input.nextBoolean();
				
				//create a Triangle object
				Triangle triangle = new Triangle(side1, side2, side3, color, filled);
				
				//display results
				System.out.print(triangle);

	}

}
