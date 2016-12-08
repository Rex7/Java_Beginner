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
public class StringClassDemo {
    public static void main(String[] args) {
        /*
        String is immutable class so once created it cant be modified
        */
        String s = "Regis";
        String m ="kat";
        //String equality test by  using string equals methods
        System.out.println(s.equals(m));//it will return false;
        String new_str="regis";
        System.out.println(s.equals(new_str));//it will return false as its case sensitive
        System.out.println("case insensitive match between Regis and regis");
        System.out.println(s.equalsIgnoreCase(new_str));//it will return true as it ignores case
        //printing char in string
        for(int i=0;i<s.length();i++){
            System.out.println("char at index "+i +"= "+s.charAt(i));
        }
    }
    
}
