/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternlPst;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Regis
 */
class Thread1 extends Thread
{
    public Thread1(String name)
    {
        super(name);
        
    }
    @Override
    public void run()
    {
       for(int i=0;i<=10;i++)
       {
           System.out.println("ThreadName"+Thread.currentThread().getName()+":"+i);
       }
    }
}
class Thread3 extends Thread
{
    public Thread3(String name)
    {
        super(name);
        
    }
    @Override
    public void run()
    {
       for(int i=0;i<=10;i++)
       {
           System.out.println("ThreadName"+Thread.currentThread().getName()+":"+i);
       }
    }
}
class Thread2 extends Thread
{
    public Thread2(String name)
    {
        super(name);
        
    }
    @Override
    public void run()
    {
       for(int i=0;i<=10;i++)
       {
           System.out.println("ThreadName"+Thread.currentThread().getName()+":"+i);
       }
    }
}
public class ThreadJoinDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("THread1");
        Thread2 t2 = new Thread2("Thread2");
        Thread3 t3 = new Thread3("thread3");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadJoinDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        try
        {
         t2.join();
        }
            catch(InterruptedException e)
                    {
                    
                    }
        
        t3.start();
        System.out.println("End Of MainThread");
        
    }
    
}
