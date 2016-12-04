/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfRegularExpression;

/**impot
 *
 * @author Regis
 */
public class PocketSphinxMonthDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String [] Table_info_attend={"IF1G_JUNE","IF1G_JULY","IF1G_AUGUST","IF1G_SEPT","IF1G_OCT","IF2G_DEC","IF2G_JAN","IF2G_FEB","IF2G_MARCH",
     "IF3G_JUNE","IF3G_JULY","IF3G_AUGUST","IF3G_SEPT","IF3G_OCT","IF4G_DEC","IF4G_JAN","IF4G_FEB","IF4G_MARCH",
     "IF5G_JUNE","IF5G_JULY","IF5G_AUGUST","IF5G_SEPT","IF5G_OCT","IF6G_DEC","IF6G_JAN","IF6G_FEB","IF6G_MARCH"};
     for(int i=0;i<Table_info_attend.length;i++)
     {
         System.out.println("index"+i);
     }
     String one="prasad";
     String two="Prasad";
     if(one.equalsIgnoreCase(two))
     {
         System.out.println("Equals");
         
     }
     else
            System.out.println("not equal");
    }
    
}
