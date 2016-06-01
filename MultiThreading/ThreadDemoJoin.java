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
class Thread12 implements Runnable
{
    String name;
    public Thread12(String name)
    {
       this.name=name;
    }
    public void run()
    {
        System.out.println("chilname"+name);
    }
}
public class ThreadDemoJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread s1 =new Thread(new Thread12("first"));
         Thread s2 =new Thread(new Thread12("second"));
          Thread s3 =new Thread(new Thread12("third"));
         s3.start();
         s3.join();
         s2.start();
         s2.join();
         s1.start();
         s1.join();
          System.out.println("Existing main Thread");
          
    }
    
}
