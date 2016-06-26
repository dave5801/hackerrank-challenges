import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//solution to: https://www.hackerrank.com/challenges/flipping-bits
public class flipping_bits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//System.out.printf("Enter T Value:  ");
		int t = in.nextInt();
		
		List<BigInteger> output = new ArrayList<BigInteger>();
		int i = 0;
		while(i < t){
			//System.out.printf("Enter N Value:  ");
			 BigInteger n = in.nextBigInteger();
			 
			 
			    String binary = n.toString(2);
				int zeroes = 32 - binary.length();	
				
				String buffer = "";
				
				for(int k = 0; k < zeroes; k++){
					buffer += "0";
				}
				
				String new_binary = "";
				
				String bits = buffer + binary;
								
				for(int j = 0; j < bits.length(); j++){
					if(bits.charAt(j)=='1'){
						new_binary += '0';
					}else
						new_binary +='1';
				}
				
				
				BigInteger flip = new BigInteger(new_binary, 2);
				
				output.add(flip);
			 
			
			 i++;
			
		}
		
		for(int j = 0; j < output.size(); j++){
			System.out.println(output.get(j));
		}

	}
}
