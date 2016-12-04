/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JustSimpleProgram;

/**
 *
 * @author Regis
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Demo {
    public static void main(String[] args) throws IOException {
     int flag;
     for(int i=2;i<=100;i++)
     {
         flag=0;
         for(int j=2;j<i;j++)
         {
             if(i%j==0)
             {
                 flag=1;
                 break;
                 
             }
         }
             if(flag==0)
             {
                 System.out.println(i);
             }
         
     }
        
    }
    
}
