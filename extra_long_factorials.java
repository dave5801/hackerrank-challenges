import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/extra-long-factorials
public class extra_long_factorials {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger test_case = scan.nextBigInteger();

		System.out.println(factorial(test_case));
	}

	public static BigInteger factorial(BigInteger x) {
		if (x.compareTo(new BigInteger("1")) == 0
				|| x.compareTo(new BigInteger("0")) == 0)
			return new BigInteger("1");
		else
			return x.multiply(factorial(x.subtract(new BigInteger("1"))));

	}
}
