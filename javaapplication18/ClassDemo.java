/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.awt.Frame;

/**
 *
 * @author Regis
 */
public class ClassDemo {
    public static void main(String[] args) {
        Thread d = new Thread();
        Frame f = new Frame();
        Class c = d.getClass();
        Class m= f.getClass();
        System.out.println("Super class of frame"+m.getSuperclass());
        System.out.println("Super class of thread "+c.getSuperclass());
        
    }
    
}
