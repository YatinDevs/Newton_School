package NewtonAssignmentQuestions;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int key) {
		
		int start = 0;
		int end = arr.length-1;
		 
		while(start<=end) {
			int mid = start + (end - start )/2;
			
			if(arr[mid]==key) {
				return mid;
			}
			
			if(key< arr[mid]) {
				
				end = mid-1;
			}else {
				start = mid + 1;
			}
		}
		return -1;
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = {1,2,3,4,5,6,7,8,9};
          
          System.out.println(binarySearch(arr,5));
	}

}
