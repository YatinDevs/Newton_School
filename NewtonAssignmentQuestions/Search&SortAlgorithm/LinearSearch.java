package NewtonAssignmentQuestions;

public class LinearSearch {
   
	public static int linearSearch(int arr[],int target) {
		    
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				return i ;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {9,2,8,5,6,-1,4};
       
		System.out.println(linearSearch(arr,10));
	}

}
