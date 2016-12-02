/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.ProgramsAdvanceConcept;

import java.util.Calendar;


/**
 *
 * @author Regis
 */
public class CalendarDemo {
    public static void main(String ... args)
    {
        int month;
      
        
        Calendar d = Calendar.getInstance();
         month= d.get(Calendar.MONTH);
         month=month+1;
       
      System.out.println( d.get(Calendar.HOUR)+":"+d.get(Calendar.MINUTE)+"\n Date"+d.get(Calendar.DAY_OF_MONTH)+"-"+month+"-"+d.get(Calendar.YEAR));
    }
    
}
