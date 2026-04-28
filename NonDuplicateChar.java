/*
 * Q25. Write a Java program to find unique characters.
Description:Print characters appearing only once.
Input:Enter string: hello
Output:Unique characters: h e o
 */
package org.mystr;
import java.util.*;
public class NonDuplicateChar {

	public static void main(String[] args) 
	{
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string");
     String str=sc.nextLine();
     
     System.out.println("unique characters: ");
     for(int i=0;i<str.length();i++)
     {
    	 char ch=str.charAt(i);
    	 int c=0;
    	 for(int j=0;j<str.length();j++)
    	 {
    		 if(str.charAt(j)==ch)
    		 {
    			 c++;
    		 }
    	 }
    	 if(c==1)
    	 {
    		 System.out.println(ch);
    	 }
     }
	}

}
