package MultiThreading;
/*
@autor regis;
*/
class Threads1 extends Thread
{
    private int total=0;
    @Override
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            total=total+i;
        }
        synchronized(this)
        {
            this.notify();
            System.out.println("Child is notifying the thread");
        }
    }
    public void display()
    {
        System.out.println("total value"+total);
    }
}
public class InterThreadCmmunication
{
    public static void main(String[] args) throws InterruptedException {
        Threads1 s = new Threads1();
        s.start();
       synchronized(s)
       {
           s.wait();
       }
     
       s.display();
    }
}