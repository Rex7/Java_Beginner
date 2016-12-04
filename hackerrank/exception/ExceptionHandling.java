/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.exception;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
class MyCalculator{
    
    public int power(int n,int p) throws Exception{
        
    
        
        if(n<0 || p<0){
            throw new   Exception(" n and p should be non-negative");
        }
        return (int)Math.pow(n, p);
   
}
}
class Solution {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  while ( in .hasNextInt()) {
   int n = in .nextInt();
   int p = in .nextInt();
   MyCalculator my_calculator = new MyCalculator();
   try {
    System.out.println(my_calculator.power(n, p));
   } catch (Exception e) {
    System.out.println(e);
   }
  }
 }
}
