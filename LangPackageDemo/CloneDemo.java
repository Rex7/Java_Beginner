/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LangPackageDemo;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
class StudentDemo implements Cloneable
{
    Scanner rs = new Scanner(System.in);
    private String s_name;
    private int roll;
    public void read()
    {
        System.out.println("Enter yor name and number");
        s_name=rs.next();
        roll=rs.nextInt();
        
    }
    public void show()
    {
        System.out.println("Name of the Student"+s_name+"Rollno"+roll);
        
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
}
public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        StudentDemo d = new StudentDemo();
        d.read();
        d.show();
        StudentDemo s1=(StudentDemo) d.clone();
        s1.show();
      
        
    }
}
