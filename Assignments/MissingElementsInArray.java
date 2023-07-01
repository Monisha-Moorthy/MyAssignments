package week1.Assignments;

import java.util.Arrays;

public class MissingElementsInArray {
	public static void main(String[] args) {
		
	
	
	// Here is the input
			int[] arr = {8,5,6,10};

		      Arrays.sort(arr);  // Sort the array {5,6,8,10}
		      
			// loop through the array (start i from arr[0] till the length of the array)
		      for (int i = 0; i < arr.length-1; i++) {      // i=0  1
// check if the iterator variable is not equal to
	// the array values respectively
		    	  
				if(arr[i]+1!=arr[i+1]) {     //             arr[0]+1 1+1=2 != arr[0+1] arr[1] 2  
					// print the number                      // 
				
					System.out.println(arr[i]+1);
					//break;    // once printed break the iteration
				}
			}

				
				
					
					
					


}
	
	
}
