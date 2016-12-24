/*

 *     Rex
 */
package JavaBasic.collections.sets;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
/**
 *
 * @author Regis
 */
/*
Sets is a interface which is used to store unique values.
It can't contain duplicate values.
TreeSet provides an implementation of the Set interface that uses a tree for storage.
Objects are stored in a sorted and ascending order.
*/
public class SetsUsingTreeSetDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set treeSet = new TreeSet();
        System.out.println("Enter Number Of Elements In TreeSet:");
        int noOfElement = input.nextInt();

        for (int i = 0; i < noOfElement; i++) {
            String data = input.next();
            treeSet.add(data);
        }
        System.out.println("data in treeSets");
        Iterator iterate = treeSet.iterator();
        while(iterate.hasNext()){
            //calling iterate.next() twice will cause it to move forward
           Object data=iterate.next();
            System.out.println(data);
        }
    }

}
