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
public class EvenOddProgram {
    public static void main(String[] args) {
        int no;
        Scanner rs = new Scanner(System.in);
        System.out.println("Enter Number :");
        no = rs.nextInt();
        if(no%2==0){
            System.out.printf("\nNumber %d is Even",no);
        }
        else
            System.out.printf("\nNumber %d is Odd",no);
    }
    
}
