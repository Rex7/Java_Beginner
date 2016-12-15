/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class TypeCasting {
    public static void main(String[] args) {
        //Using Scanner class for  input 
        Scanner rs = new Scanner(System.in);
        int result ;
        float a,b,c;
      
        System.out.println("Enter value for a");
        a=rs.nextFloat();
        System.out.println("Enter value for b");
        b=rs.nextFloat();
        //converting the float value into int ,narrowing explicit casting is neccessary
        result = (int) (a+b);
        System.out.println(result);
        /* int value to float  here no typecasting is required as widening happens  
        where float can accommodate int value hence implicit casting hence by compiler
        */
        c=result;
        System.out.println(c);
        
        
    }
    
}
