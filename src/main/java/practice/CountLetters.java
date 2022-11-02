package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetters {

	public static void main(String[] args) {

		String input = "Striiing";

		System.out.println(countLetters(input));

	}

	static Map<Character, Integer> countLetters(String input) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		return map;
	}

}
