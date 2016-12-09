/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Regis
 */
public class TimeTakenByVectorAndArrayList {

    public static void main(String[] args) {
        System.out.println("Program to calculate time taken by arraylist and vector to add 55_51_500 elements");
        Vector v = new Vector();
        ArrayList list = new ArrayList();

        long start = System.currentTimeMillis();
        for (int i = 1; i <= 55_51_500; i++) {

            v.add(i);

        }
        long end = System.currentTimeMillis();
        System.out.println("time taken by vector to add 500 elements is " + (start - end)+"ms");
        long start_array = System.currentTimeMillis();
        for (int i = 1; i <=55_51_500; i++) {
            list.add(i);
        }
        long end_array = System.currentTimeMillis();
        System.out.println("Time Taken By ArrayList " + (start_array - end_array)+"ms");

    }

}
