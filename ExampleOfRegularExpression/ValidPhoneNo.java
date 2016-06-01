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
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class ValidPhoneNo {
    public static void main(String...ar)
    {
        Pattern p;
        Matcher m;
        Scanner rs = new Scanner(System.in);
        System.out.println("enter your phone no");
        String name=rs.next();
        p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
//         p = Pattern.compile("[a-zA-Z_0-9]+[.|_|*|-]?[a-zA-Z_0-9]+@[a-zA-Z]+([.][a-zA-Z]+)+");
        m=p.matcher(name);
    
        if(m.find()&&m.group().equals(name))
            System.out.println("valid no"+name);
      
        else
            System.out.println("invalid no");
    
        System.out.println("no"+name);}
    
}
