/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Regis
 */
class ArrayReadAndWrite
{
    int a[] ;
    public void write(int a[])
    {
        this.a=a;
    }
    public void display()
    {
        System.out.println("Array Elements");
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Element at index "+i+"value"+a[i]);
        }
    }
}
class ReadorWrite extends Thread
{
    ArrayReadAndWrite ar;
    int ab[];
    
    public ReadorWrite( ArrayReadAndWrite ar,int ab[])
    {
        this.ab=ab;
        this.ar=ar;
    }
    @Override
    public void run()
    {
      ar.write(ab);
    }
    
}
public class AccessingArray {
    public static void main(String[] args) {
         ArrayReadAndWrite s = new  ArrayReadAndWrite();
         ReadorWrite b = new ReadorWrite(s,new int [] {56,9,36,45});
         b.start();
         System.out.println("MAin thrad display");
         s.display();
         
    }
    
}
