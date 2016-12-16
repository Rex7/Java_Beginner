/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenricsExample;

/**
 *
 * @author Regis
 */
public class FunctionDemo {
    public static <E> void printArray(E[] array){
        for(E data:array){
            System.out.println(data);
        }
    }
       public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(FunctionDemo.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
    
}
