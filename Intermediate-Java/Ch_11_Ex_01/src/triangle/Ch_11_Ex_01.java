package triangle;

import java.util.Scanner;

public class Ch_11_Ex_01 {

	public static void main(String[] args) {
		//create scanner
		Scanner inputScanner = new Scanner(System.in);
		
		//collect data
		System.out.print("Enter the sides of the triangle: ");
		double side1 = inputScanner.nextDouble();
		double side2 = inputScanner.nextDouble();
		double side3 = inputScanner.nextDouble();
		
		System.out.print("Enter the color of the triangle: ");
		String color = inputScanner.next();
		
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = inputScanner.nextBoolean();
		
		//create triangle object with user's info
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		//display results
		System.out.println(triangle.toString());
		System.out.println("\nArea: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
		
		//close scanner
		inputScanner.close();
	}

}
