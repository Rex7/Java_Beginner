/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExternlPst;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JComboBox;

/**
 *
 * @author Regis
 */
class Demos extends JFrame implements ActionListener
{JComboBox jc ;
    
    public Demos()
    {
   Container cp = getContentPane();
  jc = new JComboBox();
 jc.addItem("regis");
 jc.addItem("kat");
 jc.addActionListener(this);
add(jc);
    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("selected "+jc.getSelectedItem());   }
 
 
   
   
}
public class JCombo {
    public static void main(String[] args) {
        Demos s = new Demos();
        s.setVisible(true);
        s.setSize(300, 250);
    }
    
    
}
