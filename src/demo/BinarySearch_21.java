package demo;

public class BinarySearch_21 {
	int binarySearch(int array[], int findElement, int low, int high) {

		// Repeat until the pointers low and high meet each other
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (array[mid] == findElement)
				return mid;

			if (array[mid] < findElement)
				low = mid + 1;

			else
				high = mid - 1;
		}

		return -1;
	}

	public static void main(String args[]) {
		BinarySearch_21 ob = new BinarySearch_21();
		int array[] = { 3, 4, 5, 6, 7, 8, 9 };
		int n = array.length;
		int findElement = 4;

		int result = ob.binarySearch(array, findElement, 0, n - 1);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at index " + result);
	}

}
