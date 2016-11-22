import java.util.Arrays;

public class Search{
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

	public static int binarySearch(int[] arr, int find){
		int low = 0;
		int high = arr.length - 1;
		int mid;

		while(low <= high){
			mid = (low + high) / 2;
			if(find > arr[mid]){
				low = mid + 1;
			}else if(find < arr[mid]){
				high = mid - 1;
			}else{
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		int[] arr = {1, 7, 4, 0, 72, 18, 32, 88, 9, 16, 22};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 69));
	}
}