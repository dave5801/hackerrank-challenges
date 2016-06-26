import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/find-digits
public class find_digits {
	public static void main(String[] args) {
       
       Scanner in = new Scanner(System.in); 
       
       int test = in.nextInt();
       
       List<Integer> output = new ArrayList<Integer>();
      
       int testcount = 0;
       while (testcount < test){
    	   testcount++;
    	   
           int number = in.nextInt();
           int n;
           n = number;
           int count = 0;
           
           while (n > 0) {
        	    
        	   int digit = n % 10;
        	   
        	    if(digit!=0){
        	    	
        	    	if((number%digit)==0){
    
            	    	count++;
            	    	
            	    }
        	    }
        	    	n = n / 10;	    
        	}
           
           output.add(count);
    	   
       }
       for(int i = 0; i < output.size(); i++) {
    	   System.out.println(output.get(i));
       }   
    }
}
