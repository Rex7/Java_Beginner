/*

 *     Rex
 */

package JavaBasic.exceptions;

/**
 *
 * @author Regis
 */
public class ArithmeticExceptionDemo {
    public static void  div(double number1,double number2){
        double ans;
       try{
           ans=number1/number2;
           System.out.println("Divison  "+ans);
          
       }
       catch(ArithmeticException ex){
           System.out.println("Error: "+ex.getMessage()); 
       }
      
    }
    
    public static void main(String[] args) {
        div(23,5);
    }

}
