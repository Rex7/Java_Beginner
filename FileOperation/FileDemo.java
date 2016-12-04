/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



/**
 *
 * @author Regis
 */
public class FileDemo {
    public static void main(String...ar) throws FileNotFoundException, IOException 
    {
        new FileDemo().file();
    
}
    public void file() throws IOException
    {
        InputStream file=this.getClass().getResourceAsStream("d.mp3");
    
       BufferedReader rs = new BufferedReader(new InputStreamReader(file));
       String temp;
       while((temp=rs.readLine())!=null)
       {
//           byte[] a = temp.getBytes();
//          temp=new String(a);
            System.out.println("Word"+temp);
    }
    }
}
