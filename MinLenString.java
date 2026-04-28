/*
 * Q27. Write a Java program to find the shortest word.
Description:Find a minimum length word.
Input:Enter string: Java is easy
Output:Shortest word: is
 */
package org.mystr;
import java.util.*;

public class MinLenString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        String words[] = str.split(" ");
        String shortest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }

        System.out.println("Shortest word: " + shortest);
    }
}
