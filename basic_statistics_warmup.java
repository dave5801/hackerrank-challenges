import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/stat-warmup
public class basic_statistics_warmup {
	public static double mean(int[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return Math.round((sum / data.length) * 10.0) / 10.0;
	}

	public static double median(int[] data) {
		int middle = data.length / 2;
		if (data.length % 2 == 1) {
			return data[middle];
		} else {
			return (data[middle - 1] + data[middle]) / 2.0;
		}
	}

	public static int mode(int[] data) {
		int maxValue = 0, maxCount = 0;

		for (int i = 0; i < data.length; ++i) {
			int count = 0;
			for (int j = 0; j < data.length; ++j) {
				if (data[j] == data[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = data[i];
			}
		}

		return maxValue;
	}

	public static double std_dev(int[] nums) {

		double mean = mean(nums);
		double squareSum = 0;

		for (int i = 0; i < nums.length; i++) {

			squareSum += Math.pow(nums[i] - mean, 2);

		}
		double stdev = Math.sqrt((squareSum) / (nums.length));
		return (double) Math.round(stdev * 10) / 10;
	}

	public static String get_ci(int[] data) {

		double mean = mean(data);
		double stdev = std_dev(data);

		double lower = Math.round((mean - (1.96 * stdev)
				/ Math.sqrt(data.length)) * 10.0) / 10.0;
		double upper = Math.round((mean + (1.96 * stdev)
				/ Math.sqrt(data.length)) * 10.0) / 10.0;

		return lower + " " + upper;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("Enter Test cases and Data");
		int n = in.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++)
			data[i] = in.nextInt();

		Arrays.sort(data);

		System.out.println(mean(data));
		System.out.println(median(data));
		System.out.println(mode(data));
		System.out.println(std_dev(data));
		System.out.println(get_ci(data));

	}
}
