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
class Message
{
    public  synchronized void wish(String name)
    {
        System.out.print("\n Good morning ");
        try
        {
           Thread.sleep(2000); 
        }
        catch(InterruptedException e)
        {
            System.out.println(""+e.getMessage());
        }
        System.out.print(name);
    }
}
class MyThread extends Thread
{
  private final String name;
  private final  Message s;
    public MyThread(Message s,String name)
    {
        this.name=name;
        this.s=s;
        
    }
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        s.wish(name);
        
    }
}
public class SyncronizedDemo {
    public static void main(String[] args) {
      Message m = new Message();
      Message me = new Message();
      MyThread ss = new MyThread(m,"regis");
       MyThread s2 = new MyThread(me,"kat");
   ss.start();
   s2.start();
    }
    
}
