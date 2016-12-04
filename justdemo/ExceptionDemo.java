/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justdemo;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int a,b,c;
        Scanner rs = new Scanner(System.in);
        System.out.println("Enter NUmber 1");
        a=rs.nextInt();
        System.out.println("Enter NUmber 2");
        b=rs.nextInt();
        try
        {
         c=a/b;  
         System.out.println("divison:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("eception is thrown");
        }
        
        
    }
    
}
