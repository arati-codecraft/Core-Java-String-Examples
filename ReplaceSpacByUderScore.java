/*
 * Q16. Write a Java program to replace space with underscore.
Description:Replace every space with '_' character.
Input:Enter string: Java Program
Output:Java_Program
 */
package org.mystr;
import java.util.*;
public class ReplaceSpacByUderScore {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=sc.nextLine();
		
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch==' ')
			{
				result = result + '_'; 
			}
			else
			{
				result = result + ch; 
			}
		}
		System.out.println("string after replacing spaces: "+ result);

	}

}
