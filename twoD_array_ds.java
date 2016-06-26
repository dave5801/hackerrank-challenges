import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/2d-array
public class twoD_array_ds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}

		int sum = 0;
		ArrayList<Integer> final_sum = new ArrayList<Integer>();
		for (int i = 0; i <= arr.length / 2; i++) {

			for (int j = 0; j <= arr.length / 2; j++) {

				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
						+ arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];
				final_sum.add(sum);

			}// end inner loop

		}// end outer loop

		Collections.sort(final_sum);
		System.out.println(final_sum.get(final_sum.size() - 1));
	}
}
