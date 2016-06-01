/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class Regrex {
    public static void main(String...args)
    {
 Scanner rs = new Scanner(System.in);
        System.out.println("Enter your password");
    String password=rs.nextLine();
     String email= "regischarles50@gmail.com";
     String pat="[a-zA-Z]+[0-9]+(@)?([a-zA-Z])+(\\.(com))?";
     System.out.println("email matches"+email.matches(pat));
     String pass="[0-9]*[a-zA-Z]*(@|!|#|%|^|-)?";
        System.out.println();
        System.out.println("Pass"+password.matches(pass));
        if(password.matches(pass))
        {
            System.out.println("nice password");
        }
        else
            System.out.println("use alphanumeric character");
    }
}

     
     