/*
 * Q8. Write a Java program to reverse a string.
Description:Accept a string and print it in reverse order.
Input:Enter string: coding
Output:Reversed string: gnidoc
 */
package org.mystr;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		
		String result="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			result = result+str.charAt(i);
		}
		
		System.out.println("reversed string :"+result);
	}

}
