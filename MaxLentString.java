/*
 * Q26. Write a Java program to find the longest word.
Description:Find words with maximum length.
Input:Enter string: Java is very powerful
Output: Longest word: powerful
 */
package org.mystr;
import java.util.*;
public class MaxLentString {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter string: ");
	        String str = sc.nextLine();

	        String[] words = str.split(" ");
	        String longest = "";

	        for (int i = 0; i < words.length; i++) {
	            if (words[i].length() > longest.length()) {
	                longest = words[i];
	            }
	        }

	       System.out.println("Longest word: " + longest);

	     
	    
	}

}
