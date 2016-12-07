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
public class StringCompare {

    public static void main(String[] args) {
Scanner rs = new Scanner(System.in);
        String s = rs.next();
        int k=rs.nextInt();
        String min = s.substring(0, k);
        String max = s.substring(0, k);
        
            for (int i = 0; i <= s.length()-k; i++) {
                String temp = s.substring(i, i + k);
            
               if(min.compareTo(temp)>0){
                   min=temp;
               }
               if(max.compareTo(temp)<0){
                   max=temp;
               }
               
                

            }
            
             System.out.println(min);
             System.out.println(max);
               
            

        
        
    }
}
