package practice;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sychronized {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();

		set.add("Yow");

		Collections.synchronizedCollection(set);
	}

}
