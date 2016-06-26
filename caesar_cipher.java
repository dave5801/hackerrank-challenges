import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/caesar-cipher-1
public class caesar_cipher {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String str = scan.next();
		int k = scan.nextInt();

		int ascii = 0;
		String ascii_rotate = "";
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < n; i++) {

			int tmp = (int) str.charAt(i);

			if ((tmp <= 122) && (tmp >= 97)) {
				ascii = tmp + k;

				while (ascii > 122) {
					ascii = ascii - 26;
				}

			} else if ((tmp <= 90) && (tmp >= 65)) {
				ascii = tmp + k;

				while (ascii > 90) {
					ascii = ascii - 26;
				}

			} else {
				ascii = tmp;
			}

			ascii_rotate = Character.toString((char) ascii);
			output.append(ascii_rotate);
		}

		String finalstring = output.toString();
		System.out.println(finalstring);
	}
}
