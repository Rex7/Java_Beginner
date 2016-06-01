/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Regis
 */
class A
{
    public synchronized  void d1(B b)
    {
        System.out.println("D1 trying to call d2 m");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        b.show();
    }
    public synchronized void show()
    {
       
        System.out.println("Show from A");
    }
}
class B 
{
    public synchronized void d2(A a)
    {
        System.out.println("D2 tring to call a's Method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.show();
        
    }
    public synchronized void show()
{
    System.out.println("Show from B");
}
    
}
class DeadLock extends Thread
{
    A a = new A();
    B b = new B();
    
    public void m1()
    {
        this.start();
      a.d1(b);
    }
    @Override
    public void run()
    {
        b.d2(a);
    }
}
public class DeadLockExample {
    public static void main(String[] args) {
        DeadLock a  = new DeadLock();
        a.m1();
    }
    
}
