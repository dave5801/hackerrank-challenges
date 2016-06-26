import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/security-key-spaces
public class security_key_spaces {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String m = sc.nextLine();
		int k = sc.nextInt();

		StringBuffer str = new StringBuffer();

		for (int i = 0; i < m.length(); i++) {
			int x = Character.getNumericValue(m.charAt(i));

			str.append(compare_numbers(x, k));
		}

		System.out.println(str);

	}

	public static int compare_numbers(int m, int k) {

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int move = m + k;

		if (move > a.length - 1) {

			move = move - a.length;

		}

		return move;
	}
}
