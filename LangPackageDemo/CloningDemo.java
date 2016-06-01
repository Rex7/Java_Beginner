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
public class CloningDemo implements Cloneable {
    int i=10;
    int j=6;
    public static void main(String[] args) throws CloneNotSupportedException {
        CloningDemo d = new CloningDemo();
        
        CloningDemo d2 = (CloningDemo) d.clone();
        d2.i=6;
        d2.j=78;
        System.out.println("Cloning D"+d.i+"j"+d.j);
        System.out.println("D2"+d2.i+"J"+d2.j);
    }
    
}
