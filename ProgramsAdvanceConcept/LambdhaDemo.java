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
public class LambdhaDemo {
    public static void main(String...arg)
    {
         MathOperation add = (int a, int b) -> {
            return a + b;
        };
        MathOperation Sub = (int a, int b) -> {
            return a - b;
        };
        MathOperation Div = (int a, int b) -> {
            return a / b;
        };
        MathOperation Multi = (int a, int b) -> {
            return a * b;
        };

        System.out.println("Addition" + add.execute(15, 69));
        System.out.println("Sub"+Sub.execute(36,85));
        System.out.println("Multiplication"+Multi.execute(36, 85));
        System.out.println("Div"+Div.execute(36,85));
            
    }
    
}
