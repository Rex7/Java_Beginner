/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Regis
 */
public class CheckDataAndTransferFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File first = new File("first.txt");
        File second = new File("second.txt");
        File third = new File("third.txt");
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(third)));
        BufferedReader br = new BufferedReader(new FileReader(first));
        String line=br.readLine();
        while(line!=null)
        {
           BufferedReader bs=new BufferedReader(new FileReader(second));
           String sec=bs.readLine();
            System.out.println("line"+line);
            
           while(sec!=null)
           {
               System.out.println("sec"+sec);
               
               if(sec.equals(line))
               {
                   
                  
                   pw.println(line);
                   pw.flush();
                   
               }
               sec=bs.readLine();
               
           }
          
           line=br.readLine();
        }
        
    }
    
}
