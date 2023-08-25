package NewtonAssignmentQuestions;

public class BubbleSort {
	
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
	
	public static void bubbleSort(int arr[]) {
		

		int n=arr.length;
		boolean isSwapped;
		
		for(int i=0;i<n-1;i++) {
			
			isSwapped=false;
			
			for(int j=0;j<n-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					swap(arr, j+1, j);
				     isSwapped=true;
				}
			}
			
			if(isSwapped=false) {break;}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int arr[] = {9,2,8,5,6,-1,4};
		
        printArray(arr);
        
        bubbleSort(arr);
        
        printArray(arr);

	}

}
