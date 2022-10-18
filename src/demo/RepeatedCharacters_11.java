package demo;

import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharacters_11 {

	public static void main(String[] args) {

		String value = "This is testing Program testing Program";
		Map<String, Long> charMap = value.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

		for (String key : charMap.keySet()) {
			Long counter = charMap.get(key);
			System.out.println(key + " : " + counter);
		}
	}

}
