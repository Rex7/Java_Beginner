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
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackEmample {

    private static final Scanner rs = new Scanner(System.in);

    public static void main(String... args) {
        Stack str = new Stack();

        int i = 0;
        do {
            System.out.println("Enter Your Choice Of Operations on the Stack"
                    + "\n 1Push Element \n 2 Pop Element");
            int temp = rs.nextInt();
            switch (temp) {
                case 1:
                    System.out.println("enter the element in push into the stack");
                    String t = rs.next();
                    pushStack(str, t);
                    System.out.println("Stack after addition of new value" + str);
                    break;
                case 2:
                    try {
                        System.out.println("Before deletion of Element in Stack are" + str);

                        popStack(str);

                        System.out.println(str);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is Empty");
                    }
                    break;

            }
        } while (i <= 2);
    }

    public static void pushStack(Stack st, String ss) {
        System.out.println(st);
        String temp = ss;
        st.add(ss);

    }

    public static void popStack(Stack st) {
        String deleted = (String) st.pop();
        System.out.println("deleted element are" + deleted);
    }

}
