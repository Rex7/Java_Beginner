
package JavaBasic.inheritance;

/**
 *
 * @author Regis
 */
abstract class Gun {
   protected int magazineCapacity, range;
   protected String type;
   protected float weight;
    public Gun(int magazineCapacity, float weight, String type, int range) {
        this.magazineCapacity = magazineCapacity;
        this.weight = weight;
        this.range = range;
        this.type = type;
    }
    public Gun() {
        System.out.println("Preparing Guns for construction");
    }
    public abstract void displayGun();
}
interface ActionPerformed {

    public void reload();

    public void fire();
}

class Revolver extends Gun implements ActionPerformed {

 protected   String revolverName;

    public Revolver() {
        System.out.println("Constructing the revolver");
    }

    public Revolver(String revolverName, int magazineCapacity, float weight, String type, int range) {
        super(magazineCapacity, weight, type, range);
        this.revolverName = revolverName;
    }

    @Override
    public void reload() {
        System.out.println("reloading "+revolverName);
    }

    @Override
    public void fire() {
        System.out.println("Firing.. "+revolverName);
    }
    @Override
    public void displayGun() {
        System.out.println("Revolver Name:" + revolverName + "\nCapacity:" + magazineCapacity + "\nType:" + type
                + "\nWeight in kgs:" + weight + "kg" + "\nRange in yards:" + range);
    }

}

public class MultipleInheritance {

    public static void main(String[] args) {
        Revolver coltPython = new Revolver("Colt Python", 6, 1.4f, "Semi-auto", 75);
        
        coltPython.fire();

        coltPython.displayGun();
        coltPython.reload();
        
       
    }

}
