/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justdemo;

public class MethodOverloading {
    public void show(){
        System.out.println("default show is called");
    }
    public void show(int main){
        System.out.println("int called "+main);
    }
    public static void main(String[] args) {
       MethodOverloading s = new MethodOverloading();;
       s.show();
       s.show(233);
    }
}
