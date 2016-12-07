

package JavaBasic;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class ScannerDemo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       // next() of scanner reads single words only
        System.out.println("Enter First Name:");
       String first_name = input.next();
        System.out.println("String str "+first_name);
        /*
        nextLine() of Scanner reads untill enter is pressed
        */
        input.nextLine();
        System.out.println("Enter Full Name :");
        String full_name= input.nextLine();
        System.out.println("full name "+full_name);
        /*
        reading integer using scanner class method nextInt()
        */
        System.out.println("Enter Age:");
        int age=input.nextInt();
        System.out.println("Age "+age);
        /*
        reading float values using nextFloat() of scanner class
        */
        System.out.println("Enter Salary:");
        float salary = input.nextFloat();
        System.out.println("Salary "+salary);
    }
    
}
