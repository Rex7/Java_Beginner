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
public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int arr_i=0;arr_i<n;arr_i++){
            count =count+arr[arr_i];
        }
        System.out.println(count);
        
    }
}
    

