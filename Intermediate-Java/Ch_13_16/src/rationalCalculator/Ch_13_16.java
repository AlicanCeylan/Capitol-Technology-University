package rationalCalculator;

public class Ch_13_16 {

	public static void main(String[] args) {
		//Check commmand line for usage
		if (args.length != 1) {
			System.out.println("Usage: java Exercise_13_16 String");
			System.exit(0);
		}
		
		//create string output
		String output = args[0];
		
		//retrieve numerator and denominator
		String[] str = (args[0].replaceAll(" ", "/").split("/"));

		// Create two Rational objects
		Calculator r1 = new Calculator(Integer.parseInt(str[0]), 
			Integer.parseInt(str[1]));
		Calculator r2 = new Calculator(Integer.parseInt(str[3]),
			Integer.parseInt(str[4]));

		// Retrieve operand
		switch (str[2].charAt(0)) {
			case '+' : output += " = " + r1.add(r2);	break;
			case '-' : output += " = " + r1.subtract(r2); break;
			case '.' : output += " = " + r1.multiply(r2); break;
			case '/' : output += " = " + r1.divide(r2); break;
			default : System.out.println("Illegal Argument: + - . /"); 
						System.exit(0);
		}

		// Display results
		System.out.println(output);
	}

}
