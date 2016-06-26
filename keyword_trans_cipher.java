import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//solution to: https://www.hackerrank.com/challenges/keyword-transposition-cipher
public class keyword_trans_cipher {
	public static void main(String[] args) throws IOException {
		ArrayList<String> output = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = Integer.parseInt(br.readLine()); t > 0; --t) {

			String input = br.readLine();
			String encrypted = br.readLine();

			String keyword = remove_duplicates(input);
			String alphabet = get_alphabet(keyword);
			String[] rows = splitStringEvery(alphabet, keyword.length());
			Hashtable<Character, String> grid = get_table(keyword, rows);
			String translated = translate(grid, encrypted);

			output.add(translated);

		}

		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}

	}

	public static String translate(Hashtable<Character, String> grid,
			String encrypted) {

		Hashtable<Character, Character> dictionary = new Hashtable<Character, Character>();
		char replacement = ' ';
		StringBuilder translated = new StringBuilder();
		StringBuilder rearrange = new StringBuilder();
		String alphabet = (get_alphabet(""));

		List<Character> tmp = Collections.list(grid.keys());
		Collections.sort(tmp);
		Iterator<Character> it = tmp.iterator();
		char key_value = ' ';
		while (it.hasNext()) {
			key_value = it.next();
			rearrange.append(key_value + grid.get(key_value));

		}

		for (int j = 0; j < rearrange.length(); j++) {
			dictionary.put(rearrange.charAt(j), alphabet.charAt(j));
		}

		for (int j = 0; j < encrypted.length(); j++) {

			if (encrypted.charAt(j) != ' ') {
				replacement = dictionary.get(encrypted.charAt(j));
				translated.append(replacement);
			} else {
				translated.append(' ');
			}

		}

		return translated.toString();

	}

	// create hashtable with each letter from keyword as key and the alphabet as
	// values
	public static Hashtable<Character, String> get_table(String keyword,
			String[] rows) {

		Hashtable<Character, String> grid = new Hashtable<Character, String>();
		StringBuilder change_alphabet = new StringBuilder();
		StringBuilder keylist = new StringBuilder();

		for (int i = 0; i < keyword.length(); i++) {

			keylist.append(keyword.charAt(i));
			change_alphabet.append(" ");
			for (int j = 0; j < rows.length; j++) {

				if (rows[j].length() > i) {
					change_alphabet.append(rows[j].charAt(i));
				}

			}

		}

		String keys = keylist.toString();
		String[] new_rows = change_alphabet.toString().split("\\s+");

		for (int k = 0; k < keys.length(); k++) {
			grid.put(keys.charAt(k), new_rows[k + 1]);
		}

		return grid;

	}

	public static String[] splitStringEvery(String s, int interval) {
		int arrayLength = (int) Math.ceil(((s.length() / (double) interval)));
		String[] result = new String[arrayLength];

		int j = 0;
		int lastIndex = result.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			result[i] = s.substring(j, j + interval);
			j += interval;
		} // Add the last bit
		result[lastIndex] = s.substring(j);

		return result;
	}

	public static String get_alphabet(String keyword) {
		StringBuilder complete_alphabet = new StringBuilder();
		StringBuilder key_and_alphabet = new StringBuilder();

		for (int i = 65; i < 91; i++) {
			complete_alphabet.append((char) i);
		}

		key_and_alphabet.append(keyword);
		key_and_alphabet.append(complete_alphabet);

		StringBuffer modify_alpha = new StringBuffer(
				remove_duplicates(key_and_alphabet.toString()));
		modify_alpha.replace(0, keyword.length(), "");

		return modify_alpha.toString();
	}

	public static String remove_duplicates(String input) {

		char[] chars = input.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}

		StringBuilder key = new StringBuilder();
		for (Character character : charSet) {
			key.append(character);
		}

		return key.toString();
	}
}
