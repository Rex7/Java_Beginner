/*

 *     Rex
 */

package JavaBasic.collections.sets;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Regis
 */
public class SortedSetUsingTreeSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       SortedSet treeSet = new TreeSet();
        System.out.println("Enter Number of Element:");
        int noOfElement=input.nextInt();
        for (int i = 0; i < noOfElement; i++) {
            String data = input.next();
            treeSet.add(data);
        }
        System.out.println("Displaying Data ");
         treeSet.stream().forEach((object)->{
           System.out.println("data "+object);
       });
    }

}
