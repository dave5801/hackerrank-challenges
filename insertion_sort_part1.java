import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/insertionsort1
public class insertion_sort_part1 {
	public static void main(String[] args){ 
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        
        insertIntoSorted(arr);
    }

    public static void insertIntoSorted(int[] ar) {
        
        int v = ar[ar.length-1];
        
        for(int j = ar.length-1; j >=0; j--){
           if(j != 0){
        	   if(ar[j-1] > v){
        		   ar[j] = ar[j-1];
        	   }else if((ar[j-1] < v)&& (ar[j] > v)){
        		   ar[j] = v;
        		   System.out.println(Arrays.toString(ar).substring(1).replaceFirst("]", "").replace(", ", " "));
        		   break;
        	   }
           }else{
        	   if(ar[j] > v){
        		   ar[j] = v;
        	   }
           }
            
            System.out.println(Arrays.toString(ar).substring(1).replaceFirst("]", "").replace(", ", " "));
        }
    }
}
