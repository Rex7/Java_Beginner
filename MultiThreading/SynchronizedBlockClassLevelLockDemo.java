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
class Greetings
{
    public void wish(String name)
    {
        synchronized(Greetings.class)
        {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Good Morning :");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Message"+e.getMessage());
            }
            System.out.println(name);
        }
        }
    }
}
class Threads3 extends Thread
{
   private final Greetings e;
   private final String name;
    public Threads3(Greetings e,String name)
    {
        this.e=e;
        this.name=name;
    }
    @Override
    public void run()
    {
        e.wish(name);
    }
}
class Threads4 extends Thread
{
   private final Greetings e;
   private final String name;
    public Threads4(Greetings e,String name)
    {
        this.e=e;
        this.name=name;
    }
    @Override
    public void run()
    {
        e.wish(name);
    }
}
public class SynchronizedBlockClassLevelLockDemo {
    public static void main(String[] args) {
         Greetings s1 = new Greetings();
     Greetings s2 = new Greetings();
     Threads3 s = new Threads3(s1,"regis");
          Threads4 s3 = new Threads4(s2,"jenifer");
          s.start();
          s3.start();
        
    }
   
 
     
    
    
}
