import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/botcleanr
public class botclean_stochastic {
	static void nextMove(int posr, int posc, String[] board) {

		int x = 0, y = 0;

		for (int i = 0; i < board.length; i++) {
			// System.out.println(board[i]);
			for (int j = 0; j < board[i].length(); j++) {
				if (board[i].charAt(j) == 'd') {
					x = i;
					y = j;

				}
			}
		}

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

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] pos = new int[2];
		String board[] = new String[5];
		// System.out.println("Enter position and board:");
		for (int i = 0; i < 2; i++)
			pos[i] = in.nextInt();
		for (int i = 0; i < 5; i++)
			board[i] = in.next();
		nextMove(pos[0], pos[1], board);
	}
}
