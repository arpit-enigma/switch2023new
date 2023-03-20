package algorithms;

/**
 * Run a nested for loop to traverse the input array using two variables i and
 * j, such that 0 <= i < n-1 and 0 <= j < n-i-1 If arr[j] is greater than arr[j+1]
 * then swap these adjacent elements, else move on 
 * 
 * The algorithm needs one whole
 * pass without any swap to know it is sorted.

 * 
 * @author Arpit
 *
 */

public class Bubblesort {
	public static void main(String[] args) {
		int[] arr = { 15, 28, 4, 18, 35, 2 };
		int n = arr.length;

		boolean swap = true;

		while (swap) {
			swap = false;

			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swap = true;
				}
			}
		}

		// printing sorted array
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
