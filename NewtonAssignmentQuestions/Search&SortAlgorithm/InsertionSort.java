package NewtonAssignmentQuestions;

public class InsertionSort {
    
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
   
	public static void insertionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int j =i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp) {
				 arr[j+1]=arr[j];
				 j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {9,2,8,5,7,-1,4};
		
        printArray(arr);
        
        insertionSort(arr);
        
        printArray(arr);
	}

}
