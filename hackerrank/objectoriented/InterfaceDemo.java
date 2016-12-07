/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.objectoriented;

/**
 *
 * @author Regis
 */
import java.util.*;

interface AdvancedArithmetic{
  int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n){
       int count=0;
       for (int i=1;i<=n;i++){
           if(n%i==0){
               count=count+i;
           }
       }
        return count;
    }
    
}
class InterfaceDemo{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }
}


