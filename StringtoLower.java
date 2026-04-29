/*
 * Q7. Write a Java program to convert string into lowercase without using inbuilt function.
Description:Accept a string and convert uppercase letters into lowercase using logic.
Input:Enter string: HELLO
Output:Lowercase string: hello
 */
package org.mystr;
import java.util.*;


public class StringtoLower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&& ch<='Z')
			{
				ch= (char)(ch+32);
			}
			result=result+ch;
		}
		System.out.println("lowercase string:" + result);

	}

}
