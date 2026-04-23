/*
 * Q4. Write a Java program to count total digits in a string.
Description:Accept a string containing characters and numbers and count how many digits are present.
Input:Enter string: abc123xyz45
Output:Total digits are: 5
 */
package org.mystr;
import java.util.*;

public class DigitCount {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		int c=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch >='0' && ch<='9')
			{
				c++;
			}
		}
		System.out.println("number of digits present in string are: "+c);

	}

}
