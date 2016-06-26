import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/lonely-integer
public class lonely_integer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		int a = 0;

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			a = a ^ n;
		}
		System.out.println(a);

	}
}
