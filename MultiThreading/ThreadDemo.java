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
class Thread2 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("Child thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Thread2 s = new Thread2();
        s.setPriority(10);
        
        s.start();
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<10;i++)
        {
            System.out.println("main Thread");
        }
    }
    
}
