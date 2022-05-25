import java.util.Arrays;

public class SelectionSort {
	
	static void selectionSort(int arr[]) {
		
		int arrLength = arr.length;
		
		for (int x = 0; x < arrLength-1; x++) {
			
			//find min element
			int minIndex = x;
			for (int y = x+1; y < arrLength; y++) {
				if (arr[y] < arr[minIndex]) {
					minIndex = y;
				}
			}
			
			//swap min element with first in array
			int temp = arr[minIndex];
			arr[minIndex] = arr[x];
			arr[x] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
	
	static void selectionSortDescending(int arr[]) {
		
		int arrLength = arr.length;
		
		for (int x = 0; x < arrLength-1; x++) {
			
			//find max element
			int maxIndex = x;
			for (int y = x+1; y < arrLength; y++) {
				if (arr[y] > arr[maxIndex]) {
					maxIndex = y;
				}
			}
			
			//swap min element with first in array
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[x];
			arr[x] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
	

	public static void main(String[] args) {
		int array[] = {5, 7, 4, 9, 8, 5, 6, 3};
		System.out.println("Unsorted Array: " + Arrays.toString(array));
		
		selectionSort(array);
		System.out.println("Ascending Sorted Array: " + Arrays.toString(array));
		
		selectionSortDescending(array);
		System.out.println("Descending Sorted Array: " + Arrays.toString(array));
	}

}
