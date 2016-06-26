import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to https://www.hackerrank.com/challenges/simple-array-sum
public class simple_array_sum {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];

	    for(int i=0;i<n;i++){//for reading array
	        arr[i]=s.nextInt();
	    }

	    int sum = 0;
	    for(int i = 0; i < arr.length; i++){ //for printing array
   
	        sum += arr[i];

	    }

	    System.out.println(sum);
    }
}
