/*
 * 
 * Q15. Write a Java program to count lowercase letters.
Description:Count lowercase letters present in string.
Input:Enter string: JaVaPro
Output:Lowercase letters: 4
 */
package org.mystr;

import java.util.Scanner;

public class CountLowerCaseStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				c++;
			}
		}
		System.out.println("Number of Lowercase letters are:"+c);
	}

}
