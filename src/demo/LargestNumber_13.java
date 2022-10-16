package demo;

public class LargestNumber_13 {

	public static void main(String[] args) {

		int arr[] = { 4, 2, 3, 6, 1 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum value:" + max);

	}

}
