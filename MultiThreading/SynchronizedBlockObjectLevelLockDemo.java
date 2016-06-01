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
class DisplayWish
{
    public void wish(String name)
    {
        synchronized(this)
        {
        for(int i=1;i<10;i++)
        {
            System.out.println("Good Morning :");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                
            }
            System.out.println(name);
        }
        }
    }
}
class MyThreads1 extends Thread
{
   DisplayWish s2;
   String name;
   public MyThreads1(DisplayWish s2,String name)
   {
       this.s2=s2;
       this.name=name;
       
   }
   @Override
  public void run()
  {
      s2.wish(name);
}
}
class MyThreads2 extends Thread
{
       DisplayWish s1;
   String name;
   public MyThreads2(DisplayWish s1,String name)
   {
       this.s1=s1;
       this.name=name;
       
   }
   @Override
  public void run()
  {
      s1.wish(name);
}
}
public class SynchronizedBlockObjectLevelLockDemo {
    public static void main(String[] args) {
        DisplayWish s= new DisplayWish();
        MyThreads1 s1 = new MyThreads1(s,"regis");
          MyThreads1 s2 = new MyThreads1(s,"jenifer");
          s1.start();
          s2.start();
        
    }
}
