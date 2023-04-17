package myStack;

import java.util.Scanner;

public class Ch_11_Ex_10 
{
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		// Create a myStack object
		MyStack stack = new MyStack();
		
		//collect data from user
		System.out.print("Enter five strings: ");
		for(int i = 0; i < 5; i++) {
			stack.push(input.next());
		}
		
		// Display in reverse order
		System.out.println("Stack: " + stack.toString());
		
		//close scanner
		input.close();
	}
}