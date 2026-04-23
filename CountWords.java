/*
 * Q18. Write a Java program to count words in a string.
Description:Count the number of words separated by spaces.
Input:Enter string: Java is powerful
Output:Total words: 3
 */
package org.mystr;
import java.util.*;
public class CountWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
	    int count = 0;
		if (str.length() > 0) {
            count = 1;
            
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++; 
                }
            }
        }

       
        System.out.println("Total words: " + count);

	}

}
