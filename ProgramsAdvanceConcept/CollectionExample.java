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
import java.util.List;
import java.util.Vector;
import java.util.Iterator;
public class CollectionExample {
    public static void main(String ... args)
    {
        List l = new Vector();
        l.add("regis");
        l.add(9);
        l.add(25.3);
        for( Object obj: l)
        {
            System.out.println(obj);
        }
        Iterator iter = l.iterator();
        while(iter.hasNext())
        {
            System.out.println("Element in Vector:"+iter.next());
        }
        
    }
    
}
