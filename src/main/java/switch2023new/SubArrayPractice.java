package switch2023new;

public class SubArrayPractice {

	public static void main(String[] args) {
//		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int arr[] = { 15, 1, 4, 8, 9, 5, 10, 23 };

		int targetSum = 23;
		int length = arr.length;
		checkIfSubArray(arr,length,targetSum);
	}

	static void checkIfSubArray(int[] arr, int length, int targetSum) {
		System.out.println("Arpit is having fun coding");
		System.out.println("Notice : Index starts with 0");
		for (int i=0;i<length;i++)
		{
			int currentIterationsSummation=arr[i];
			
			if (currentIterationsSummation==targetSum)
			{
				System.out.println("Target matches with an individual number in the array at index : " + i);
				return;
			}
			else
			{
				for (int j=i+1;j<length;j++)
				{
					currentIterationsSummation += arr[j];
					if (currentIterationsSummation==targetSum)
					{
						System.out.println("Target subarray found between index " + i + " and index " + j);
						return;
					}
				}
			}
		}

	}

}
