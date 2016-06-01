/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Regis
 */
public class Numbers {
    public static void main(String...args) throws IOException
    {
        new Numbers().data();
    }
 public void data() throws IOException
 {
     int chasr;
     OutputStream output;
     InputStream out=this.getClass().getResourceAsStream("out");
        InputStream rs=this.getClass().getResourceAsStream("numbersfile.txt");
//        BufferedReader br = new BufferedReader(new InputStreamReader(rs));
            Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
    //    Matcher m =p.matcher()
//        OutputStream out;
//       while((chasr=br.read())!=-1)
//       {
//           System.out.println("value"+(char)chasr);
//       }
    
}
}