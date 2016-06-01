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
class Display
{
   public synchronized void displayNumbers()
   {
       for(int i=0;i<10;i++)
       {
           System.out.println(i);
           try
           {
               Thread.sleep(2000);
               
           }
           catch(InterruptedException e)
           {
               System.out.println("Error Message"+e.getMessage());
           }
       }
   }
   public synchronized void displayCharacter()
   {
       for(int i=65;i<=75;i++)
       {
           System.out.println((char)i);
           try
           {
               Thread.sleep(2000);
               
           }
           catch(InterruptedException e)
           {
               System.out.println("Error Message"+e.getMessage());
           }
       }
   }
}
 class MyThread1 extends Thread
{
    Display d1;
    public MyThread1(Display d1)
    {
        this.d1=d1;
    }
    @Override
    public void run()
    {
        d1.displayNumbers();
    }
}
class MyThread2 extends Thread
{
    Display d2;
    public MyThread2(Display d2)
    {
        this.d2=d2;
    }
    @Override
    public void run()
    {
        d2.displayCharacter();
    }
}
public class SyncronizedExample2 {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread1 t1=new MyThread1(d);
          MyThread2 t2=new MyThread2(d);
          t1.start();
          t2.start();
          System.out.println("Main Thread");
        
        
    }
    
}
