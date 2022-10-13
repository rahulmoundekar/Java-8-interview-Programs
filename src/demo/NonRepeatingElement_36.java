package demo;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement_36 {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 40, 50, 20, 10, 20, 30, 10, 30 };
		int n = arr.length;

		Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		// Traverse through map and print frequencies
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			if (entry.getValue() == 1)
				System.out.println(entry.getKey() + " ");
		}

	}

}
