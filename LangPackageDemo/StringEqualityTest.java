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
public class StringEqualityTest {
    public static void main(String[] args) {
 String s = new String("regis");
 String m0=new String("regis");
        System.out.println(s==m0);
 String m="regis";
 String s1="regis";
 String ss="what the hell";
 final String mm="what";
 String s8=mm + " the hell";
        System.out.println(ss==s8);
        System.out.println(s1==m);
        
    }
    
}
