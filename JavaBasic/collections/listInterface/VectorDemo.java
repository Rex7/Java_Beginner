/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic.collections.listInterface;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Regis
 */
/*
Vector is used to add objects.
It is synchronized which means it is thread safe 
where only one object can access it at a time.

*/
public class VectorDemo {
     public static void main(String[] args) {
        Vector vector = new Vector();
        //for input we will use Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number OF Element in Vector");
        int no = input.nextInt();
        for(int i=0;i<no;i++){
            //next() method of class Scanner reads only single words
            String data = input.next();
            vector.addElement(data);
        }
        /*
        We can use either for loop or We can use iterator to display object
        We will use iterator in this demo
        Iterator is a interface which is present in java.util.Iterator
        */
        Iterator iterator = vector.iterator();
        System.out.println("Display Vector Data Using Iterator: ");
        while(iterator.hasNext()){
            //next() method of iterator returns object 
            String data=(String) iterator.next();
            System.out.println(data);
        }
        System.out.println("Displaying Elements using for loop");
        for(int i=0;i<vector.size();i++){
            System.out.println(vector.get(i));
        }
    }
    
}
