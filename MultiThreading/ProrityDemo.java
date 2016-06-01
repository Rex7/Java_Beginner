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
class ThreadDemoS extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Child thread");
    }
}
public class ProrityDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread priority"+Thread.currentThread().getPriority());
        System.out.println("Setting thread priority of main thread 10");
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority"+Thread.currentThread().getPriority());
        ThreadDemoS s = new ThreadDemoS();
        System.out.println("Thread priority of child is"+s.getPriority());
    }
    
}
