/*
 * Q9. Write a Java program to check whether a string is palindrome.
Description:
 Check whether the given string reads the same forward and backward.
Input:Enter string: madam
Output:String is Palindrome
 */
package org.mystr;
import java.util.*;
public class PalindromString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		String result="";
		for(int i=str.length()-1;i>=0;i--)
		{
			result=result+str.charAt(i);
		}
		if(str.equals(result))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}

	}

}
