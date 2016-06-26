import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/saveprincess2
public class bot_saves_princess_two {
	static void nextMove(int n, int r, int c, String[] grid) {

		int p_i = 0, p_j = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < grid[i].length(); j++) {

				if (grid[i].charAt(j) == 'p') {
					p_i = i;
					p_j = j;

				}
			}

		}

		if (c != p_j || r != p_i) {

			if ((r > p_i)) {
				System.out.println("UP");
				r--;
			} else if ((r < p_i)) {
				System.out.println("DOWN");
				r++;
			} else if ((p_i == r) && (c > p_j)) {
				System.out.println("LEFT");
				c--;
			} else if ((p_i == r) && (c < p_j)) {
				System.out.println("RIGHT");
				c++;
			}
		}

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n, r, c;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();

		String grid[] = new String[n];

		for (int i = 0; i < n; i++) {
			grid[i] = in.next();
		}

		nextMove(n, r, c, grid);

	}
}
