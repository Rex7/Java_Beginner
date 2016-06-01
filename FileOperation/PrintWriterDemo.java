/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Regis
 */
/*
drawback of bufferedWriter there is no way to write directky other than converting it into string ;
that is titdeos
*/

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException,FileNotFoundException {
       
        PrintWriter pw = new PrintWriter(new FileWriter(new File("rex.txt"),true));
        pw.println("am fucking second line");
        pw.println('d');
        pw.println(100);
        pw.println(25.5);
        pw.println(true);
        pw.println("end of testing ");
        pw.close();
    }
}
