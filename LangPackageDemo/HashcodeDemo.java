/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LangPackageDemo;

/**
 *
 * @author Regis
 */
class Hasing
{
   private final int no;
   public Hasing(int no)
   {
       this.no=no;
   }
   @Override
   public int hashCode()
   {
       return no;
   }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hasing other = (Hasing) obj;
        if (this.no != other.no) {
            return false;
        }
        return true;
    }
    
}
public class HashcodeDemo {
    
    public static void main(String[] args) {
        Hasing h = new Hasing(1);
          Hasing h1 = new Hasing(10);
          Hasing h2=h1;
          System.out.println("hasing value"+h);
          System.out.println(""+h1);
          
         
    }
}
