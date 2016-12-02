/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.ProgramsAdvanceConcept;

import java.lang.reflect.Method;

/**
 *
 * @author Regis
 */
public class TestDemo {
    public static void main(String ... args) throws Exception
    {
        Class b = Class.forName("Projects.awt.ProgramsAdvanceConcept.Test");
       Test  Babe =(Test) b.newInstance();
        Method bb = b.getDeclaredMethod("show", null);
        bb.setAccessible(true);
        bb.invoke(Babe, null);
        
    }
    
}
