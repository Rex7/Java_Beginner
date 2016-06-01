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
class first extends Thread
{
    @Override
    public void run()
    {
       for(int i=0;i<5;i++)
       {
           try {
               Thread.sleep(500);
           } catch (InterruptedException ex) {
               Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
           }
           System.out.println("first"+i);
           
       }
        
    }
}
class Second extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
       {
           try {
               Thread.sleep(500);
           } catch (InterruptedException ex) {
               Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
           }
           System.out.println("second"+i);
       }
    }
}
public class Ma {
    public static void main(String[] args) throws InterruptedException {
       first f = new first();
       Second s = new Second();
       f.start();
      
       s.start();
    }
    
}
