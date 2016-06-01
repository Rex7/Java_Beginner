/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.File;


/**
 *
 * @author Regis
 */
public class FileMkdir {
    public static void main(String[] args) {
     
     File f = new File("C:\\Users\\Regis");
     int count=0;
  String [] s= f.list();
  
  for(String temp:s)
  {
     File fs = new File(f,temp);
     if(fs.isDirectory())
     {
         System.out.println(temp);
         
     }
     
      
  }
  
        System.out.println("number of files and folder"+count);
    
}
}