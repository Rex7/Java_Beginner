/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenricsExample;

/**
 *
 * @author Regis
 */
public class SampleStringTest {
    public static void main(String[] args) {
        String s = new String("regis");
        String s2 = new String("regis");
        String b ="regis";
        StringBuffer buffer =new StringBuffer("regis");
        System.out.println(buffer.equals(b));
     
    }
    
}
