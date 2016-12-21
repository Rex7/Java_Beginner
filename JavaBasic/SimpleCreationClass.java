/*

 *     Rex
 */
package JavaBasic;

/**
 *
 * @author Regis
 */
/*This type of methods which sets and gets value are known as getter and setter

*/
class Student {

    protected String name;
    protected int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name of the student is :" + name + "\nAge:" + age;

    }

}

public class SimpleCreationClass {

    public static void main(String[] args) {
        Student regis = new Student();
        regis.setName("regis");
        regis.setAge(23);
        System.out.println(regis);

    }
}
