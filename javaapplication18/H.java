/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Regis
 */
public class H {
    public static void main(String...args) throws MalformedURLException
    {
        URL l= new URL("http://www.sun.com//index.html");
        System.out.println("port"+l.getPort());
    }
    
}
