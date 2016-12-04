/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class FileHandling {
    public static void main(String...args) throws FileNotFoundException, IOException
    {
        new FileHandling().data();
    }
    public void data() throws FileNotFoundException, IOException
    {
        File f = new File("out.txt");
       FileOutputStream l= new FileOutputStream(f);
       InputStream rs= this.getClass().getResourceAsStream("numbersfile.txt");
       DataOutputStream output=new DataOutputStream(l);
Scanner rss = new Scanner(rs);
while(rss.hasNext())
{
    System.out.println("values"+rss.next());
   // output.writeUTF(rss.next());
}
       
        
    }
    
}
