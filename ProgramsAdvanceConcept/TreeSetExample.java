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

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

import java.util.TreeSet;
import java.util.Set;
public class TreeSetExample {
    public static void main(String ... arg)
    {   
        
        Map<String,Integer> m = new HashMap<>();
        //setting key value pair
        m.put("rex",1992);
        m.put("charles",1995);
        m.put("babe",1925);
        Set ss = m.entrySet();
        Iterator lst = ss.iterator();
        while(lst.hasNext())
        {
            Map.Entry mm= (Map.Entry)lst.next();
            System.out.println("key:"+mm.getKey()+"Value:"+mm.getValue());
        }
        
        TreeSet<Integer> s = new TreeSet<>();
     
        s.add(19);
        s.add(26);
        s.add(3);
        s.add(15);
        s.add(15);
        
        Iterator ls =s.iterator();
        while(ls.hasNext())
        {
            System.out.println(ls.next());
        }
       
    }
    
}
