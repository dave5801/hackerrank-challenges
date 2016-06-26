import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/saveprincess
public class bot_saves_princess {
	static void displayPathtoPrincess(int n, String[] grid) {
		int m_i = 0, m_j = 0;
		int p_i = 0, p_j = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < grid[i].length(); j++) {

				if (grid[i].charAt(j) == 'm') {
					m_i = i;
					m_j = j;
				}

				if (grid[i].charAt(j) == 'p') {
					p_i = i;
					p_j = j;
				}

			}

		}

		while (m_j != p_j && m_i != p_i) {

			if (m_i > p_i) {
				System.out.println("UP");
				m_i--;
			} else if (m_i < p_i) {
				System.out.println("DOWN");
				m_i++;
			}

			if (m_j > p_j) {
				System.out.println("LEFT");
				m_j--;
			} else if (m_j < p_j) {
				System.out.println("RIGHT");
				m_j++;
			}

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = in.next();
		}

		displayPathtoPrincess(m, grid);
	}
}
