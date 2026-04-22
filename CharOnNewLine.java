/*
 * Q10. Write a Java program to print each character on new line.
Description:Accept a string and display each character separately.
Input:Enter string: Java
Output:
 J
 a
 v
 a
 */
package org.mystr;
import  java.util.*;

public class CharOnNewLine {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		System.out.println("output:");
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			System.out.println(ch);
		}
	}

}
