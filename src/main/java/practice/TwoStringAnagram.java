package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoStringAnagram {

	public static void main(String[] args) {

		System.out.println(removDup("helllo"));

	}

	static String removDuplicates(String input) {

		String noDup = "";

		for (Character c : input.toCharArray()) {

			if (!noDup.contains(String.valueOf(c))) {
				noDup += c;
			}

		}
		return noDup;
	}
	
	
	static String removDup(String input) {
		
		String noDup = "";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for (Character c : input.toCharArray()) {
			set.add(c);
		}
		
		for (Character c : set) {
			noDup += c;
		}
		
		
		
		return noDup;
	}

}
