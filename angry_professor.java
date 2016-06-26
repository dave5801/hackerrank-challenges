import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/angry-professor
public class angry_professor {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int test_cases = scan.nextInt();
		int count = 0;
		
		while(count < test_cases){
			
			int on_time_count = 0;
			
			int[]classroom = new int[2];
			for(int i = 0; i < classroom.length; i++){
				classroom[i] = scan.nextInt();
			}
			
			int student_no = classroom[0];
			int students_needed = classroom[1];
			
			int[]arrival_times = new int[student_no];
			for(int j = 0; j < arrival_times.length; j++){
				arrival_times[j] = scan.nextInt();
			}
				
			for(int k = 0; k <arrival_times.length; k++){
				if(arrival_times[k] <= 0){
					on_time_count++;
				}
			}
			
			if(on_time_count < students_needed){
				System.out.println("YES");
			}else if (on_time_count >= students_needed){
				System.out.println("NO");
			}
			
			count++;
		}
	
	}
}
