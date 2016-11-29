/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class MatrixProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat1[][], mat2[][], mat3[][] = new int[2][2];
        mat1 = new int[2][2];
        mat2 = new int[2][2];

        System.out.println("Mat1 data extraction");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                System.out.println("Enter value at index [" + i + "]" + "[" + j + "]");
                mat1[i][j] = input.nextInt();
            }

        }
        System.out.println("Mat 2 data extraction");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                System.out.println("Enter value at index [" + i + "]" + "[" + j + "]");
                mat2[i][j] = input.nextInt();
            }
        }
//additing the two matrix
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Result");
        for (int[] mat31 : mat3) {
            for (int j = 0; j < mat3.length; j++) {
                System.out.print(mat31[j] + "\t");
            }
            System.out.println();
        }

    }
}
