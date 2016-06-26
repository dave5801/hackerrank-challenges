import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//solution to: https://www.hackerrank.com/challenges/alternating-characters
public class alternating_characters {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String input = " ";

		List<Integer> output = new ArrayList<Integer>();

		int i = 0;
		while (i < t) {
			input = in.next();
			i++;

			List<Character> list = new ArrayList<Character>();

			for (char c : input.toCharArray()) {
				list.add(c);

			}

			int delete_count = 0;
			Iterator<Character> it = list.iterator();
			if (it.hasNext()) {
				Character previous = it.next();
				while (it.hasNext()) {
					Character current = it.next();

					if (current.equals(previous)) {
						delete_count++;
					}

					previous = current;
				}
			}
			output.add(delete_count);
		}

		for (int j = 0; j < output.size(); j++) {
			System.out.println(output.get(j));
		}

	}
}
