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
class Demo
{
    int a;
    public Demo(int a)
            
    {
        this.a=a;
        
    }
    public Demo()
    {
        
    }
}
class Copy  implements Cloneable
{
    Demo s;
    int j;
    public Copy(Demo s,int j)
    {
        this.s=s;
        this.j=j;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
   
}
public class ShallowCloningDemo {
    public static void main(String[] args) {
        Demo s = new Demo(20);
        Copy m = new Copy(s,10);
        try
        {
        Copy d2=(Copy)m.clone();
       
        System.out.println("Before  changes");
        System.out.println("value of j......"+m.j+"value of Demo"+m.s.a);
        System.out.println("value of j......."+(d2.j=99)+"value of demo class is also changed"+(d2.s.a=9666));
         }
        catch(CloneNotSupportedException e)
        {
            System.out.println("error message"+e.getMessage());
        }
        
        
    }
    
}
