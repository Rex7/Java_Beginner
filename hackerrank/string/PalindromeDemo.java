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
public class PalindromeDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        String A = sc.next();
        String d = A;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != d.charAt(A.length() - 1 - i)) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}
