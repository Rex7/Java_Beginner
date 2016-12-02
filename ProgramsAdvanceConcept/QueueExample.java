/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.ProgramsAdvanceConcept;

/**
 *
 * @author Regis
 */

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;
public class QueueExample {
    public static void main(String ... args)
    {
        int ch;
        Queue<Integer> u= new PriorityQueue<>();
        Queue<String> q = new LinkedList<>();
        Scanner rs = new Scanner(System.in);
       do
       {
           System.out.println("\nMenu Driven Program for Queue"+"\n1:Add Element"
                   +"\n2:delete Element"
                   +"\n3:Display Element in the Queue"
                   +"\n4: Empty the Queue");
           ch=rs.nextInt();
           switch(ch)
           {
               case 1:
                   String temp;
                   System.out.println("enter element to be added to the queue");
                   temp=rs.next();
                   q.add(temp);
                   break;
               case  2:
                   temp=q.element();
                   q.remove();
                   System.out.println("elemet deleted is"+temp);
                   System.out.println("queue"+q);
                   break;
               case 3:
                   Iterator  ls = q.iterator();
                   while(ls.hasNext())
                   {
                       System.out.println("Element"+ls.next());
                   }
               break;
               case 4:
                   if(q.isEmpty())
                   {
                       System.out.println("Queue is Empty");
                       
                   }
                   else
                   {
                    q.clear();
                    System.out.println(q);
                   }
                   break;
                   
           }
           
           
       }
       while(ch<=4);
        
        
        
    }
}

