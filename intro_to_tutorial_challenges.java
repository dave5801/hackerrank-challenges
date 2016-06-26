import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/tutorial-intro
public class intro_to_tutorial_challenges {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		int v = in.nextInt();
		int t = in.nextInt();
		int[] arr = new int[t];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = in.nextInt();
		}
		
		for(int j = 0; j < arr.length; j++){
			if(v == arr[j]){
				System.out.println(j);
			}
		}
    }

}
