/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenricsExample;

/**
 *
 * @author Regis
 */
class GenDemo <T>
{
   T reg;
   public GenDemo(T r)
   {
       this.reg=r;
       
   }
   public void display()
   {
       System.out.println("type of object is"+reg.getClass().getName());
       System.out.println("value"+reg);
   }
  
}
public class GenricsDemo {
    public static void main(String ...args)
    {
        GenDemo<String> m = new GenDemo<>("regis");
        m.display();
        GenDemo<Double> m1 = new GenDemo<>(9.5);
        m.display();
        GenDemo<String> m2 = new GenDemo<>("regis");
        m.display();
    }
    
}
