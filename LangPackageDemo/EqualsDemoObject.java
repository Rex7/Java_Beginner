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

class Student
{
    private final String name;
   private final int roll;
    public Student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj==this)
            return true;
       if(obj instanceof Student)
       {
           Student s=(Student)obj;
           if(name.equals(s.name)&&roll==s.roll)
           {
               return true;
           }
           else
               return false;
       }
       return false;
      
    }
    
}
public class EqualsDemoObject {
    public static void main(String[] args) {
        Student r = new Student("regis",22);
    Student r1=new Student("jenifer",22);
    Student r2=new Student("jenifer",222);
        System.out.println("r"+r1.equals(r2));
        System.out.println("rr"+r.equals(null));
       
    }
    
}
