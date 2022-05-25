import java.util.Arrays;
import java.util.Scanner;


// Use recursion to sort an array of integers
public class ReverseRecursion {

	
	public static void main(String[] args) {
		
		//create scanner
		Scanner scan = new Scanner(System.in);
		
		//prompt array size
		System.out.println("Enter array size");
		int arraySize = scan.nextInt();
		
		//Create array
		int array[] = new int[arraySize];
		
		//fill array
		System.out.println("Enter " + arraySize + " int values");
		for (int x = 0; x < arraySize; x++) {
			array[x] = scan.nextInt();
		}
		
		//print array
		System.out.println("Array: ");
		System.out.println(Arrays.toString(array));
		
		reverseArray(array, 0, arraySize-1);
		
		//print reversed array
		System.out.println("Reversed Array:");
		System.out.println(Arrays.toString(array));
		
		//close scanner
		scan.close();
	}
	
	
	public static void reverseArray(int arr[], int startIndex, int endIndex) {
		
		//base case
		if (startIndex >= endIndex) {
			return;
		}
		
		//reverse values at start and end
		int temp = arr[startIndex];
		arr[startIndex] = arr[endIndex];
		arr[endIndex] = temp;
		
		
		//recursive call, with swapped ends of array dropped
		reverseArray(arr, startIndex+1, endIndex-1);
		
	}
}
