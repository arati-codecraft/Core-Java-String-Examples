/*
 * Q12. Write a Java program to find the first character of a string.
Description:Accept string and print first character.
Input:Enter string: Laptop
Output:First character is: L
 */
package org.mystr;
import java.util.*;
public class FirstCharOfStr {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		if (str.length() > 0) {
            char ch = str.charAt(0);
            System.out.println("First character is: " + ch);
        } else {
            System.out.println("String is empty");
        }
		
	}

}
