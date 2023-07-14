package week3.Assignment;

import java.util.Iterator;

public class Palindrome {
	
	public static void main(String[] args) {
		
		 //Pseudo Code
		 //a) Declare A String value as"madam"
		 String value="moma";
		 char[] conv= value.toCharArray();
		 
		  //b) Declare another String rev value as ""
		 String rev="" ;
	
		 // c) Iterate over the String in reverse order
		 for (int i = conv.length-1; i >=0; i--) 
		 { 
			 
         // d) Add the char into rev
                  rev=rev+conv[i];
		 }       
		 
         // e) Compare the original String with the reversed String, if it is same then print palinDrome 
         // Hint: Use .equals or .equalsIgnoreCase when you compare a String
                  if(value.equalsIgnoreCase(rev))
                  {
                	  System.out.println("It is Palindrome");
                	
                  }
		 
                  else {
                	  System.out.println("Not A Palindrome");
                  }

}
	}

