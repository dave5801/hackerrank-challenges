import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/library-fine
public class library_fine {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
         if(y1 < y2){
			 System.out.println(0);
		 }else{
			 if(y1 > y2){
					System.out.println(10000);
			 }else if(m1 > m2){
				 System.out.println((m1-m2)*500);
			 }else if((m1 == m2)&&(d1 > d2)){
				 System.out.println((d1-d2)*15);
			 }else{
				 System.out.println(0);
			 }
		 }
    }
}
