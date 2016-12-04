/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JustSimpleProgram;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;;
/**
 *
 * @author Regis
 */
class FrameS extends Frame 
{
    JButton btn;
    public FrameS(String title )
    {
          super(title);
          btn= new JButton("Click me for a secret message");
          btn.addActionListener(new ActionListener()
          {
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 JOptionPane.showMessageDialog(null,"you clicked me"+e.getID());
                 JOptionPane.showMessageDialog(null,"you clicked me"+e.getActionCommand());
                 
             }
          });
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        add(btn);
      
    }
}
public class FrameDemo {
    public static void main(String[] args) {
        FrameS s = new FrameS("WhatsApp");
        s.setVisible(true);
        s.setSize(300,300);
    }
    
}
