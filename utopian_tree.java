import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/utopian-tree
public class utopian_tree {
	public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in); 
	       
	    int test = in.nextInt();
	       
        int testcount = 0;
        
        List<Integer> output = new ArrayList<Integer>();
        
        while (testcount < test){
     	    testcount++;
     	   
            int number = in.nextInt();
            int num_count = 0;
            int growth = 0;
            while (num_count<= number) {
         	   
         	   if(num_count == 0){
         		   growth = 1;
         	   }else if(num_count%2 != 0){
         		   growth = growth * 2;
         	   }else if(num_count%2 == 0){
         		   growth = growth + 1;
         	   }
         	   num_count++; 
            }
            
            output.add(growth);
            
        }
        
        for(int i = 0; i < output.size(); i++) {
     	   System.out.println(output.get(i));
        }
	}
}
