import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/encryption
public class encryption {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		String str = scan.next();
		double length = str.length();
		
		double x = Math.sqrt(length);
		int columns = (int)Math.ceil(x);
		int rows = (int)Math.floor(x);
		int dim = columns*rows;
		
		while(dim < length){
			rows = rows +1;
			dim = columns*rows;
		}
		
			
		char[] charArray = str.toCharArray();
		StringBuilder output = new StringBuilder();
	
		for(int i = 0; i < columns; i++){
			for(int j = i; j < length; j+=columns){
				output.append(charArray[j]);
			}
			output.append(" ");
		}
		
		System.out.println(output);
    }

}
