import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to https://www.hackerrank.com/challenges/a-very-big-sum
public class very_big_sum {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    
	    BigInteger[] array = new BigInteger[n];
		for(int i = 0; i < array.length; i++){
			array[i] = scan.nextBigInteger();
		}
			
		BigInteger sum = new BigInteger("0");
		for(int j = 0; j < array.length; j++){
			sum = sum.add(array[j]);
		}
		
		System.out.println(sum);
    }
}
