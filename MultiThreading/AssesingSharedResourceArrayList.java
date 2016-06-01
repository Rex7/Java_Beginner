/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;




import java.util.ArrayList;


class Source {

    private final ArrayList arraylist = new ArrayList();

    public synchronized void writeData(int s) {
        arraylist.add(s);
    }

    public void displayElement() {
        System.out.println("ArrayListElement:" + arraylist);
    }

}

class ThreadWrite extends Thread {

    Source source;
    int data;

    public ThreadWrite(Source source, int data) {
        this.source = source;
        this.data = data;
    }

    @Override
    public void run() {
        source.writeData(data);
    }

}

class ThreadWrite2 extends Thread {

    Source source;
    int data;

    public ThreadWrite2(Source source, int data) {
        this.source = source;
        this.data = data;
    }

    @Override
    public void run() {
        source.writeData(data);
    }

}

class Show extends Thread {

    Source s;

    public Show(Source s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.displayElement();
    }
}




public class AssesingSharedResourceArrayList {
    
    public static void main(String[] args) {
        Source s = new Source();
        ThreadWrite s1 = new ThreadWrite(s,55);
         ThreadWrite s2 = new ThreadWrite(s,599);
         Show ss = new Show(s);
         
         s1.start();
         s2.start();
         ss.start();
    }

    
}
