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
public class MergeDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("rex.txt");
        File h = new File("hey.txt");
        File  out= new File("out.txt");
        PrintWriter pout = new PrintWriter(out);
      BufferedReader br = new BufferedReader(new FileReader(f));
      String line = br.readLine();
      while(line!=null)
      {
          pout.println(line);
          line=br.readLine();
      }
    
     
   br = new BufferedReader(new FileReader(h));
      line=br.readLine();
      while(line!=null)
      {
      pout.println(line);
      line=br.readLine();
      }
      pout.flush();
      br.close();
        
        
        
        
        
    }
    
}
