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
public class RuntimeClassInspectin {
    public static void main(String[] args) {
        Object i = "regis";
        Class s = i.getClass();
        System.out.println("Class Name"+s.getName());
        Method m [] = s.getDeclaredMethods();
        for(Method m1:m)
        {
            System.out.println("Method name"+m1);
        }
        
        
    }
    
}
