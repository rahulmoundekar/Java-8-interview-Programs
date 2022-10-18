package demo;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWords_10 {

	public static void main(String[] args) {

		String value = "This is testing Program testing Program";

		Map<String, Integer> occurrences = new HashMap<String, Integer>();

		for (String word : value.split(" ")) {
			Integer oldCount = occurrences.get(word);
			if (oldCount == null) {
				oldCount = 0;
			}
			occurrences.put(word, oldCount + 1);
		}

		for (String word : occurrences.keySet()) {
			Integer counter = occurrences.get(word);
			System.out.println(word + " : " + counter);
		}
	}

}
