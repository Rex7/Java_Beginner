/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.ProgramsAdvanceConcept;


import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Regis
 */
public class WithoutLambdha  {
public static void main(String...arg)
{

    List<Integer> val = Arrays.asList(9,26,78,8,99);
    val.add(96);
    val.add(5);
    val.add(8);
    val.add(78);
//   Consumer <Integer> c = new Consumer<Integer>()
//   {
//       @Override
//       public void accept(Integer i)
//       {
//           System.out.println(i);
//       }
//       
//   };
//   val.forEach(c);
   val.forEach(values->{
       System.out.println(values);
   });
    
}

}
