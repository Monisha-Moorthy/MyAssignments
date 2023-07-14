package week3.day2;

import java.util.Iterator;

public class StringMethodReverseString {
	public static void main(String[] args) {
		
		/*Reverse the String
		==================
		String  input=“TestLeaf";
	*Hint  Use  system.out.print() */
		String input="TestLeaf";  //input
	   char[] ch=input.toCharArray(); //a)Convert the String to character array (use toCharArray)
	  for (int i = ch.length-1; i >=0; i--) {  //b)Use for loop to iterate through each character (from end to go to the first)
		System.out.print(ch[i]);       //Goal: To understand the String,loop //c)Print the Characters continuously
		
	}
		
		
	}

}
