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
class Child1 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Chikd");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Child1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Child1 s = new Child1();
        s.start();
        s.join();
        for(int i=0;i<10;i++)
        {
            System.out.println("Parent");
        }
    }
    
}
