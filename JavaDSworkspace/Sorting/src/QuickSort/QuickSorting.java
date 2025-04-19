package QuickSort;

public class QuickSorting {

	int size;
	int arr[];
	
	QuickSorting(int size){
		this.size=size;	
	}
	
	public int split(int low, int high) {
		int pivot = arr[low];
		int temp;
		int i = low;
		int j = high;
		
		do {
			while(arr[i] < pivot && i < high) {
				i++;
			}
			while(pivot < arr[j]) {
				j--;
			}
			if(i<j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}while(i<j)
		return j;
	}
	
}
