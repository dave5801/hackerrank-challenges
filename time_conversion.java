import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/time-conversion
public class time_conversion {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		String input_time = scan.next();
		
		String am_pm = input_time.substring(8,10);
		String hh = input_time.substring(0,2);
		String mm = input_time.substring(3,5);
		String ss = input_time.substring(6,8);
		
		int hours = Integer.parseInt(hh);
		String formatted_hours = "";
		
		if(am_pm.equals("AM")){
			
			if(hours == 12){
				hours = 0;
			}
			formatted_hours = String.format("%02d", hours);
		}else if(am_pm.equals("PM")){
			if(hours == 12){
				hours = hours + 0;
			}else{
				hours = hours + 12;
			}
			
			formatted_hours = Integer.toString(hours);
		}
		System.out.println(formatted_hours +":"+mm+":"+ss);
    }
}
