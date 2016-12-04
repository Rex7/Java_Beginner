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
 */
public class StringFormatting {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%d", s1, x);
            System.out.println();
        }
        System.out.println("================================");

    }

}
