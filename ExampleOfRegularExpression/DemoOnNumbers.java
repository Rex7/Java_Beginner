
package ExampleOfRegularExpression;

/**
 *
 * @author Regis
 */

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Demos 
{
    Frame f;
   Demos()
   {
       f= new Frame();
      f.addWindowListener(new WindowAdapter()
       {
           @Override
         public void windowClosing(WindowEvent e)
         {
             System.exit(0);
         }
           
       });
     f. setVisible(true);
     f. setSize(350,350);
   }
}
public class DemoOnNumbers {
    public static void main(String[] args) {
   new Demos();
    }
    
}
