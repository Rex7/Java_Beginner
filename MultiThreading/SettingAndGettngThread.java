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
class Thread1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("child  babe");
    }
}
public class SettingAndGettngThread {
    public static void main(String[] args) {
       Thread main = Thread.currentThread();
        System.out.println("main name"+main.getName());
        Thread1 s = new Thread1();
        System.out.println("Thread name"+s.getName());
        System.out.println("staring"+s.getName());
 s.setName("rex");
        System.out.println("Thread name"+s.getName());
        
        s.start();
     
    }
    
}
