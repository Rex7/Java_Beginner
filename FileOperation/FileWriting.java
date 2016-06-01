/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Regis
 */
public class FileWriting {
    public static void main(String[] args) {
        String exten;
        Scanner rs = new Scanner(System.in);
        System.out.println("enter name of the file");
        String filename=rs.nextLine();
        System.out.println("enter the file extension");
        exten=rs.next();
     filename=   filename.concat(exten);
        System.out.println("filename"+filename);
        File f = new File(filename);
        if(f.exists())
        {
            System.out.println("File already exist");
        }
        else
        {
            try
            {
           
            System.out.println("File created");
            FileWriter s = new FileWriter(f);
            s.write('r');
            s.flush();
            s.close();
         
          
            }
            catch(IOException io)
            {
                System.out.println("error message"+io.getMessage());
            }
          
           
        }
        
        
    }
    
}
