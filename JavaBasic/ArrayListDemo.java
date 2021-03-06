/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        //for input we will use Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number OF Element in ArrayList");
        int no = input.nextInt();
        for(int i=0;i<no;i++){
            //next() method of class Scanner reads only single words
            String data = input.next();
            arraylist.add(data);
        }
        /*
        We can use either for loop or We can use iterator to display object
        We will use iterator in this demo
        Iterator is a interface which is present in java.util.Iterator
        */
        Iterator iterator = arraylist.iterator();
        System.out.println("Display ArrayList Data: ");
        while(iterator.hasNext()){
            //next() method of iterator returns object 
            String data=(String)iterator.next();
            System.out.println(data);
        }
    }

}
