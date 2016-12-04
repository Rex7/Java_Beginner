/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
           int no=input.nextInt();
        int no2 = input.nextInt(); 
        
        if((no>=-2_147_483_648 && no<=2_147_483_647)&&(no2>=-2_147_483_648 && no<=2_147_483_647)){
           int ans=no/no2;
            System.out.println(ans);
           ;
        }
    }
    catch(InputMismatchException e){
        System.out.println("java.util.InputMismatchException:");
    }
    catch(Exception ex){
        System.out.println(ex);
}
    }
}
