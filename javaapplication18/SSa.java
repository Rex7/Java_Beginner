/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Regis
 */
public class SSa {
   public String update(String db_name,String course,String semster,String month,String day)
   {
      
          
               switch(course)
               {
                   case "information":
                   {
                       switch(semster)
                       {
                           case "first":
                           {
                               if(month.equals("6"))
                               {
                                   return("IF1G_JUNE");
                                   
                               }
                               
                               if(month.equals("7"))
                               {
                                   return ("IF1G_JULY");
                               }
                               if(month.equals("8"))
                                   return ("IF1G_AUGUST");
                               if(month.equals("9"))
                                   return ("IF1G_SEPT");
                               if(month.equals("10"))
                                   return ("IF1G_OCT");
                               
                               break;
                           }
                           case "second":
                           {
                               System.out.println("month"+month);
                               if(month.equals("12"))
                                   return("IF2G_DEC");
                               if(month.equals("1"))
                                   return("IF2G_JAN");
                               if(month.equals("2"))
                                   return("IF2G_FEB");
                               if(month.equals("3"))
                                   return("IF2G_MARCH");
                               break;
                            }
                           case "third":
                           {
                               if(month.equals("6"))
                                   return("IF3G_JUNE");
                               if(month.equals("7"))
                                   return("IF3G_JULY");
                               if(month.equals("8"))
                                   return("IF3G_AUGUST");
                               if(month.equals("9"))
                                   return("IF3G_SEPT");
                               if(month.equals("10"))
                                    return("IF3G_OCT");
                              break;
                           }
                           case "fourth":
                           {   if(month.equals("12"))
                                   return("IF4G_DEC");
                               if(month.equals("1"))
                                   return("IF4G_JAN");
                               if(month.equals("2"))
                                   return("IF4G_FEB");
                               if(month.equals("3"))
                                   return("IF4G_MARCH");
                               break;
                           }
                           case "fifth":
                           {
                            if(month.equals("6"))
                                return("IF5G_JUNE");
                            if(month.equals("7"))
                                return("IF5G_JULY");
                            if(month.equals("8"))
                                return("IF5G_AUGUST");
                            if(month.equals("9"))
                                return("IF5G_SEPT");
                            if(month.equals("10"))
                                return("IF5G_OCT");

                               break;
                           }
                           case "sixth":
                           {
                               if(month.equals("12"))
                                   return("IF6G_DEC");
                               if(month.equals("1"))
                                   return("IF6G_JAN");
                               if(month.equals("2"))
                                   return("IF6G_FEB");
                               if(month.equals("3"))
                                   return("IF6G_MARCH");
                               break;
                           }
                       }
                    break;   
                   }
                   case "electronics":
                   {
                       switch(semster)
                       {
                           case "first":
                           {
                               if(month.equals("6"))
                               {
                                   return("EJ1G_JUNE");
                                   
                               }
                               
                               if(month.equals("7"))
                               {
                                   return ("EJ1G_JULY");
                               }
                               if(month.equals("8"))
                                   return ("EJ1G_AUGUST");
                               if(month.equals("9"))
                                   return ("EJ1G_SEPT");
                               if(month.equals("10"))
                                   return ("EJ1G_OCT");
                               
                               break;
                           }
                           case "second":
                           {
                               System.out.println("month"+month);
                               if(month.equals("12"))
                                   return("EJ2G_DEC");
                               if(month.equals("1"))
                                   return("EJ2G_JAN");
                               if(month.equals("2"))
                                   return("EJ2G_FEB");
                               if(month.equals("3"))
                                   return("EJ2G_MARCH");
                               break;
                            }
                           case "third":
                           {
                               if(month.equals("6"))
                                   return("EJ3G_JUNE");
                               if(month.equals("7"))
                                   return("EJ3G_JULY");
                               if(month.equals("8"))
                                   return("EJ3G_AUGUST");
                               if(month.equals("9"))
                                   return("EJ3G_SEPT");
                               if(month.equals("10"))
                                    return("EJ3G_OCT");
                              break;
                           }
                           case "fourth":
                           {   if(month.equals("12"))
                                   return("EJ4G_DEC");
                               if(month.equals("1"))
                                   return("EJ4G_JAN");
                               if(month.equals("2"))
                                   return("EJ4G_FEB");
                               if(month.equals("3"))
                                   return("EJ4G_MARCH");
                               break;
                           }
                           case "fifth":
                           {
                            if(month.equals("6"))
                                return("EJ5G_JUNE");
                            if(month.equals("7"))
                                return("EJ5G_JULY");
                            if(month.equals("8"))
                                return("EJ5G_AUGUST");
                            if(month.equals("9"))
                                return("EJ5G_SEPT");
                            if(month.equals("10"))
                                return("EJ5G_OCT");

                               break;
                           }
                           case "sixth":
                           {
                               if(month.equals("12"))
                                   return("EJ6G_DEC");
                               if(month.equals("1"))
                                   return("EJ6G_JAN");
                               if(month.equals("2"))
                                   return("EJ6G_FEB");
                               if(month.equals("3"))
                                   return("EJ6G_MARCH");
                               break;
                           }
                       }
                       break;
                       }
                           
                       
                      
                   
                   case "computer":
                   {
                       switch(semster)
                       {
                              case "first":
                           {
                               if(month.equals("6"))
                               {
                                   return("CO1G_JUNE");
                                   
                               }
                               
                               if(month.equals("7"))
                               {
                                   return ("CO1G_JULY");
                               }
                               if(month.equals("8"))
                                   return ("CO1G_AUGUST");
                               if(month.equals("9"))
                                   return ("CO1G_SEPT");
                               if(month.equals("10"))
                                   return ("CO1G_OCT");
                               
                               break;
                           }
                           case "second":
                           {
                               System.out.println("month"+month);
                               if(month.equals("12"))
                                   return("CO2G_DEC");
                               if(month.equals("1"))
                                   return("CO2G_JAN");
                               if(month.equals("2"))
                                   return("CO2G_FEB");
                               if(month.equals("3"))
                                   return("CO2G_MARCH");
                               break;
                            }
                           case "third":
                           {
                               if(month.equals("6"))
                                   return("CO3G_JUNE");
                               if(month.equals("7"))
                                   return("CO3G_JULY");
                               if(month.equals("8"))
                                   return("CO3G_AUGUST");
                               if(month.equals("9"))
                                   return("CO3G_SEPT");
                               if(month.equals("10"))
                                    return("CO3G_OCT");
                              break;
                           }
                           case "fourth":
                           {   if(month.equals("12"))
                                   return("CO4G_DEC");
                               if(month.equals("1"))
                                   return("CO4G_JAN");
                               if(month.equals("2"))
                                   return("CO4G_FEB");
                               if(month.equals("3"))
                                   return("CO4G_MARCH");
                               break;
                           }
                           case "fifth":
                           {
                            if(month.equals("6"))
                                return("CO5G_JUNE");
                            if(month.equals("7"))
                                return("CO5G_JULY");
                            if(month.equals("8"))
                                return("CO5G_AUGUST");
                            if(month.equals("9"))
                                return("CO5G_SEPT");
                            if(month.equals("10"))
                                return("CO5G_OCT");

                               break;
                           }
                           case "sixth":
                           {
                               if(month.equals("12"))
                                   return("CO6G_DEC");
                               if(month.equals("1"))
                                   return("CO6G_JAN");
                               if(month.equals("2"))
                                   return("CO6G_FEB");
                               if(month.equals("3"))
                                   return("CO6G_MARCH");
                               break;
                           }
                       }
                       
                           
                       
                           
                       
                       
                       break;
                   }
                   default:
                       return("no record found");
               }
       return null;
           
           
       
    
   }
   public static void main(String ...args)
   {
       SSa s = new SSa();
       
       String nameofteacher,month,course,sem,day;
       Scanner rs = new Scanner(System.in);
       System.out.println("name of the teacher");
       nameofteacher=rs.nextLine();
       System.out.println("course");
       course=rs.nextLine();
       System.out.println("Enter semester");
       sem=rs.nextLine();
       Calendar cal = Calendar.getInstance();
       month=String.valueOf(1+cal.get(Calendar.MONTH));
       day=String.valueOf(cal.get(Calendar.DATE));
       System.out.println("dat"+day);
       System.out.println("month"+month);
       String table_name=s.update(nameofteacher,course,sem,month,day);
       System.out.println("Table name"+table_name);
   }
    
}
