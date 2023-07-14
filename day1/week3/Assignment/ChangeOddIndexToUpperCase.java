package week3.Assignment;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

	 //Pseudo Code
	 //Declare String Input as Follow
	  String test = "changeme";
	 
	 //a) Convert the String to character array
	char[] conv= test.toCharArray();
	 
	  //b) Traverse through each character (using loop)
	for (int i = 0; i < conv.length; i++) {
		if(i%2!=0){
		
	//c)find the odd index within the loop (use mod operator)
			System.out.println("odd index:" +i);
			
	 //d)within the loop, change the character to uppercase, if the index is odd else don't change
			System.out.println(Character.toUpperCase(conv[i]));
		}
		
	
	}
	 
	 
	 
	
	  
	 
}
}
