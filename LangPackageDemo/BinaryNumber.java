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
public class BinaryNumber {
    public static void main(String[] args) {
        int  i=Integer.parseInt("11111",2);
        System.out.println("ho"+Integer.toBinaryString(31));
        System.out.println("i0"+i);
        Integer m=1000;
        Integer v=1000;
        Integer l=100;
        Integer s=100;
        System.out.println("s"+(l==s));
        /*
        output of the below will return true as == will only work for values between -128 to 127 as jvm caches those
        */
        /*
        method overlodading using widening and autoboxing then widening will be given first priority than autoboxing as widening is 19 years old compared to autoboxing
        
        */
        System.out.println("m.equalsv"+(m.equals(v)));
    }
    
}
