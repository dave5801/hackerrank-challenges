import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

//solution to: https://www.hackerrank.com/challenges/maximizing-xor
public class maximizing_xor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int res;
		int _l;
		// System.out.printf("Enter L Value:  ");
		_l = Integer.parseInt(in.nextLine());

		int _r;
		// System.out.printf("Enter R Value:  ");
		_r = Integer.parseInt(in.nextLine());

		res = maxXor(_l, _r);
		System.out.println(res);

	}

	static int maxXor(int l, int r) {

		int limit1, limit2;
		int _l = l;
		int _r = r;
		limit1 = _l;
		limit2 = _r;

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> xor_values = new ArrayList<Integer>();

		while ((_l <= limit2) && (_r >= limit1)) {

			list1.add(_l);
			list2.add(_r);

			_l++;
			_r--;

		}

		for (int i = 0; i <= list1.size() - 1; i++) {

			for (int j = 0; j <= list2.size() - 1; j++) {

				int xor = list1.get(i) ^ list2.get(j);

				xor_values.add(xor);
			}

		}

		Collections.sort(xor_values); // Sort the arraylist
		int output = xor_values.get(xor_values.size() - 1); // gets the last
															// item, largest for
															// an ascending sort

		return output;
	}
}
