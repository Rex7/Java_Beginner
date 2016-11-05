/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditorProgram;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Regis
 */
public class FocusDemo {
    public static void main(String[] args) {
       new MainClass(); 
    }
    
}
class MainClass extends javax.swing.JFrame{
    JTextField text,pass;
    JButton submit;
    String username,password;
    int count=0;
    int window_state;
    
    public MainClass(){
        text = new JTextField(20);
        pass = new JTextField(20);
        submit = new JButton("Login");
        this.
        addWindowListener(new WindowAdapter(){

         
           

            @Override
            public void windowDeactivated(WindowEvent e) {
                window_state=12;
                System.out.println("Windows deactived");
               
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Windows Activiated");
                text.requestFocus();
            }

          
         

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Windows opened");
   text.requestFocus();            }

           
            
        });
        addMouseMotionListener(new MouseAdapter( ){

            @Override
            public void mouseExited(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
              text.requestFocus();
            }
            
        });
        text.addFocusListener(new FocusListener(){

            @Override
            public void focusGained(FocusEvent e) {
                text.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(text.getText().isEmpty()&&!(window_state==12)){
                    JOptionPane.showMessageDialog(rootPane,"Enter Something it cant be null"+window_state);
                    text.requestFocus();
                    System.out.println("Windows status = "+window_state);
                }
            }
            
        });
        setLayout(new FlowLayout());
        submit.addActionListener(new ActionListener(){
            
        @Override
        public void actionPerformed(ActionEvent e){
            count++;
            if(count>=3){
                submit.setEnabled(false);
                text.setText("");
                pass.setText("");
                JOptionPane.showMessageDialog(rootPane, "Try Limit Exceeded");
            }
            else{
           username = text.getText();
           password=pass.getText();
           if(username.equals("regis")&&password.equals("rex9821572187")){
               JOptionPane.showMessageDialog(rootPane, "Wronge username or password\nTry Again");
               
           }
            }
           
        }
        
        });
        add(text);
        add(pass);
        add(submit);
        setSize(350,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
