/*
 * Q20. Write a Java program to compare two strings without using equals().
Description:Compare character by character.
Input:
 Enter string1: java
 Enter string2: java
Output:Strings are equal
 */
package org.mystr;
import java.util.*;

public class CompareString {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter string1: ");
       String str1 = sc.nextLine();

       System.out.print("Enter string2: ");
       String str2 = sc.nextLine();

       boolean isEqual = true;
	   
       if (str1.length() != str2.length()) 
       {
           isEqual = false;
       } 
       else {
           
           for (int i = 0; i < str1.length(); i++) {
               if (str1.charAt(i) != str2.charAt(i)) {
                   isEqual = false;
                   break;
               }
           }
       }
       if (isEqual) {
           System.out.println("Strings are equal");
       } else {
           System.out.println("Strings are not equal");
       }
	}
	

}
