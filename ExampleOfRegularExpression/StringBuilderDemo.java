/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

import java.util.Calendar;

/**
 *
 * @author Regis
 */
public class StringBuilderDemo {
    public static void main(String...args)
    {
     String arr [] ={"1","2","3"};
     StringBuilder bf= new StringBuilder();
        int len = arr.length-1;
        System.out.println("len"+len);
   for(int i=0;i<arr.length;i++)
   {
       if(len==i)
       {
           bf.append(arr[i]);
           
       }
       else
           bf.append(arr[i]).append(",");
    
   }
       String s=bf.toString();
        System.out.println("s"+s); 
    }
    
}
