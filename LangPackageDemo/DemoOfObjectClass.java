/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LangPackageDemo;

import java.lang.reflect.Method;

/**
 *
 * @author Regis
 */
public class DemoOfObjectClass {
    public static void main(String[] args) throws ClassNotFoundException {
        int i=0;
        Class c = Class.forName("java.lang.Object");
        Method [] m =c.getDeclaredMethods();
        for(Method mS:m)
          
        {  i++;
            System.out.print(i);
        
            System.out.println("Method"+mS);
        }
        
        
    }
    
}
