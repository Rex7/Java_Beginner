/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenricsExample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Regis
 */

class GenType 
{
    
}
public class TypeGenricsNumber {
    public static void main(String[] args) {
        
      ArrayList <String> s= new ArrayList<>();
      s.add("regis");
      s.add("rex");
      rex(s);
        System.out.println("list holds element"+s);
      
    }
    public static void rex(ArrayList l)
    {
       l.add("life");
       l.add(23);
       l.add(2.5);
        
    }
    
}
