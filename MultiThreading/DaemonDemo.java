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
class The extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("Child:"+i);
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    }
}
public class DaemonDemo {
    public static void main(String[] args) {
        
    The s = new The();
    s.setDaemon(true);
    s.start();
        System.out.println("End of Main Thread");
    }
    
}
