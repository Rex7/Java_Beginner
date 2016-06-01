/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

/**
 *
 * @author Regis
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegularExpressionForEamil {
    public static void main(String...args)
    {
        Pattern p;
        Matcher m;
//       Pattern p =Pattern.compile("(0|91)?[7-9][0-9]{9}");
     
//       Matcher m = p.matcher("919821572187");
//        System.out.println(m.matches());
        //output abc xyz abc sattu
//        String ss="abc xyz abc abc abc sattu";
//        String pattern="";
//        Pattern p=Pattern.compile();
//        Matcher m = p.matcher(ss);
        //regis.charles4@gmailcom
        //regis_charles89
        //
        Scanner rs  = new Scanner(System.in);
        p = Pattern.compile("[a-zA-Z_0-9]+[.|_|*]?[a-zA-Z_0-9]@[a-zA-Z]+([.][a-zA-Z]+)+");
        String ss=rs.next();
        m=p.matcher(ss);
        if(m.matches())
            System.out.println("valid"+ss);
        else
            System.out.println("not valid"+ss);
        
        
        
    }
    
}
