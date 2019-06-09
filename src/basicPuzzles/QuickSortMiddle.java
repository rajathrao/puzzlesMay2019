package basicPuzzles;

public class QuickSortMiddle {
	
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	
	static int partition(int[] arr, int left, int right) {
int pivot = arr[(left + right) / 2]; // Pick a pivot point. Can be an element.
		
		while (left <= right) { // Until we've gone through the whole array
			// Find element on left that should be on right
			while (arr[left] < pivot) { 
				left++;
			}
			
			// Find element on right that should be on left
			while (arr[right] > pivot) {
				right--;
			}
			
			// Swap elements, and move left and right indices
			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left; 
		 }

	public static void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right); 
		if (left < index - 1) { // Sort left half
			quickSort(arr, left, index - 1);
		}
		if (index < right) { // Sort right half
			quickSort(arr, index, right);
		}
	}

		 void printArray(int[] arr) {
		  for (int i : arr) {
		   System.out.print(i + " ");
		  }
		 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {15,9,7,2,12};
		  // 9, 22, 14, 16, 44, 12, 19, 5, 6 
		  int a = arr.length;
		  quickSort(arr, 0, arr.length - 1);
		  QuickSortMiddle q = new QuickSortMiddle();
		  q.printArray(arr);
//		  QuickSortMiddle q = new QuickSortMiddle();
//		  q.quickSortRecr(arr, 0, a-1);
		// q.printArray(arr);
		//// int[] arr = AssortedMethods.randomArray(20, 0, 20);
			//AssortedMethods.printIntArray(arr);	
			//quickSort(arr, 0, arr.length - 1);
		//	AssortedMethods.printIntArray(arr);
		//  int p =q.partition(arr, 0, a-1);
		 //System.out.println(p);


	}

}
