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
class Iterrupts extends Thread
{
    @Override
    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("am lazy Thread"+i);
                Thread.sleep(2000);//Thread sleeping for 2 sec after each print statement
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Am iterrupted");
        }
    }
}
public class InterruptDemo {
    public static void main(String[] args) {
        Iterrupts s = new Iterrupts();
        s.start();
        s.interrupt();
        System.out.println("End of thread"+Thread.currentThread().getName());
    }
    
}
