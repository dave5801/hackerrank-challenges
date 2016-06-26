import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/security-message-space-and-ciphertext-space
public class security_messageSpace_ciphertext {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String m = sc.nextLine();

		StringBuffer str = new StringBuffer();

		for (int i = 0; i < m.length(); i++) {
			int x = Character.getNumericValue(m.charAt(i));

			str.append(compare_numbers(x));
		}

		System.out.println(str);

	}

	public static int compare_numbers(int m) {

		int out = 0;

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			if (m == a[i]) {
				if (a[i] == a.length - 1) {
					out = a[0];
				} else {
					out = a[i + 1];
				}
			}
		}

		return out;

	}
}
