/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

/**
 *
 * @author Regis
 */
public class PrimeNumberDemo {

    public static void main(String[] args) {
        //printing prime number from 1 to 100
        int count = 0;
        int number, j;
        for (number = 1; number < 100; number++) {

            for (j = 1; j < 100; j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number);

            }
            count = 0;
        }
    }

}
