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
import java.util.Set;
import java.util.Map;

import java.util.Vector;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class MapDemo {
    public static void main(String ... args)
            
    {   //Declaring all Data Structure
        Vector vs = new Vector();
        Map m = new HashMap();
        List l = new ArrayList();
        int [] s = { 18,20,3,4};
        Arrays.sort(s);
       int no= Arrays.binarySearch(s, 4);
       if(no<0)
       System.out.println("no is not present");
       else
        System.out.println("Number"+4 + "It is Present at "+no);
       
       for ( int arr : s)
       {
           System.out.println(arr);
       }
     //Initializing HashMap
        m.put("Regis", 23);
        m.put("jenifer", 22);
        m.put("charles", 25);
      //Dsiplaying HashMap
        Set set = m.entrySet();
        Iterator r = set.iterator();
        while(r.hasNext())
        {
            Map.Entry mm = (Map.Entry)r.next();
            System.out.println("KEY"+mm.getKey() +"Value"+mm.getValue());
            System.out.println(r.next());
        }
        //Initializing ArrayList
        l.add("regis");
        l.add(55);
        l.add(9.5);
        //Displaying ArrayList
        for(Object name : l) {
            System.out.print(name);
        }
        char rs = 'i';
        //Initializing Vector 
        vs.addElement("whats up");
        vs.addElement(555);
        vs.addElement(555);
        vs.addElement( 'a');
        vs.addElement(rs);
        Iterator iter = vs.iterator();
        while(iter.hasNext())
        {
            Map.Entry mapp = (Map.Entry)iter.next();
         
            
        }
        //Displaying Data
       for( Object vector : vs)
       {
           
           System.out.println(vector);
       }
    }
}
