package largeDataset;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Ch_12_24 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Salary.txt"); 
		
		//check if the file exists
		if(file.exists())
			System.out.println("File " + file.getName() + " already exists");
		String rank = "";
		double salary;
		
		try(
				//create output file
				PrintWriter output = new PrintWriter(file);
		){
			for (int i = 1; i <= 1000; i++) {
				output.print("FirstName" + i + " LastName" + i);
				rank = getRank();
				salary = getSalary(rank);
				output.printf(" " + rank + " %.2f", salary);
				output.println();
			}
		}
	}

	private static double getSalary(String rank) {
		Random random = new Random();
		//calculate salary for rank
		if(rank.equals("assistant"))
		{
			return random.nextInt(80000 - 50000 + 1) + 50000;
		}
		else if(rank.equals("associate"))
		{
			return random.nextInt(110000 - 60000 + 1) + 60000;
		}
		else
		{
			return random.nextInt(130000 - 75000 + 1) + 75000;
		}
	}

	private static String getRank() {
		String[] rank = {"assistant", "associate", "full"};
		return rank[(int)(Math.random()* rank.length)];
	}

}
