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
/*
AutoBoxing followed by Widening is allowed in java but widening followed by autoboxing is not allowed
ab=autoboxing
w=widening
ab-w=> allowed;
w-ab=>Not allowed
*/
public class IntToLong {
    public static void m(Long l)
    {
        System.out.println("long");
    }
    public static void main(String[] args) {
        int p=10;
       //error m(p);
        int i=10L;
    }
    
}
