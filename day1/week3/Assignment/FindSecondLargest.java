package week3.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
				int[] data =  {3,2,11,4,6,7,2,3,3,6,7}; //2,3,4,6,7,11
			    Set<Integer> value=new HashSet<>();
				for (int i = 0; i<data.length; i++) {
					value.add(data[i]);
					}
				List<Integer>conv=new ArrayList<Integer>(value);
				//Arrays.sort(conv[]);
				System.out.println(conv);
				System.out.println(conv.get(conv.size()-2));
				
	}
}

