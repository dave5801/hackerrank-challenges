import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/maxsubarray
public class maximum_subarray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;

		while (count < t) {

			int l = scan.nextInt();

			int[] array = new int[l];

			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
			}

			int max = get_max(array);

			if (max < 0) {
				list.add(max);
				list.add(max);
			} else {
				list.add(max_subarray(array, l));
				list.add(sumPositive(array, l));
			}

			count++;
		}

		for (int i = 0; i < list.size(); i += 2) {
			System.out.println(list.get(i) + " " + list.get(i + 1));
		}

	}

	public static int max_subarray(int[] array, int size) {
		int max_so_far = 0;
		int max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + array[i];

			if (max_ending_here < 0) {
				max_ending_here = 0;
			}

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}

		}

		return max_so_far;
	}

	public static int sumPositive(int[] numbers, int count) {
		int total = 0;
		{
			if (count > 0) {
				int val = (numbers[count - 1] > 0) ? numbers[count - 1] : 0;
				total = val + sumPositive(numbers, count - 1);
				return total;
			} else
				return total;
		}
	}

	public static int get_max(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
