/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LangPackageDemo;
/**
 *
 * @author Regis
 */
import java.util.HashMap;
import java.util.Scanner;
class regis 
{
    Scanner rs = new Scanner(System.in);
    private int rollno;
    private String name;
    public void read()
    {
        System.out.println("Enter your rollno and name");
        rollno=rs.nextInt();
        name=rs.next();
        
    }
   /*
    If we dont override the toString() then calling toString method on object will print the string representation of the object
    
    */
   
    @Override
    public String toString()
    {
        return "Username"+name+"rollno"+rollno;
    }
   
}
public class LangDemo {
    public static void main(String[] args) {
        regis r = new regis();
        r.read();
        System.out.println("value"+r);
    }
    
}
