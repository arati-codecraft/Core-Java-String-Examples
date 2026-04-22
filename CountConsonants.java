/*
 * Q3. Write a Java program to count total consonants in a string.
Description:Accept a string and count all consonants excluding vowels and spaces.
Input:Enter string: programming
Output:Total consonants are: 8
 */
package org.mystr;
import java.util.*;
public class CountConsonants {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        str.toLowerCase();
        int c=0;
        for(int i=0;i<str.length();i++)
        {   char ch=str.charAt(i);
        
        	if(ch>='a'&& ch<='z')
        	{
        		if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
        		{
        			c++;
        		}
        	}
        }
        System.out.println("total number of consonants in strings are :"+c);
	}

}
