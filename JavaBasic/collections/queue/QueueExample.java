package JavaBasic.collections.queue;

/**
 *
 * @author Regis
 */
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class QueueExample {

    public static void main(String... args) {
        int ch;
        Queue<String> q = new LinkedList<>();
        Scanner rs = new Scanner(System.in);
        do {
            System.out.println("Menu Driven Program for Queue" + "\n1:Add Element"
                    + "\n2:delete Element"
                    + "\n3:Display Element in the Queue"
                    + "\n4:Empty the Queue");
            ch = rs.nextInt();
            switch (ch) {
                case 1:
                    String temp;
                    System.out.println("enter element to be added to the queue");
                    temp = rs.next();
                    q.add(temp);
                    break;
                case 2:
                    if (q.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        temp = q.element();
                        q.remove();
                        System.out.println("elemet deleted is" + temp);
                        System.out.println("queue" + q);
                    }
                    break;
                case 3:
                    if (q.isEmpty()) {
                        System.out.println("Empty Queue");
                    } else {
                        Iterator ls = q.iterator();
                        System.out.println("Queue Elment");
                        while (ls.hasNext()) {
                            System.out.println(ls.next());
                        }
                    }

                    break;
                case 4:
                    if (q.isEmpty()) {
                        System.out.println("Queue is Empty");

                    } else {
                        q.clear();
                        System.out.println(q);
                    }
                    break;

            }

        } while (ch <= 4);

    }
}
