/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
class Thread1 extends Thread
{
    Scanner rs = new Scanner(System.in);

    

    public Thread1(String name) {
        super(name);
   
    }
    @Override
    public void run()
    {
        int choice;
        do
        {
            System.out.println("Enter your choice"+
                    "\n 1:Ascending order"+
                    "\n 2:Descending order"+
                    "\n 3:exit"); 
            choice=rs.nextInt();
            switch(choice)
            {
                case 1:
                    for(int i=1;i<=10;i++)
                        System.out.println("Thread name"+this.getName()+"Value"+i);
                    break;
                case 2:
                    for(int i=10;i>=1;i--)
                        System.out.println("Thread name"+this.getName()+"values"+i);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("are you so dumbass write something according to the commnad");
            }
        }
        while(choice!=3);
    }
}

public class ThreadDemo {
    public static void main(String...args)
    {
        String choice;
        Scanner rs = new Scanner(System.in);
        System.out.println("Enter your Thread name");
        choice=rs.nextLine();
        Thread1 one = new Thread1(choice);
        one.start();
        
    }
    
}
