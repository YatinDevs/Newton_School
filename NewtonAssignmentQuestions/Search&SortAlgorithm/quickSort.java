package NewtonAssignmentQuestions;

public class quickSort {
    
	public static void printArray(int arr[]) {
		 
		System.out.print("[");

		for(int i = 0;i<arr.length;i++) {
			
			if(i<arr.length-1) {
				
			    System.out.print(arr[i]+ ",");
			}else {
				System.out.print(arr[i]);

			}
		}
		System.out.print("]");
		System.out.println("");


	}
	
	public static void swap (int arr[],int i,int j) {
		
		  int temp = arr[i];
		  arr[i] = arr[j];
		  arr[j] = temp;
	}
	public static int partition(int arr[],int low,int high) {
		int pivot = arr[high];
		int i = low;
		int j = low;
		
		// i to high     check <= pivot or >=pivot
		// low to  j-1   less than or equal to pivot
		// j to i-1       greater than or equal to pivot
		
		while(i<=high) {
			if(arr[i]<=pivot) {
				swap(arr, i, j);
				j++;
			}
			i++;
		}
		return j-1;
	}
	public static void quikSort(int arr[],int low ,int high) {
		if(low<high) {
			int p = partition(arr,low,high);
			quikSort(arr, low, p-1);
			quikSort(arr, p+1, high);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {9,2,8,5,6,-1,4};
			
	        printArray(arr);
	        
	        quikSort(arr, 0,arr.length-1);	        
	        printArray(arr);

	}

}
