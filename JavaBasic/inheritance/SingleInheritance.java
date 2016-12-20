
package JavaBasic.inheritance;

/**
 *
 * @author Regis
 */
class Animal{
    public void walk(){
        System.out.println("Animal Walking");
    }
    public void makeSound(){
        System.out.println("making some sound");
    }
}
class Dog extends Animal{
    @Override
    public void walk(){
        System.out.println("Dog walking");
    }
    @Override
    public void makeSound(){
        System.out.println("Barking");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.walk();
        dog.makeSound();
    }
}
