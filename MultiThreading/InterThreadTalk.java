/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Regis
 */
class ThreadName extends Thread
{
    private String name;
   private  Scanner rs = new Scanner(System.in);
    
    @Override
    public void run()
    {
     name=rs.next();
     synchronized(this)
     {
     this.notifyAll();
    }
    }
    public void display()
    {
        System.out.println("Name of the person is:"+name);
    }
    
}
class ThreadDisplay extends Thread
{
    ThreadName name;
    public ThreadDisplay(ThreadName name)
    {
        this.name=name;
    }
    @Override
    public void run()
    {
      synchronized(name)
      {
          try {
              name.wait();
          } catch (InterruptedException ex) {
              Logger.getLogger(ThreadDisplay.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      name.display();
    }
}
public class InterThreadTalk {
 public static void main(String ... args) throws InterruptedException
 {ThreadName n1 = new ThreadName();
    ThreadDisplay n2 = new ThreadDisplay(n1);
 n1.start();
 n2.start();

     System.out.println("end of main thread");
}
}