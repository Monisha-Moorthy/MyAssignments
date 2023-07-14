package week3.Assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		/*
		 * Problem
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String name="babu"; // o/p--> c h l 
		char[] conv=name.toCharArray();
		Set<Character> unique=new HashSet<>();
		for (int i = 0; i < conv.length; i++) {
			
			 unique.add(conv[i]); 
		}
		System.out.println(unique);
		
		
		
		}
	
}
