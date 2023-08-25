package NewtonAssignmentQuestions;

public class SelectionSort {
    
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
	
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
		   swap(arr, i, min);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {9,2,8,5,6,-1,4};
		
        printArray(arr);
        
        selectionSort(arr);
        
        printArray(arr);

	}

}
