/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.objectoriented;

/**
 *
 * @author Regis
 */
class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}
class Bird extends Animal{
	void fly(){
		System.out.println("I am flying");
	}
       void sing(){
        System.out.print("I am singing");
    }
}

public class InheritanceSimple1 {
      public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
    
}
