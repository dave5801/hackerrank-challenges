import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/funny-string
public class funny_string {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int count = 0;
		List<String> strings = new ArrayList<String>();

		while (count < n) {
			String word = scan.next();
			count++;

			String word_format = word.replaceAll("\\s+", "").toLowerCase();
			strings.add(word_format);
		}

		isfunny(strings);

	}

	public static void isfunny(List<String> strings) {
		String funny_string = "";
		for (int j = 0; j < strings.size(); j++) {

			int funny_count = funny(strings.get(j));

			if (funny_count > 0) {
				System.out.println("Not Funny");
			} else if (funny_count == 0) {
				System.out.println("Funny");
			}
		}

	}

	public static int funny(String str) {
		int funny_count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			int tmp1 = str.charAt(i);
			int tmp2 = str.charAt(i + 1);
			int tmp3 = str.charAt(str.length() - 1 - i);
			int tmp4 = str.charAt(str.length() - 1 - i - 1);

			int r1 = Math.abs(tmp2 - tmp1);
			int r2 = Math.abs(tmp3 - tmp4);
			if (r1 != r2) {
				funny_count++;
			}

		}

		return funny_count;

	}
}
