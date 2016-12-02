/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.ProgramsAdvanceConcept;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.List;


/**
 *
 * @author Regis
 */
public class UsingMethdRefrebce {
    public static void main(String...arg)
    {
        
    List <Integer> val = Arrays.asList(1,2,3,4);
   // val.forEach(UsingMethdRefrebce::add);
    val.forEach(i->out.println(i));
                    
        
    
}
    public static void add(int a)
    {
        System.out.println(a*a);
    }
}
