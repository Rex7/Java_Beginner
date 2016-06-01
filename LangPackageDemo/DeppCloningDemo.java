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
class Cat 
{
 int i;
    public Cat(int i )
    {
        this.i=i;
    }
}
    class Dog implements Cloneable
    {
         int j;
        Cat c;
        public Dog(Cat c ,int j)
        {
            this.c=c;
            this.j=j;
        }
    
    @Override
   protected Object clone() throws CloneNotSupportedException
   {
       Cat c1 = new Cat(c.i);
       Dog d2 = new Dog(c1,j);
       return d2;
     
   }
  
 
    }

public class DeppCloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c1 = new Cat(10);
        Dog d1 = new Dog(c1,20);
        Dog d2 = (Dog)d1.clone();
        System.out.println("Value of i"+d1.c.i+"Value of j"+d1.j);
        System.out.println("After changes");
        d2.c.i=9821;
        d2.j=1234;
       System.out.println("Value of i"+d1.c.i+"Value of j"+d1.j);
     System.out.println("Value of i"+d2.c.i+"Value of j"+d2.j);
    }
    
}
