/*
 * Q2. Write a Java program to count total vowels in a string.
Description:Accept a string and count how many vowels (a,e,i,o,u) are present.
Input:Enter string: education
Output:Total vowels are: 5
 */
package org.mystr;
import java.util.*;
public class CountVowels {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		str.toLowerCase();
		int c=0;
		for(int i=0;i<str.length();i++)
		{   char ch = str.charAt(i);
			if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u')
			{
				c++;
			}
		}
		System.out.println("number of vowels in string are "+c);

	}

}
