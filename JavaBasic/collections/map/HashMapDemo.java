/*

 *     Rex
 */

package JavaBasic.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Regis
 */
/*
HashMap holds key-value pair.
 which is UnSynchronized which means it is not thread safe and cant be used efficiently in 
 multithreading environment
HashMap can hold null key and null values

*/
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, "regis");
        map.put(1,"rex");
        map.put(null, null);
        System.out.println(map.get(null));
       // iterating hashmap
        Set sets = map.entrySet();
        Iterator iterate = sets.iterator();
        while(iterate.hasNext()){
            Map.Entry entry = (Map.Entry)iterate.next();
            System.out.println("key "+entry.getKey()+"val"+entry.getValue());
        }
        System.out.println("next");
        Set set = map.entrySet();
Iterator iterater =set.iterator();
while(iterater.hasNext()){
    Map.Entry entry=(Map.Entry) iterater.next();
    System.out.println("key :"+entry.getKey()+"\n value"+entry.getValue());
}
        
    }
}
