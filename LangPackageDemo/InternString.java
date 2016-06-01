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
Intern is used to obtain the coressponding String object reference using heap object reference;
*/
public class InternString {
    public static void main(String[] args) {
        String s = new String("regis");
        String s2=s.intern();
        String s3="regis";
        String m="jiss";
        String v=m.intern();
        System.out.println(m==v);
        System.out.println(s==s2);
        System.out.println(s2==s3);
    }
    
}
