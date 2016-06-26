import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/valid-pan-format
public class valid_pan_format {

    private static boolean isValidPAN(String s) {
        String pattern = "([A-Z][A-Z][A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z])";

		boolean valid = s.matches(pattern);
		
		return valid;
    }
    
    // Template Credit goes to www.hackerrank.com/kogupta 
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                String s = br.readLine();
                System.out.println(isValidPAN(s) ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
