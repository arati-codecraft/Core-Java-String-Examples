/*
 * Q19. Write a Java program to copy one string into another.
Description:Copy characters manually into another string.
Input:Enter string: Hello
Output:Copied string: Hello
 */
package org.mystr;
import java.util.*;

public class CopyString 
{

	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1:");
		String str1=sc.nextLine();
		String str2="";
		
		 for (int i = 0; i < str1.length(); i++) 
		 {   
			 str2 = str2 + str1.charAt(i);
	        }

	        
	        System.out.println("Copied string: " + str2);

		
	}

}
