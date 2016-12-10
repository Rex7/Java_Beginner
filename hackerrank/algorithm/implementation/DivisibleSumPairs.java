package hackerrank.algorithm.implementation;

import java.util.*;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count=0;
        int a[] = new int[n];
        for(int a_i=0; a_i < a.length; a_i++){
            a[a_i] = in.nextInt();
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
               if(i<j){
                   int val = a[i]+a[j];
                   if(val % k == 0){
                    
                       count++;
                   }
               }
            }
   
        }
        System.out.println(count);
    }
}
