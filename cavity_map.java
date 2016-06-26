import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/cavity-map
public class cavity_map {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String numStr = "";
		BigInteger input;
		char array[][] = new char[n][n];

		for (int i = 0; i < n; i++) {

			input = scan.nextBigInteger();

			numStr = input.toString();

			for (int j = 0; j < numStr.length(); j++) {
				char temp = numStr.charAt(j);
				array[i][j] = temp;
			}

		}

		for (int k = 1; k < n - 1; k++)

			for (int l = 1; l < n - 1; l++) {

				if (array[l][k] > array[l][k + 1]
						&& array[l][k] > array[l][k - 1]
						&& array[l][k] > array[l + 1][k]
						&& array[l][k] > array[l - 1][k]) {

					array[l][k] = 'X';

				}
			}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);

			}
			System.out.println();
		}
	}
}
