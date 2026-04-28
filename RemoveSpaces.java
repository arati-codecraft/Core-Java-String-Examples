/*
 * Q23. Write a Java program to remove all spaces.
Description:Remove spaces manually.
Input:Enter string: Java is easy
Output:Javaiseasy
 */
package org.mystr;
import java.util.*;
public class RemoveSpaces {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str =sc.nextLine();
        
        String result="";
        for(int i=0;i<str.length();i++)
        {
        	char ch=str.charAt(i);
        	if(ch!=' ')
        	{   
        		result=result+ch;
        		
        	}
        }
        System.out.println("result:"+result);
	}

}
