package week3.Assignment;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {
public static void main(String[] args) {
	// Declare a String array and add the Strings values as (HCL,Wipro,Aspire Systems,CTS)		
		// get the length of the array		
		// sort the array			
		// Iterate it in the reverse order
		// print the array		
		// Required Output: Wipro, HCL , CTS, Aspire Systems
	
	String[] arr = {"HCL","Wipro","Aspire Systems","CTS"};
	  int len = arr.length;
	  Arrays.sort(arr);
	  System.out.println(Arrays.toString(arr));
	  for (int i = arr.length-1; i>=0 ; i--) {
		  System.out.print(arr[i] + ",");
		
	}
	 
	

}
}
