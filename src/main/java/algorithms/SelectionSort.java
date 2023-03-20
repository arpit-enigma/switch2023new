package algorithms;

/**
 * https://www.geeksforgeeks.org/selection-sort/  > Must read while revising
 * @author Arpit
 * 20-Mar-2023
 *
 */

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {15,28,4,18,35,2};
		sort(arr);
	}

	private static void sort(int[] arr) {
		int length = arr.length;
		for (int i=0;i<length;i++)
		{
			int min_idx = i;
			for (int j=i+1;j<length;j++)
			{
				if (arr[j]<arr[min_idx])
					min_idx=j;
			}
			
			//swap 
			if (min_idx!=i)     //this if check is unnecessary
			{
				int temp;
				temp=arr[i];
				arr[i]=arr[min_idx];
				arr[min_idx]=temp;
			}
		}
		for (int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	

}
