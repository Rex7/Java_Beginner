/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Regis
 */
public class MergeFiles {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Regis\\Documents\\NetBeansProjects\\JavaApplication18");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("FileDmo.txt"))));
        String filenames [] = f.list();
        
        for(String temp:filenames)
        {
          File fname=new File(f,temp);
          if(fname.isFile())
          {
              BufferedReader br = new BufferedReader(new FileReader(fname));
              String line=br.readLine();
              while(line!=null)
              {
                  pw.println(line);
                  line=br.readLine();
                  
              }
              
             
          }
        }
        pw.flush();
        
    }
    
}
