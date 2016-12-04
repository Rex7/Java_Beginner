/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JustSimpleProgram;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Regis
 */
public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame s = new JFrame("regis");
JButton b1 = new JButton("north");
JButton b2 = new JButton("west");
JButton b3 = new JButton("south");
JButton b4 = new JButton("east");
JButton b5 = new JButton("center");

s.getContentPane().add(b1,BorderLayout.NORTH);
s.getContentPane().add(b2,BorderLayout.WEST);
s.getContentPane().add(b3,BorderLayout.SOUTH);s.getContentPane().add(b4,BorderLayout.EAST);s.getContentPane().add(b5,BorderLayout.CENTER);
s.setSize(300, 350);



s.setVisible(true);
       
    }
    
}
