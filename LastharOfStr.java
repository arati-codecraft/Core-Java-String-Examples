/*Q13. Write a Java program to find the last character of a string.
Description:Accept string and print last character.
Input:Enter string: Laptop
Output:Last character is: p
*/

package org.mystr;
import java.util.*;
public class LastharOfStr {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		if (str.length() > 0) {
            char ch = str.charAt(str.length()-1);
            System.out.println("Last character is: " + ch);
        } else {
            System.out.println("String is empty");
        }
	}

}
