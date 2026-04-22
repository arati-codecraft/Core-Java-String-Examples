/*
 * Q17. Write a Java program to print ASCII values of characters.
Description:Print ASCII value of every character.
Input:Enter string: AB
Output:
 A = 65
 B = 66
 */
package org.mystr;
import java.util.*;
public class ASCIIvalOfCHar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		
		String str=sc.nextLine();
		
		 for (int i = 0; i < str.length(); i++) 
		 {
	            char ch = str.charAt(i);
                int ascii=ch;
                System.out.println("Ascii val of :"+ch+"="+ ascii);
	     }
		
	}

}
