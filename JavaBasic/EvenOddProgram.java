
package JavaBasic;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class EvenOddProgram {
    public static void main(String[] args) {
        int no;
        Scanner rs = new Scanner(System.in);
        //enter a number to check whether its even or odd
        System.out.println("Enter Number :");
        no = rs.nextInt();
       
        if(no%2==0){
            System.out.printf("\nNumber %d is Even",no);
        }
        else
            System.out.printf("\nNumber %d is Odd",no);
    }
    
}
