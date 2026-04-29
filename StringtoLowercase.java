/*
 * Q6. Write a Java program to convert string into uppercase without using inbuilt function.
Description:Accept a string and convert lowercase letters into uppercase using ASCII logic.
Input:Enter string: java
Output:Uppercase string: JAVA
 */
package org.mystr;
import java.util.*;
public class StringtoLowercase {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
	    String str=sc.nextLine();
	    
	    str.toUpperCase();
	    String result="";
	    for(int i=0;i<str.length();i++)
	    {
	    	char ch=str.charAt(i);
	    	if (ch >= 'a' && ch <= 'z')
	    	{
                ch = (char)(ch - 32); 
            }
	    	result =result+ch;
	    }
	    System.out.println("Uppercase string: " + result);
	}

}
