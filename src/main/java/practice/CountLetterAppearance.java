package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetterAppearance {

	public static void main(String[] args) {

		String name = "Jassica";

		Map<Character, Integer> nameAsMap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < name.length(); i++) {

			char c = name.charAt(i);

			if (!nameAsMap.containsKey(c)) {
				nameAsMap.put(c, 1);
			}

			else {
				nameAsMap.put(name.charAt(i), nameAsMap.get(c) + 1);
			}

		}

		System.out.println(nameAsMap);

	}

}
