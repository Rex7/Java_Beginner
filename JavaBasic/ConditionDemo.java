
package JavaBasic;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class ConditionDemo {
    public static void main(String[] args) {
        int no1,no2,no3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number One");
        no1=input.nextInt();
        System.out.println("Enter Number Two");
        no2=input.nextInt();
        System.out.println("Enter Number third");
        no3= input.nextInt();
        System.out.println("greatest Number"+numberGreater(no1,no2,no3));
        
    }
    public static int numberGreater(int no1,int no2,int no3){
        //using if else if to find greatest number 
        int greatest = 0;
        if(no1>no2&&no1>no3){
            greatest=no1;
        }
        else if(no2>no1 &&no2>no3)
           greatest= no2;
        else if(no3>no1 && no3>no2){
            greatest=no3;
        }
        return greatest;
    }
    
}
