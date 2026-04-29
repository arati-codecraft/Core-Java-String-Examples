/*
 * Q29. Write a Java program to sort characters of string.
Description: Sort characters in ascending order.
Input: Enter string: dcba
Output: abcd
 */
package org.mystr;
import java.util.*;
public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        
        char[] arr = str.toCharArray();

      
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

       
        String result = new String(arr);

        System.out.println("Sorted string: " + result);
	}

}
