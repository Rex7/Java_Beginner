/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Regis
 */
public class MegeFileDataLine {
    public static void main(String[] args) throws FileNotFoundException ,IOException{
        BufferedReader br = new BufferedReader(new FileReader(new File("hey.txt")));
        BufferedReader b2 = new BufferedReader(new FileReader(new File("demo.txt")));
        PrintWriter pw = new PrintWriter(new File("sample.txt"));
        String line = br.readLine();
        String lines=b2.readLine();
        System.out.println(line);
        System.out.println(lines);
 while((line!=null)&&(lines!=null))
   {
       pw.println(line);
       pw.println(lines);
          System.out.println(line);
        System.out.println(lines);
       line=br.readLine();
       lines=b2.readLine();
       System.out.println("after     next line");
          System.out.println(line);
        System.out.println(lines);
       
   }
   pw.flush();
   br.close();
   b2.close();
    
}
}
