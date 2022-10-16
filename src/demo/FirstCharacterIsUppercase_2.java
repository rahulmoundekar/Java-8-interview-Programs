package demo;

public class FirstCharacterIsUppercase_2 {

	static boolean IsUpperFirstChar(String str) {
		return Character.isUpperCase(str.charAt(0));
	}

	public static void main(String[] args) {
		System.out.println(IsUpperFirstChar("Rahul"));
		System.out.println(IsUpperFirstChar("mahesh"));
		System.out.println(IsUpperFirstChar("Niraj"));

	}

}
