/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author Regis
 */
public class SA {
    public static void main(String ...ars)
    {
        
        
        String s= "position 1 no. @ durga is This";
        String [] ss=s.split(" ");
        for(String tmp:ss)
        {
            System.out.println("word"+tmp);
        }
        int len=ss.length-1;
        for(int i=len;i>=0;i--)
        {
            System.out.println("words"+ss[i]);
        }
       
    }
    
}
