/*
 * Q5. Write a Java program to count total spaces in a string.
Description:
 Accept a sentence and count number of blank spaces.
Input:
 Enter string: Java is easy
Output:
 Total spaces are: 2
 */
package org.mystr;
import java.util.*;
public class SpaceCount {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				c++;
			}
		}
		System.out.println("Number of spaces present in string are: "+c);

	}

}
