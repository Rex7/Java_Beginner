/*

 *     Rex
 */

package JavaBasic.inheritance;

/**
 *
 * @author Regis
 */
class Person{
  protected  String name;
   protected int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        
    }
}
class Student extends Person{
        protected int rollNo;
    public Student(String name, int age,int rollNo) {
        super(name, age);
        this.rollNo=rollNo;
    }
   
}
class Grade extends Student{
    
   protected int [] marks= new int[4];
    public Grade(String name,int age,int roll,int ... marks){
        super(name,age,roll);
        this.marks=marks;
    }
    public int calculateTotal(){
        int sum=0;
        for(int val:marks){
            sum+=val;
        }
        return sum;
        
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Grade studentsGrade = new Grade("angel",23,1,new int[]{50,60,55,48,45});
        System.out.println("Total Marks Obtained :"+studentsGrade.calculateTotal());
       
        
    }

}
