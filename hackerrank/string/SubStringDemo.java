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
public class SubStringDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String sub=S.substring(start, end);
        System.out.println(sub);
    }
    
}
