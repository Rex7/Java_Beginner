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

/**
 *
 * @author Regis
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader r = new FileReader(new File("rex.txt"));
        BufferedReader br = new BufferedReader(r);
        String line=br.readLine();
        while(line!=null)
        {
            if(line.contains("am"))
            {
                System.out.println("babe");
            }
            System.out.println(line);
            line=br.readLine();
        }
        br.close();
    }
    
}
