/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.algorithm.warmup;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class CompareTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alice = 0, bob = 0;
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        if (a0 > b0) {
            alice++;

        } else if (b0 > a0) {
            bob++;
        }
        if (a1 == b1) {

        } else if (a1 > b1) {
            alice++;
        } else if (b1 > a1) {
            bob++;
        }
        if (a2 < b2) {
            bob++;

        } else if (a2 > b2) {
            alice++;
        }
        System.out.println(alice + " " + bob);
    }
}
