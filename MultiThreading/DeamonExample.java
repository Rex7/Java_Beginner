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
class ThreadDean extends Thread {

    public ThreadDean(String title) {
        super(title);
    }

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Thread is Daemon ");
        } else {
            System.out.println("Its A normal Thread");
        }
    }

}

public class DeamonExample {

    public static void main(String[] args) {
        ThreadDean s = new ThreadDean("regis");
        ThreadDean s2 = new ThreadDean("rex");
        ThreadDean s3 = new ThreadDean("jenifer");
        s.start();
        
        s2.setDaemon(true);
         s2.start();
        
       
        s3.start();

    }

}
