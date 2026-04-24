/*
 * Q24. Write a Java program to find duplicate characters.
Description:Print characters appearing more than once.
Input:Enter string: programming
Output:Duplicate characters: r g m
 */
package org.mystr;
import java.util.*;

public class FindDuplicates {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		 System.out.print("Duplicate characters: ");

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            int count = 0;

	         
	            for (int j = 0; j < str.length(); j++) {
	                if (str.charAt(j) == ch) {
	                    count++;
	                }
	            }

	            if (count > 1 && str.indexOf(ch) == i) {
	                System.out.print(ch + " ");
	            }
	        }

	}

}
