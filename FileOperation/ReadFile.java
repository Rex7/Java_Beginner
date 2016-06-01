/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Regis
 */
public class ReadFile {
    public static void main(String[] args) {
        try
        {
        FileReader b = new FileReader("rex.txt");
        int s=b.read();
        while(s!=-1)
        {
            System.out.print((char)s);
            s=b.read();
        }
        
        }
        catch(FileNotFoundException  e)
        {
            System.out.println("message"+e.getMessage());
            
        }
        catch(IOException e)
        {
            System.out.println("error message"+e.getMessage());
        }
    }
    
}
