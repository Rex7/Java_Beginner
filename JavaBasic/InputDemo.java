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
public class InputDemo {
    public static void main(String[] args) {
        //fetching input using scanner;
        Scanner input = new Scanner(System.in);
        int no;
        double sal;
        String name;
        System.out.println("Employee Input");
        System.out.println("Enter Name of the person:");
        name=input.nextLine();
        System.out.println("Enter Salary:");
        sal=input.nextDouble();
        System.out.println("Enter Id:");
        no =input.nextInt();
        System.out.println("Employee Details");
        System.out.println("Name "+name+"\n Sal"+sal+"\n no"+no);
        
    }
}
