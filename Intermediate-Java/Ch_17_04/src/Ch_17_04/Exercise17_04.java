package Ch_17_04;

import java.io.*;
import java.util.*;

public class Exercise17_04 {

	public static void main(String[] args) throws IOException {
		// Check java usage
		if (args.length != 2) {
			System.out.println("Usage: java Exercise_17_04 SourceFile TargetFile");
			System.exit(1);
		}

		// Create a file and check if it exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("The File " + args[0] + " does not exist.");
			System.exit(2);
		}	
		
		try (
				// Read lines of characters from text file and 
				// write each line as UTF-8 string to binary file
				Scanner input = new Scanner(file);
				DataOutputStream output = 
					new DataOutputStream(new FileOutputStream(args[1]));
			) {
				while (input.hasNext())
					output.writeUTF(input.nextLine());
			}
	}

}
