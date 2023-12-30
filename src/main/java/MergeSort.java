package arpit;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[1000000000];
		//100000 | Time taken : 0
		//1000000 (one million) | Time taken : 0
		//10000000 (One crore) | Time taken : 2
		//10,00,00,000 (Ten Crores or 100 million) | Time taken : 24
		//1000000000 (Hundred Crores or 1 billion)| Time taken : java.lang.OutOfMemoryError: Java heap space
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]= rand.nextInt(1000000000);			
		}
		
		String beforeTime = getTime();

		System.out.println("Before : " + beforeTime);
//		printArray(numbers);
		
		mergeSort(numbers);
		
		String rightTime = getTime();
		System.out.println("After : " + rightTime);
		System.out.println("Time taken : " + (Time.parse(rightTime)-Time.parse(beforeTime))/1000);

//		printArray(numbers);		
	}

	private static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;

		// base case reached
		if (inputLength < 2) {
			return;
		}
		// get mid point
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];

		// populate left array
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}

		// populate right array
		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}

		// recursively call mergeSort on left and right
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		//merge them
		merge(inputArray, leftHalf, rightHalf);

	}

	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		//i for left, j for right, k for merged array
		int i = 0, j = 0, k = 0;
		
		while(i < leftSize && j < rightSize)
		{
			if (leftHalf[i] <= rightHalf[j])
			{
				inputArray[k] = leftHalf[i];
				i++;
			}
			else
			{
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		while (i < leftSize)
		{
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		while (j < rightSize)
		{
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
		
		
	}

	private static void printArray(int[] numbers) {
		for (int i : numbers) {
			System.out.println(i);
		}
	}
	
	private static String getTime()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now(); 
		   String time = dtf.format(now);
		return time;  
	}
}
