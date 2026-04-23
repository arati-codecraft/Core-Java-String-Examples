/*
 * Q14. Write a Java program to count uppercase letters.
Description:Count how many uppercase letters exist in string.
Input:Enter string: JaVaPro
Output:Uppercase letters: 3
 */
package org.mystr;
import java.util.*;
public class CountUpperCaseStr {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&& ch<='Z')
			{
				c++;
			}
		}
		System.out.println("Number of uppercase letters are:"+c);

	}

}
