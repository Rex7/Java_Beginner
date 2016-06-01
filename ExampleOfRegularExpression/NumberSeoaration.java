/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

/**
 *
 * @author Regis
 */
public class NumberSeoaration {
    public static void main(String...ars)
    {
        System.out.println("");
        String s1="one two three four five sixty-five";
        String [] a=s1.split(" ");
        for(String aa:a)
        System.out.println("Array"+aa);
       for(int i=0;i<a.length;i++)
       {
           System.out.println("value"+a[i]);
       }
    }
}
