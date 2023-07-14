package week3.Assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		
		int[] value= {1,3,4,5,6,7,9,10};
		Set<Integer> num=new HashSet<>();  //empty set 
		for (int i = 0; i < value.length-1; i++) 
		{
			 num.add(value[i]);

			if(value[i]+1!=value[i+1]) 
			{
			
			System.out.println(value[i]+1);
			}

		}

	}
	
}







