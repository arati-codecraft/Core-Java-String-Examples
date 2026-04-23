/*
 * Q11. Write a Java program to count special characters.
Description:Count characters which are not alphabets and digits.
Input:Enter string: java@123#
Output:Special characters are: 2
 */
package org.mystr;
import java.util.*;
public class CountSpecialChar {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String str=sc.nextLine();
	  
	  int c=0;
	  
	  for(int i=0;i<str.length();i++)
	  {
		 char ch=str.charAt(i);
		 if(!(ch>='a'&& ch<'z'||ch>='A'&&ch>='Z'||ch>='0'&&ch<='9'))
		 {
			c++; 
		 }
	  }
	  System.out.println("Number of special character are: "+c);
	  

	}

}
