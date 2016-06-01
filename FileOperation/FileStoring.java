/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Regis
 */
public class FileStoring {
public static void main(String...args) throws IOException
{
    try
    {
    File f = new File("C:\\Users\\Regis\\Documents\\NetBeansProjects\\JavaApplication18\\src\\ExampleOfRegularExpression\\DataHandlingExplaination");
    FileInputStream fin = new FileInputStream(f);
    BufferedReader br = new BufferedReader(new InputStreamReader(fin));
    String line=br.readLine();
    while(line!=null)
    {
        System.out.println(line);
        line=br.readLine();
    }
}
    catch(FileNotFoundException fs)
    {
        System.out.println(""+fs.getMessage());
    }
}
}
