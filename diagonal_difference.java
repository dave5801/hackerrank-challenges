import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to https://www.hackerrank.com/challenges/diagonal-difference
public class diagonal_difference {
	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[][] array = new int[size][size];
		for (int i = 0; i < array.length; i++) {
			  for (int j = 0; j < array[i].length; j++)
			    array[i][j] = input.nextInt();
			}
		
		int diagonal1 = 0;
		int diagonal2 = 0;
		for(int i = 0; i < array.length; i++){
			diagonal1 = diagonal1 + array[i][i];
			diagonal2 = diagonal2 + array[array.length-(1+i)][i];
		}
		
		System.out.println(Math.abs(diagonal1-diagonal2));
    }
}
