/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternlPst;
import java.util.Random;
/**
 *
 * @author Regis
 */
public class StudyProgrammingLanguage {
    public static void main(String[] args) {
        Random r = new Random();
      
     int no =r.nextInt(5);
     switch(no)
     {
         case 0:
             System.out.println("Java");
             break;
         case 1:
             System.out.println("python");
             break;
         case 2:
             System.out.println("c++");
             break;
         case 3:
             System.out.println("c#");
             break;
         case 4:
             System.out.println("asp.net");
             break;
     }
    }
   /*
    result of this test
    java
    c++
    python
    c#
    asp.net
    */
    
}
