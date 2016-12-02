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
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Vector;
public class LinkedListExample {
    public static void main(String ... ar)
    {
        Iterator iter ;
        int i=0,n;
        int [] array = {1,3,5,3,9};
        //dsiplaying element in reverse order;
        n=array.length-1;
        for(i=n;i<1;i-- )
            System.out.println(array[i]);
        
        //Vector Program
        Vector <String> vs = new Vector<>();
        vs.addElement("vec");
        vs.addElement("rex ");
        vs.addElement("victory is ours");
        //displaying vector using iterator
        iter = vs.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        //Displaying Elements of Vector Using Enchanced For Loop
        
        
        
        //LinkedList Program
        LinkedList ls = new LinkedList();
        ls.add("regis");
        ls.add("whats up");
        ls.add("babe");
        ls.add("babe why yu show no interest in me ");
        
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        for(Object obj : ls)
        {
            i++;
            System.out.println("element in linkedlist are"+i+":"+obj);
    }
    }
    
}
