/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Regis
 */
public class CheckString {
    public static void main(String...args)
    {
     Pattern p;
     Matcher m;
     String var="";
     Scanner rs=new Scanner(System.in);
        System.out.println("Enter your name");
        var=rs.next();
        p=Pattern.compile("[aA][a-zA-Z]*[lL]");
        m=p.matcher(var);
        System.out.println(var+"matches regex"+m.matches());
     
    }
    
    }
    

