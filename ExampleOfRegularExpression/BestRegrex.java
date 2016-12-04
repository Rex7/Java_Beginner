/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

import java.util.Calendar;



/**
 *
 * @author Regis
 */
public class BestRegrex {
    public static void main(String...args)
    {
      String res="regischarles50gmail.com";
      String email="regischarles7@gmail.com";
      
      String pattern="[a-zA-z]+[0-9]+(@)?([a-zA-Z]+(\\.com)?)";
        System.out.println("matches?"+res.matches(pattern));
        System.out.println("matches"+email.matches(pattern));
        String dot="hell is . in here";
        String p="\\.";
        String [] t=dot.split(p);
        for(String temp:t)
        {
            System.out.println("s"+temp);
        }
    }
    
}
