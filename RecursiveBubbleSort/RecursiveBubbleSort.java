import java.util.Arrays;

public class RecusionBubbleSort {
	static void bubbleSort(int arr[], int n)
    {
        // Base case
        if (n == 1) return;
      
        //find largest element, set as end
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                //swap logic
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
      
        //recursion for array minus sorted end
        bubbleSort(arr, n-1);
    }
     
    public static void main(String[] args)
    {
        int arr[] = {52, 84, 11, 64, 99, 8, 1};
        
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(arr));
      
        bubbleSort(arr, arr.length);
         
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }
}
