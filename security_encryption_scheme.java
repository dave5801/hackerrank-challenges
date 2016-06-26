import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/security-encryption-scheme
public class security_encryption_scheme {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));

	}

	public static int factorial(int n) {
		int fact = 1; 
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
}
