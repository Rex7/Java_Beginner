/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JustSimpleProgram;

import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JScrollPane;

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
       Container c = getContentPane();
       JScrollPane sp = new JScrollPane();
    }

    // TODO overwrite start(), stop() and destroy() methods
}
