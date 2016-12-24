/*

 *     Rex
 */

package JavaBasic.collections.listInterface;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Regis
 */
public class StackDemo {
    public static void main(String[] args) {
        int choice;
        Scanner input =new Scanner(System.in);
        Stack  stack = new Stack();
        /*stack has methods push and pop 
        for adding and removing element
        */
        do {
            System.out.println("\n1:push\n2:pop\n3:print");
            System.out.println("Enter Your Choice");
            choice =input.nextInt();
            switch(choice){
                case 1:
                    String data=input.next();
                    stack.push(data);
                    break;
                case 2:
                    if(stack.isEmpty()){
                        System.out.println("stack empty");
                    }
                    else{
                        stack.pop();
                    }
                    break;
                case 3:
                   if(stack.isEmpty()){
                       System.out.println("Stack is empty\nthere is nothing to print");
                   }
                   else{
                       System.out.println("Element in Stack");
                       for (Object object :stack) {
                           System.out.println(object);
                       }
                   }
                    break;
            }
        } while (choice<=3);
        
    }
}
