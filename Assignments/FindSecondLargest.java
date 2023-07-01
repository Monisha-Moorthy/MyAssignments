package week1.Assignments;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] arg) {
		// Here is the input
				int[] data = {3,2,11,4,6,7};
			
				// 1) Arrange the array in ascending order
				 Arrays.sort(data);  //{2,3,4,6,7,11}
				 
				// 2) Pick the 2nd element from the last and print it
					System.out.println(data[data.length-2]);  //checking the values inside the array
					//break;
				//}
				
	
}
}