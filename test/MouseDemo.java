package test;


import java.awt.FlowLayout;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Regis
 */
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
class Rex extends JFrame 
{
   JLabel l;
   
    public Rex()
    {
        l=new JLabel("event");
        addMouseListener(new MouseAdapter()
        {
           

            @Override
            public void mouseDragged(MouseEvent e) {
                l.setText("mouse dragged");
             
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                 l.setText("x"+e.getX()+"y"+e.getY());
            }
            
        });
        setLayout(new FlowLayout());
        add(l);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class MouseDemo {
    public static void main(String[] args) {
        new Rex();
    }
   
    
}
