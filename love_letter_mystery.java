import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//solution to: https://www.hackerrank.com/challenges/the-love-letter-mystery
public class love_letter_mystery {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		String input = " ";
		ArrayList<Character> in_list = new ArrayList<Character>();

		List<Integer> output = new ArrayList<Integer>();

		int i = 0;
		while (i < t) {

			input = in.next();

			for (char c : input.toCharArray()) {
				in_list.add(c);
			}
			
			
			int front, back, total = 0;
			for (int j = 0; j < in_list.size()/2; j++) {
				front = in_list.get(j);
				back = in_list.get(in_list.size()-1-j);
				total += reduce_steps(front, back);
			}
			
			output.add(total);
			i++;
			in_list.clear();
		}
		
		for (int k = 0; k < output.size(); k++) {
			System.out.println(output.get(k));
		}
	}

	public static int reduce_steps(int front, int back) {

		int first = front;
		int second = back;
		int difference, reduce, greatest = 0;

		if (first > second) {
			difference = first - second;
			reduce = first - difference;
			greatest = first;
		} else {
			difference = second - first;
			reduce = second - difference;
			greatest = second;
		}

		for (int i = 0; i < reduce; i++) {
			greatest--;

		}

		return greatest;
	}
}
