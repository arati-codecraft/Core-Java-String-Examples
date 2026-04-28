/*
 * Q22. Write a Java program to remove all vowels.
Description:Remove vowels and print remaining string.
Input:Enter string: education
Output:dctn
 */
package org.mystr;
import java.util.*;

public class RemoveVowels {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
	                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
	                
	                result = result + ch;
	            }
		}
		System.out.println("string after removal of vowels:"+result);
				
	}

}
