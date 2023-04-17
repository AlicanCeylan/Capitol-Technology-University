package ch_17_01;

import java.io.*;
import java.util.*;

public class Ch_17_01 {
	
	public static void main(String[] args) throws FileNotFoundException {
		// Create an array list of string
		ArrayList<String> numbers = new ArrayList<>();

		// Check if file exist
		File file = new File("Exercise17_01.txt");
		if (file.exists()) {
			try (
				// Create input file
				Scanner input = new Scanner(file);
			) {// Read data from file
				while (input.hasNext()) {
					numbers.add(input.nextLine());
				}
			}
		}
		
		// Generate 100 integers randomly
		for (int i = 0; i < 100; i++) {
			numbers.add(((int)(Math.random() * 100)) + " ");
		}

		try (// Create output file
			PrintWriter output = new PrintWriter(file);
		) {
			// write to file using text I/O
			for (String l: numbers) {
				output.print(l);
			}
		}
	}
}
