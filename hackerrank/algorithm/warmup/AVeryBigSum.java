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
public class AVeryBigSum {
    public static void main(String []argh){
        long sum=0;     
        Scanner rs =new Scanner(System.in);
        int no=rs.nextInt();
         int[] array=new int[no];
        for(int i=0;i<no;i++){
            int temp=rs.nextInt();
            array[i]=temp;
        }
        for(int i=0;i<no;i++){
            
            sum=sum+array[i];
        }
        System.out.println(sum);
        
    }
}

