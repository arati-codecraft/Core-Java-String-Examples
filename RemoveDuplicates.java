/*
 * Q28. Write a Java program to remove duplicate characters.
Description:Keep only the first occurrence.
Input:Enter string: programming
Output:progamin
 */
package org.mystr;
import java.util.*;
public class RemoveDuplicates {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String str = sc.nextLine();

	        String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            
	            if (result.indexOf(ch) == -1) {
	                result = result + ch;
	            }
	        }

	        System.out.println("After removing duplicates: " + result);
	}

}
