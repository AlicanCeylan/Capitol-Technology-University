package rationalCalculator;

public class Calculator extends Number implements Comparable<Calculator> {
	//variable declaration
	private long[] rtl = new long[2];
	
	public Calculator() {
		rtl[0] = 0;
		rtl[1] = 1;
	}
	
	//constructor with specific numerator and denominator
	public Calculator(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		rtl[0] = ((denominator > 0)? 1: -1) * numerator / gcd;
		rtl[1] = Math.abs(denominator)/ gcd;
	}
	
	//find GCD of two numbers
	private long gcd(long numerator, long denominator) {
		long n1 = Math.abs(numerator);
		long n2 = Math.abs(denominator);
		int gcd = 1;
		
		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
		
		return gcd;
	}
	
	//return numerator
	public long getNumerator() {
		return rtl[0];
	}
	
	//return denominator
	public long getDenominator() {
			return rtl[1];
	}
	
	/** Add a rational number to this rational */
	public Calculator add(Calculator secondCalc) {
		long n = rtl[0] * secondCalc.getDenominator() +
			rtl[1] * secondCalc.getNumerator();
		long d = rtl[1] * secondCalc.getDenominator();
		return new Calculator(n, d);
	}

	/** Subtract a rational number from this rational */
	public Calculator subtract(Calculator secondCalc) {
		long n = rtl[0] * secondCalc.getDenominator()
			- rtl[1] * secondCalc.getNumerator();
		long d = rtl[1] * secondCalc.getDenominator();
		return new Calculator(n, d);
	}

	/** Mulitply a rational number by this rational */
	public Calculator multiply(Calculator secondCalc) {
		long n = rtl[0] * secondCalc.getNumerator();
		long d = rtl[1] * secondCalc.getDenominator();
		return new Calculator(n, d);
	}

	/** Divide a rational number by this rational */
	public Calculator divide(Calculator secondCalc) {
		long n = rtl[0] * secondCalc.getDenominator();
		long d = rtl[1] * secondCalc.getNumerator();
		return new Calculator(n, d);
	}
	

	@Override
	public String toString() {
		if (rtl[1] == 1)
			return rtl[0] + "";
		else
			return rtl[0] + "/" + rtl[1];
	}

	@Override // Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((Calculator)(other))).getNumerator() == 0)
			return true;
		else
			return false;
	}

	@Override // Implement the abstract intValue method in Number
	public int intValue() {
		return (int)doubleValue();
	}

	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float)doubleValue();
	}

	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		return rtl[0] * 1.0 / rtl[1];
	}

	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long)doubleValue();
	}

	@Override // Implement the compareTo method in Comparable
	public int compareTo(Calculator o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}
}