
package JavaBasic;

/**
 *
 * @author Regis
 */
interface regis{
    
}
class box implements regis{
    public void display(){
        System.out.println("I'm a box");
    }
}
public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        box b = new box();
       
        if(b instanceof regis){
            b.display();
        }
        else {
            System.out.println("you dont have permission");
        }
    }
}
