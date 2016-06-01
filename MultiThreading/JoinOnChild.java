/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Regis
 */
class Child extends Thread
{
    
private  final Thread t;
    public Child(Thread t)
    {
   this.t=t;
    }
    @Override
    public void run()
    {
    try {
        t.join();
    } catch (InterruptedException ex) {
        Logger.getLogger(Child.class.getName()).log(Level.SEVERE, null, ex);
    }
      for(int i=0;i<10;i++)
      {
          System.out.println("Child Thread"+i);
      }
    }
}
public class JoinOnChild {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        Child c = new Child(t);
        c.start();
        for(int i=0;i<10;i++)
        {
        System.out.println("Am main Thread below is child"+i);
        Thread.sleep(2000);
        }
        
    }
    
}
