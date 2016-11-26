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
public class ConditionDemo {
    public static void main(String[] args) {
        int no1,no2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number One");
        no1=input.nextInt();
        System.out.println("Enter Number Two");
        no2=input.nextInt();
        System.out.println("greatest Number"+numberGreater(no1,no2));
        
    }
    public static int numberGreater(int no1,int no2){
        if(no1>no2){
            return no1;
        }
        else
           return no2;
    }
    
}
