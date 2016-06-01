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
Here Widening will be given highest priority followed by autoboxing and varargs
*/
public class AutoVsWidening {
    public static void m1(long l)
    {
        System.out.println("Widening");
    }
    public static void m1(Integer e)
    {
        System.out.println("AutoBoxingg");
    }
    public static void m1(int ... u)
    {
        System.out.println("Var args");
    }
    public static void main(String[] args) {
        int s=10;
        m1(10);//Widening 
        
    }
    
}
