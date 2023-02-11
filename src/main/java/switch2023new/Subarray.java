package switch2023new;

public class Subarray {
	/*
	 * Returns true if the there is a subarray of arr[] with a sum equal to 'sum'
	 * otherwise returns false. Also, prints the result
	 */
	void Subarray(int arr[], int n, int targetSum) {
		// Pick a starting point
		for (int i = 0; i < n; i++) {
			int currentIterationsSummation = arr[i];

			if (currentIterationsSummation == targetSum) {
				System.out.println("Sum found at indexe " + i);
				return;
			} else {
				// Try all subarrays starting with 'i'
				for (int j = i + 1; j < n; j++) {
					currentIterationsSummation += arr[j];

					if (currentIterationsSummation == targetSum) {
						System.out.println("Sum found between indexes " + i + " and " + j);
						return;
					}
				}
			}
		}
		System.out.println("No subarray found");
		return;
	}

	public static void main(String[] args) {
		Subarray arraysum = new Subarray();
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int targetSum = 23;
		arraysum.Subarray(arr, n, targetSum);
	}
}