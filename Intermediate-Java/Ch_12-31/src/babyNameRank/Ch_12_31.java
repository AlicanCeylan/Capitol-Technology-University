package babyNameRank;

import java.io.*;
import java.util.*;

public class Ch_12_31 {

	public static void main(String[] args) throws FileNotFoundException {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//collect year, gender, and name
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the gender (M/F): ");
		String gender = input.nextLine().toLowerCase();
		System.out.print("Enter the name: ");
		String name = input.next();
		
		File babyNames = new File("babynameranking" + year + ".txt");
		
		if(!babyNames.exists()) {
			System.out.print("No file for " + year + " was found.");
			System.exit(1);
		}
		
		try(Scanner fileInput = new Scanner(babyNames);){
			while(fileInput.hasNext()) {
				String rank = fileInput.next();
				String mName = fileInput.next().toLowerCase();
				String mBirths = fileInput.next();
				String fName = fileInput.next().toLowerCase();
				String fBirths = fileInput.next();
				if((gender.contentEquals("m")) && mName.contentEquals(name.toLowerCase())
					||(gender.equals("f") && fName.equals(name.toLowerCase()))){
						System.out.println(name + " is ranked #" + rank + " in year " + year);
						System.exit(0);
					}
			}
			
			System.out.println("The name " + name + " is not ranked in year " + year);
		}
	}

}
