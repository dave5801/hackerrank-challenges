import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/plus-minus
public class pluss_minus {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    
		float positive = 0;
		float negative = 0;
		float zeroes = 0;
	    
		int[]inputs = new int[n];
		for(int i = 0; i < inputs.length; i++){
			inputs[i] = scan.nextInt();
			
			if(inputs[i] > 0){
				positive++;
			}else if(inputs[i] < 0){
				negative++;
			}else if(inputs[i] == 0){
				zeroes++;
			}
			
		}

		System.out.println(positive/n);
		System.out.println(negative/n);
		System.out.println(zeroes/n);
    }
}
