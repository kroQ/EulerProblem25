import java.math.BigInteger;

public class Fibonacci {
	public static void main(String[] args) {
		BigInteger fib1 = new BigInteger("1");
		BigInteger fib2 = new BigInteger("1");
		long counter = 2;
		Fibonacci f = new Fibonacci();

		while (true) {
			fib2 = fib2.add(fib1);
			counter++;
			if (f.isHundredDigits(fib2)) {
				System.out.println(counter);
				break;
			}
			fib1 = fib1.add(fib2);
			counter++;
			if (f.isHundredDigits(fib1)) {
				System.out.println(counter);
				break;
			}
		}
	}

	boolean isHundredDigits(BigInteger numberToCheck) {
		String stringNumber = numberToCheck.toString();
		return stringNumber.length() == 1_000 ? true : false;
	}
}
