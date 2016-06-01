/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.ArrayList;

/**
 *
 * @author Regis
 */
public class unique {
    public static void main(String ...args) 
    {
        
        String s="regiscgax";
        ArrayList<Integer> al=new ArrayList<>();
       
        for(char ss :s.toCharArray())
        {
            System.out.println("first "+s.indexOf(ss) +"last index"+s.lastIndexOf(ss));
            if(s.indexOf(ss)==s.lastIndexOf(ss))
                System.out.println("char is  unique"+ss);
            else
                System.out.println(" not unique"+ss);
            
        }
    }
    
}
