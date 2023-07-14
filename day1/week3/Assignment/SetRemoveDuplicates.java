package week3.Assignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRemoveDuplicates {

	public static void main(String[] args) {
//		Declare a String as "PayPal India"
//		Convert it into a character array
//		Declare a Set as charSet for Character
//		Declare a Set as dupCharSet for duplicate Character
//		=Iterate character array and add it into charSet
//		if the character is already in the charSet then, add it to the dupCharSet
//		Check the dupCharSet elements and remove those in the charSet
//		Iterate using charSet
//		Check the iterator variable isn't equals to an empty space
//		print it

		//partially completed since we got the ans but psedo code has many code 
		String input="PayPal India";
		char[] charArray = input.toCharArray();
		Set<Character> charSet=new LinkedHashSet<>();
		Set<Character> dupCharSet=new LinkedHashSet<>();
		for (int i = 0; i < charArray.length; i++) {
			 
			charSet.add(charArray[i]);	
		}
	
		System.out.println(charSet);
		
	}
}
