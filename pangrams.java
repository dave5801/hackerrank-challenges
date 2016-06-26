import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/pangrams
public class pangrams {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		String word_format = word.toLowerCase();

		int count = 0; // go to 26

		for (int i = 97; i <= 122; i++) {

			String tmp = Character.toString((char) i);

			if (word_format.contains(tmp)) {
				count++;
			}
		}

		if (count >= 26) {
			System.out.println("pangram");
		} else if (count < 26) {
			System.out.println("not pangram");
		}
	}
}
