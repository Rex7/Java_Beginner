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

class BiCycle {

    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {

    @Override
    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is " + temp);
    }

}

public class MethodOverriding2 {

    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }

}
