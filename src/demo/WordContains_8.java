package demo;

public class WordContains_8 {

	public static void main(String[] args) {
		String str = "hellosdfhellooierehello";
		String find = "hello";

		/*
		 * boolean isFound = str.contains("hello"); // true
		 * 
		 * System.out.println(isFound);
		 */

		int count = 0, fromIndex = 0;

		while ((fromIndex = str.indexOf(find, fromIndex)) != -1) {
			count++;
			fromIndex++;
		}

		System.out.println("Total occurrences: " + count);

	}

}
