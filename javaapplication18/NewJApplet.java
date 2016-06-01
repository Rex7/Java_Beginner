/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Regis
 */
public class NewJApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        JPanel jp = new JPanel();
        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        Button b4 = new Button();
        Button b5 = new Button();
        int b=1;
        jp.setLayout(new GridLayout(5,5));
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                jp.add(new JButton("nutton"+b));
                
            }
        }
        
       
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
