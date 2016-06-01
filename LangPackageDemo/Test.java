/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LangPackageDemo;

/**
 *
 * @author Regis
 */
import java.lang.Integer;

import java.util.TreeSet;
public class Test {
    public static void main(String[] args) {
        TreeSet <Test> m = new TreeSet <>();
        m.add(new Test());
        m.add(new Test());
        m.add(new Test());
        m.add(new Test());
        m.add(new Test());
        System.out.println("First"+m.first());
    }
    
}
