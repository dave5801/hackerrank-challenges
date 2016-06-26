import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/cut-the-sticks
public class cut_the_sticks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test_cases = scan.nextInt();
		int[]inputs = new int[test_cases];
		for(int i = 0; i < inputs.length; i++){
			inputs[i] = scan.nextInt();
		}
		
		Arrays.sort(inputs);
		int cut = 0;
	    int cut_counts = 0;
	    int last_index = 1;
	   
	   ArrayList<Integer> outputs = new ArrayList<Integer>();
	  
	   while(last_index != 0){
   	
		     last_index = inputs[inputs.length -1];
		     cut = min(inputs);
	    	 for(int k = 0; k < inputs.length; k++){
	 	    	
	 	    	if(inputs[k]!=0){
	 	    		inputs[k]= inputs[k] - cut;
	 	    		cut_counts++;		
	 	    	}
	 	    	
	 	    }
	    	if(cut_counts != 0){
	    		 outputs.add(cut_counts);
	    	}
	    	cut_counts = 0;
	    }
	    
	   for(int i = 0; i < outputs.size(); i++){
		   System.out.println(outputs.get(i));
	   }
	
	}
	//returns smallest non zero
	//http://stackoverflow.com/questions/10369724/finding-min-but-zero
	private static int min(int[] ds) {
		int min = Integer.MAX_VALUE;
		for (int d : ds) 
		{
		    min = (d == 0) ? min : Math.min(min, d);
		}
		  return min;
		}
}
