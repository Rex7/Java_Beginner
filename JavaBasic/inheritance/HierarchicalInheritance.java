/*

 *     Rex
 */
package JavaBasic.inheritance;

/**
 *
 * @author Regis
 */
/*
 This program is to show the working of hierarchical inheritance
 by creating two class BasePerson from where both Employee and SubClassStudent
 */
abstract class BasePerson {

    protected String name;
    protected int age;

    public BasePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayRecords();

}

class Employee extends BasePerson {

    protected int employeeId;
    protected double salary;

    public Employee(String employeeName, int employeeAge, int employeeId, double salary) {
        super(employeeName, employeeAge);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public void displayRecords() {
        System.out.println("Empoyee Records\nEmployee Name:" + name + "\nEmployee ID:" + employeeId + "Age:" + age + "Salary:" + salary);
    }
}

class SubClassStudent extends BasePerson {

    protected int studentRollNo;
    protected int std;

    public SubClassStudent(String studentName, int studentAge, int studentRollNo, int std) {
        super(studentName, studentAge);
        this.studentRollNo = studentRollNo;
        this.std = std;
    }

    @Override
    public void displayRecords() {
        System.out.println("Students Records\nName:" + name + "\nRoll Number" + studentRollNo + "\nAge:" + age + "\nStandard:" + std);
    }

}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        BasePerson stud_regis=new SubClassStudent("Regis charles",15,1,10);
        stud_regis.displayRecords();
    }

}
