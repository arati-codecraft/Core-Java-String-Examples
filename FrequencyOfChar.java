/*
 * Q30. Write a Java program to count the frequency of each character.
Description:Print frequency of every character.
Input: Enter string: test
Output:
 t = 2
 e = 1
 s = 1
 */
package org.mystr;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // count frequency of current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // print only first occurrence
            if (str.indexOf(ch) == i) {
                System.out.println(ch + " = " + count);
            }
        }

        sc.close();
    }
}
