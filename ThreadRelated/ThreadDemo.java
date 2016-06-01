/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadRelated;

/**
 *
 * @author Regis
 */
class Thread1 extends Thread
{
    @Override 
    public void run()
    {
        System.out.println("am from thread1");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread1().start();
    }
    
}
