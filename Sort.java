import java.util.*;

public class Sort{
	public static void quicksort(int[] arr, int low, int high){
		if(arr.length <= 1 || arr == null || low >= high) return;

		int middle = low + (high - low) / 2;
		int pivot = arr[middle];

		int i = low, j = high;

		while(i <= j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if(i <= j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if(low < j){
			quicksort(arr, low, j);
		}
		if(high > i){
			quicksort(arr, i, high);
		}
	}

	public static void bubblesort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 1; j < arr.length - i; j++){
				/* ascending
				if(arr[j - 1] > arr[j]){
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
				*/

				//descending
				if(arr[j - 1] > arr[j]){
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return;
	}

	public static void main(String[] args){
		int[] arr = {1, 5, 72, 8, 13, 6, 91, 4};
		//quicksort(arr, 0, arr.length - 1);
		bubblesort(arr);
		/*
		for(int i  = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		*/

		System.out.println(Arrays.toString(arr));
	}
}