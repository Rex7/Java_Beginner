/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

/**
 *
 * @author Regis
 */
public class StringBufferDemo {
    /*
     StringBuffer is a mutable class 
     which is thread safe unlike string,
     onces when string created it can be modified
     */

    public static void main(String[] args) {
        // StringBuffer is present in java.lang package hence no need to import 
        StringBuffer buffer = new StringBuffer("My name is regis charles");
        StringBuffer s1 = new StringBuffer("kat");
        StringBuffer s2 = new StringBuffer("kat");
        //original data 
        System.out.println("  " + buffer);
        //appending data
        buffer.append(" and whats your name ?");

        System.out.println(buffer);
        //comparing s1 and s2 
        System.out.println(s1.equals(s2));//this will give false
        /*
         Its coz it doesnt override object class equals() 
         so it calls object class equals() which compare address of both object
         hence it gives out false
       
         */

    }

}
