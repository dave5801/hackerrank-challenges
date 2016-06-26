import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/botclean
public class botclean {
	static void next_move(int posr, int posc, String[] board) {

		String closest = find_nearest(posr, posc, board);

		int x = Character.getNumericValue(closest.charAt(0));
		int y = Character.getNumericValue(closest.charAt(2));

		if (posc != y || posr != x) {

			if ((posr > x)) {
				System.out.println("UP");
				posr--;
			} else if ((posr < x)) {
				System.out.println("DOWN");
				posr++;
			} else if ((x == posr) && (posc > y)) {
				System.out.println("LEFT");
				posc--;
			} else if ((x == posr) && (posc < y)) {
				System.out.println("RIGHT");
				posc++;
			}
		} else {
			System.out.println("CLEAN");
		}

	}

	public static String find_nearest(int posr, int posc, String[] board) {

		int x = 100;
		int y = 100;

		double distance = distance(posr, x, posc, y);

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[i].length(); j++) {
				if (board[i].charAt(j) == 'd') {

					double tmp_distance = distance(posr, i, posc, j);

					if (tmp_distance < distance) {

						x = i;
						y = j;
						distance = tmp_distance;

					}

				}
			}
		}

		return x + " " + y;

	}

	public static double distance(int xa, int xb, int ya, int yb) {
		return Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] pos = new int[2];
		String board[] = new String[5];
		for (int i = 0; i < 2; i++)
			pos[i] = in.nextInt();
		for (int i = 0; i < 5; i++)
			board[i] = in.next();
		next_move(pos[0], pos[1], board);
	}
}
