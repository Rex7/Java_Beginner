/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.string;

import java.util.Scanner;

/**
 *
 * @author Regis
 * There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
 */
public class StringIntroductionProgram {

    public static void main(String[] argh) {
        Scanner input = new Scanner(System.in);
        String one = input.next();
        String two = input.next();
        System.out.println(one.length() + two.length());
        int re = one.compareTo(two);
        if (re < 0 || re == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        one = one.replace(one.charAt(0), one.toUpperCase().charAt(0));
        two = two.replace(two.charAt(0), two.toUpperCase().charAt(0));

        System.out.println(one + " " + two);
    }

}
