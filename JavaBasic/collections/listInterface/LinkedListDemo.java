/*

 *     Rex
 */

package JavaBasic.collections.listInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List linkedList = new LinkedList();
        int no =input.nextInt();
        for (int i=0;i<no;i++){
            System.out.println("Enter name to be inserted in linkedlist :");
            String data=input.next();
            linkedList.add(data);
        }
    
  for(Object object :linkedList)
  {
      System.out.println("Data :"+object    );
  }
}
}
