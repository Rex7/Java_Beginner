//This is for appending data to the existing content of the file
package FileOperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Regis
 */
public class FileDataAppending {
    public static void main(String[] args) {
        File s = new File("rex.txt");
        try
        {
        if(!s.exists())
        {
          
            FileWriter pw = new FileWriter(s);
            pw.append("Hello regis its a simple file appending demo for rex inc");
            pw.append("\n");
            pw.flush();
            
        }
        else
        {
            FileWriter fw=new FileWriter(s,true);
            
            fw.append("this is the next line of code for rex inc if you see this then success");
            fw.flush();
        }
    }
        catch(IOException e)
        {
            System.out.println("Error message"+e.getMessage());
        }
    }
}
