package demo;

public class DivisibleBy_1 {

	static void divisibleBy() {
		for (int num = 0; num < 100; num++) {
			if (num % 15 == 0)
				System.out.println(num + " foobar");
			else if (num % 3 == 0)
				System.out.println(num + " foo");
			if (num % 5 == 0)
				System.out.println(num + " bar");
		}
	}

	public static void main(String[] args) {
		divisibleBy();
	}

}
