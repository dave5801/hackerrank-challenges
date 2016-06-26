import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/staircase
public class staircase {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);	
		int test_cases = scan.nextInt();
		
		StringBuffer outputBuffer = new StringBuffer();
		StringBuffer spaces = new StringBuffer();
		
		for (int j = 1; j <= test_cases; j++){
			   spaces.append(" ");   
		}
		
		for (int i = 1; i <= test_cases; i++){
		   outputBuffer.append("#");
		   System.out.println(spaces.substring(0,test_cases-i) + outputBuffer);
		}
    }
}
